package com.capinfo.dcxm.dmonitor.service;

import com.alibaba.fastjson.JSON;
import com.capinfo.dcxm.dmonitor.dao.CapBusiRecordDao;
import com.capinfo.dcxm.dmonitor.dao.CapObtainRecordDao;
import com.capinfo.dcxm.dmonitor.dao.QueryDaoImpl;
import com.capinfo.dcxm.dmonitor.dao.YesswCaseInfoDao;
import com.capinfo.dcxm.dmonitor.entity.*;
import com.capinfo.dcxm.dmonitor.utils.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


@Service
public class CaseCountService {

    @Autowired
    private YesswCaseInfoDao yesswCaseInfoDao;
    @Autowired
    private CapBusiRecordDao capBusiRecordDao;
    @Autowired
    private CapObtainRecordDao capObtainRecordDao;
    @Autowired
    private QueryDaoImpl queryDaoImpl;
    @Autowired
    private SimpleMessageService simpleMessageService;



    private static final String url="http://172.26.54.61/admin/api/order/list";
    /**
     * 统计案件数量
     * @param type  要统计的案件类型
     * @return
     */
    public CaseCount getCount(String type, String way) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //如果是反查的时候用这个方法，把查到的list也放进去    way=='check'的时候
        CaseCount count = new CaseCount();
        switch (type) {
            case Constant.TYPE_YESSW:
                count.setType(Constant.TYPE_YESSW);
                List<YesswCaseInfo> yesswNotFinish = yesswCaseInfoDao.findByYesswStatusNot(Constant.YESSW_STATUS_FINISH);
                count.setCount(yesswNotFinish.size()+"");
                if ("check".equals(way)) {
                    count.setCaseList(yesswNotFinish);
                }
                break;
            case Constant.TYPE_RECORD:
                count.setType(Constant.TYPE_RECORD);
                List<YesswCaseInfo> recordNotFinish = yesswCaseInfoDao.findByYesswStatusNot(Constant.YESSW_STATUS_FINISH);
                count.setCount(recordNotFinish.size()+"");
                if ("check".equals(way)) {
                    count.setCaseList(recordNotFinish);
                }
                break;
            case Constant.TYPE_CITY:
                count.setType(Constant.TYPE_CITY);
                count.setCount(0+"");
                break;
            case Constant.TYPE_FINISH:
                count.setType(Constant.TYPE_FINISH);
                List<YesswCaseInfo> finish = yesswCaseInfoDao.findByYesswStatus(Constant.YESSW_STATUS_FINISH);
                count.setCount(finish.size()+"");
                if ("check".equals(way)) {
                    count.setCaseList(finish);
                }
                break;
            case Constant.TYPE_CITYNUMBER_WARNING:
                //推送城管系统后未能获取到城管案件编号
                count.setType(Constant.TYPE_CITYNUMBER_WARNING);
                List<YesswCaseInfo> list = yesswCaseInfoDao.findByRecordStatusAndRecordTaskStatusAndCityNumberNull("核实结案", "等待结案");
                count.setCount(list.size()+"");
                if ("check".equals(way)) {
                    count.setCaseList(list);
                }
                break;
            case Constant.TYPE_DEADTIME:
                //案件快到截止日期
                count.setType(Constant.TYPE_DEADTIME);
                String deadtime = sdf.format(DateUtils.getAfterDate(new Date(), 2));
                List<YesswCaseInfo> deadtimeList = yesswCaseInfoDao.findByRecordDeadtimeBefore(deadtime);
                count.setCount(deadtimeList.size()+"");
                if ("check".equals(way)) {
                    count.setCaseList(deadtimeList);
                }
                break;
            case Constant.TYPE_YESSW_EXCEPTION:
                count.setType(Constant.TYPE_YESSW_EXCEPTION);
                //需要当前时间2小时以后的
                //0条数据为异常，不为0则正常
                Date date = DateUtils.getBeforeHourse(new Date(), 2);
                List<CapObtainRecord> yesswExceptionList = capObtainRecordDao.findByObtainTimeAfter(date);
                count.setCount(yesswExceptionList.size()+"");
                break;
            case Constant.TYPE_YESSWFINISH_NOTICE:
                //12345已经结案，未发通知
                count.setType(Constant.TYPE_YESSWFINISH_NOTICE);
                List<YesswCaseInfo> noticeList = queryDaoImpl.executeNoticeQuery(QueryDaoImpl.noticeQueryStr);
                count.setCount(noticeList.size()+"");
                if ("check".equals(way)) {
                    count.setCaseList(noticeList);
                }
                break;
            case Constant.TYPE_YESSWHUITUI_EXCEPTION:
                count.setType(Constant.TYPE_YESSWHUITUI_EXCEPTION);
                List<YesswCaseInfo> yesswhuituiList = queryDaoImpl.executeHuituiExceptionQuery(QueryDaoImpl.yesswHtuituiExceptionQueryStr);
                count.setCount(yesswhuituiList.size()+"");
                if ("check".equals(way)) {
                    count.setCaseList(yesswhuituiList);
                }
                break;
        }
        return count;
    }


    /**
     * 暂时这样写，拿当天一个时间段内的数据
     * 如果这条数据没在表里，看案件的状态是未结案的就存到表里
     * 如果这条数据是已经结案的，查一下在表里有没有这条数据，如果有把状态改成已结案的
     * @return
     */
    public void saveYesswCase(String starttime, String endtime, String caseNum) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdftime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date nowDate = new Date();
        String beginStarttime = sdf.format(DateUtils.getBeforeDate(nowDate, 30)) + " 00:00:00";
        String endStarttime = sdf.format(nowDate) + " 20:00:00";

        //String beginCalltime = StringUtils.isBlank(starttime)?sdf.format(nowDate)+ " 08:00:00":starttime;
        //String endCalltime = StringUtils.isBlank(endtime)?sdf.format(nowDate)+ " 23:00:00":endtime;
        int count = 0;
        Integer startPage=1;
        Integer totalPage=1;
        QueryParam queryParam=new QueryParam();
        queryParam.setBeginStartTime(beginStarttime);
        queryParam.setEndStartTime(endStarttime);
        String beginCalltime = StringUtils.isBlank(starttime)?sdf.format(nowDate)+ " 08:00:00":starttime;
        String endCalltime = StringUtils.isBlank(endtime)?sdf.format(nowDate)+ " 23:00:00":endtime;
        if (StringUtils.isNotBlank(caseNum)) {
            queryParam.setOrderId(caseNum);
            if (StringUtils.isNotBlank(starttime)) {
                queryParam.setBeginCallTime(starttime);
            }
            if (StringUtils.isNotBlank(endtime)) {
                queryParam.setEndCallTime(endtime);
            }
        } else {

            queryParam.setBeginCallTime(beginCalltime);
            queryParam.setEndCallTime(endCalltime);
        }
        queryParam.setPageNo(startPage);
        queryParam.setPageSize(100);

        try {
            List<YesswCaseInfo> infoList = new ArrayList<YesswCaseInfo>();
            while(totalPage>=startPage){
                queryParam.setPageNo(startPage);
                String param=JsonUtil.objectToJsonStr(queryParam);
                String result=HttpUtils.sendPost12345(param, url, "");
                Result r=JsonUtil.jsonStrToPo(result, Result.class);
                DataBean dataBean=r.getData();
                totalPage=dataBean.getTotalPage();
                List<ListBean> list=dataBean.getList();
                for(ListBean bean:list ){
                    //CapYerssRecord capYerssRecord=changeToReocrd(l);
                    //capYerssRecordDao.save(capYerssRecord);
//					map.put(l.getOrderUnitName(), map.get(l.getOrderUnitName())==null?1:map.get(l.getOrderUnitName())+1);
                    YesswCaseInfo info = changeInfo(bean);
                    infoList.add(info);
                }
                startPage++;
            }
            //List<YesswCaseInfo> caseList = yesswCaseInfoDao.findByYesswStatusNot(Constant.YESSW_STATUS_FINISH);
            List<YesswCaseInfo> caseList = yesswCaseInfoDao.findByYesswStatusNotAndYesswCreatetimeAfterAndYesswCreatetimeBefore(Constant.YESSW_STATUS_FINISH, beginCalltime, endCalltime);

            //这里需要in出来工单表里infoList中的12345工单号包含的数据
            List<String> yesswOrderIdList = new ArrayList<String>();
            for (YesswCaseInfo yesswCaseInfo : infoList) {
                yesswOrderIdList.add(yesswCaseInfo.getYesswNumber());
            }
            List<CapBusiRecord> recordList = capBusiRecordDao.findByYesswOrderIdIn(yesswOrderIdList);
            //把工单表查出来的字段都放到infoList里
            setRecordInfo(infoList, recordList);
            //判断出来需要操作update或者insert的数据，放到这个新的集合里。统一一起操作数据库
            List<YesswCaseInfo> batchList = new ArrayList<YesswCaseInfo>();
            for (YesswCaseInfo yesswCaseInfo : infoList) {
                boolean flag = false;
                for (YesswCaseInfo caseInfo : caseList) {
                    if (yesswCaseInfo.getYesswNumber().equals(caseInfo.getYesswNumber()) && yesswCaseInfo.getYesswCreatetime().equals(caseInfo.getYesswCreatetime())) {
                        //说明在表里已经存在抓取的数据了
                        flag = true;
                        yesswCaseInfo.setId(caseInfo.getId());
                        yesswCaseInfo.setCreateTime(StringUtils.isBlank(caseInfo.getCreateTime())?sdftime.format(new Date()):caseInfo.getCreateTime());
                        break;
                    }
                }
                //应该都需要查一下这条案件在96010中的案件号、状态，数字政通中的案件号、状态
                if (flag) {
                    batchList.add(yesswCaseInfo);
                } else {
                    //如果是没结案的才往数据库里插
                    /*if (!Constant.YESSW_STATUS_FINISH.equals(yesswCaseInfo.getYesswStatus())) {
                        yesswCaseInfo.setId(UUID.randomUUID().toString().replaceAll("-",""));
                        yesswCaseInfo.setCreateTime(sdftime.format(new Date()));
                        batchList.add(yesswCaseInfo);
                    }*/
                    yesswCaseInfo.setId(UUID.randomUUID().toString().replaceAll("-",""));
                    yesswCaseInfo.setCreateTime(sdftime.format(new Date()));
                    batchList.add(yesswCaseInfo);
                }
            }
            yesswCaseInfoDao.saveAll(batchList);
            //yesswCaseInfoDao.batchSave(batchList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private YesswCaseInfo changeInfo(ListBean bean) {
        YesswCaseInfo info = new YesswCaseInfo();
        info.setYesswNumber(bean.getOrderId());
        //info.setYesswSendarea(bean.getOrderUnitName());

        info.setYesswCreatetime(bean.getStartTime());
        info.setYesswStatus(bean.getHandleName());
        info.setYesswSendarea(bean.getDistrictName());
        /*if (bean.getContent().length()>2000) {
            info.setContent(bean.getContent().substring(0,2000));
        } else {
            info.setContent(bean.getContent());
        }*/
        int length = bean.getContent().length();
        if (length > 800) {
            info.setContent(bean.getContent().substring(0,800));
        } else {
            info.setContent(bean.getContent());
        }
        return info;
    }



    public void setRecordInfo(List<YesswCaseInfo> yesswCaseInfoList, List<CapBusiRecord> recordList) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (YesswCaseInfo yesswCaseInfo : yesswCaseInfoList) {
            for (CapBusiRecord capBusiRecord : recordList) {
                //yesswCaseInfo.setCreateTime(sdf.format(new Date()));
                if (yesswCaseInfo.getYesswNumber().equals(capBusiRecord.getYesswOrderId()) && yesswCaseInfo.getYesswCreatetime().equals(capBusiRecord.getYessStartTime())) {
                    yesswCaseInfo.setRecordNumber(capBusiRecord.getRecordNumber());
                    yesswCaseInfo.setRecordCreatetime(sdf.format(capBusiRecord.getGatheringTime()));
                    yesswCaseInfo.setRecordStatus(capBusiRecord.getNowState());
                    yesswCaseInfo.setRecordTaskStatus(capBusiRecord.getTaskStatus());
                    yesswCaseInfo.setRecordDeadtime(sdf.format(capBusiRecord.getDeadLineTime()));
                    yesswCaseInfo.setCityNumber(capBusiRecord.getIndividaulAtt5());
                    break;
                }

            }
        }
        //在这下边可能要加上数字政通的接口，传入一个工单号的集合，得到对应的数据，把城管的工单状态在这里放回每个对应的对象里



    }




    /**
     * websocket发送信息
     */
    @Scheduled(fixedRate = 20000)
    public void getInfo() {

        //统计12345未结案的案件
        ResultData result = new ResultData();
        result.setFlag(true);
        result.setMsg("success");
        CaseCount yesswCount = getCount(Constant.TYPE_YESSW, null);
        result.setData(yesswCount);
        simpleMessageService.sendTopicMessage("/topic/callback", JSON.toJSONString(result));
        //96010的未结案数。暂时和12345的统一。需要新加一个字段判断是否结案
        CaseCount recordCount = new CaseCount();
        recordCount.setType(Constant.TYPE_RECORD);
        recordCount.setCount(yesswCount.getCount());
        result.setData(recordCount);
        simpleMessageService.sendTopicMessage("/topic/callback", JSON.toJSONString(result));


        //已结案的
        CaseCount finishCount = getCount(Constant.TYPE_FINISH, null);
        result.setData(finishCount);
        simpleMessageService.sendTopicMessage("/topic/callback", JSON.toJSONString(result));

        //推送城管系统后未能获取到城管案件编号
        CaseCount cityNoNumberCount = getCount(Constant.TYPE_CITYNUMBER_WARNING, null);
        result.setData(cityNoNumberCount);
        simpleMessageService.sendTopicMessage("/topic/callback", JSON.toJSONString(result));

        //案件快到截止日期
        CaseCount deadtimeCount = getCount(Constant.TYPE_DEADTIME, null);
        result.setData(deadtimeCount);
        simpleMessageService.sendTopicMessage("/topic/callback", JSON.toJSONString(result));

        //12345接口异常（或者两个小时之内没有数据）
        CaseCount yesswExceptionCount = getCount(Constant.TYPE_YESSW_EXCEPTION, null);
        result.setData(yesswExceptionCount);
        simpleMessageService.sendTopicMessage("/topic/callback", JSON.toJSONString(result));
        //12345已经结案，未发通知
        CaseCount noticeCount = getCount(Constant.TYPE_YESSWFINISH_NOTICE, null);
        result.setData(noticeCount);
        simpleMessageService.sendTopicMessage("/topic/callback", JSON.toJSONString(result));
        //12345退回接口异常（回退失败）（城管推送12345接口）
        CaseCount yesswhuituiCount = getCount(Constant.TYPE_YESSWHUITUI_EXCEPTION, null);
        result.setData(yesswhuituiCount);
        simpleMessageService.sendTopicMessage("/topic/callback", JSON.toJSONString(result));

    }

    /**
     * 分页条件查询。暂时这样写，如果条件再多再改成传进来对象
     * @param currentPage
     * @return
     */
    public Page<YesswCaseInfo> findPageQuery(int currentPage, YesswCaseInfo yesswCaseInfo) {
        Sort sort = new Sort(Sort.Direction.DESC,"recordCreatetime"); //创建时间降序排序
        Pageable pageable = new PageRequest(currentPage, Constant.PAGECOUNT, sort);
        Specification<YesswCaseInfo> specification = new Specification<YesswCaseInfo>(){

            @Override
            public Predicate toPredicate(Root<YesswCaseInfo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder cb) {
                List<Predicate> list = new ArrayList<Predicate>();
                if (StringUtils.isNotBlank(yesswCaseInfo.getYesswCreatetimeStart())) {
                    Predicate p1 = cb.greaterThanOrEqualTo(root.get("yesswCreatetime").as(String.class), yesswCaseInfo.getYesswCreatetimeStart());
                    list.add(p1);
                }
                if (StringUtils.isNotBlank(yesswCaseInfo.getYesswCreatetimeEnd())) {
                    Predicate p2 = cb.lessThanOrEqualTo(root.get("yesswCreatetime").as(String.class), yesswCaseInfo.getYesswCreatetimeEnd());
                    list.add(p2);
                }
                if (StringUtils.isNotBlank(yesswCaseInfo.getYesswNumber())) {
                    Predicate p3 = cb.equal(root.get("yesswNumber").as(String.class), yesswCaseInfo.getYesswNumber());
                    list.add(p3);
                }
                if (StringUtils.isNotBlank(yesswCaseInfo.getRecordNumber())) {
                    Predicate p4 = cb.equal(root.get("recordNumber").as(String.class), yesswCaseInfo.getRecordNumber());
                    list.add(p4);
                }
                if (list.size() == 0) {
                    return null;
                }
                return cb.and(list.toArray(new Predicate[0]));
            }
        };
        return yesswCaseInfoDao.findAll(specification, pageable);
    }





}
