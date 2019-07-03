package com.capinfo.dcxm.dmonitor.service;

import com.alibaba.fastjson.JSON;
import com.capinfo.dcxm.dmonitor.dao.CapBusiRecordDao;
import com.capinfo.dcxm.dmonitor.dao.YesswCaseInfoDao;
import com.capinfo.dcxm.dmonitor.entity.*;
import com.capinfo.dcxm.dmonitor.utils.*;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.capinfo.dcxm.dmonitor.utils.Constant.YESSW_STATUS_FINISH;

@Service
public class CaseCountService {

    @Autowired
    private YesswCaseInfoDao yesswCaseInfoDao;
    @Autowired
    private CapBusiRecordDao capBusiRecordDao;
    @Autowired
    private SimpleMessageService simpleMessageService;



    private static final String url="http://172.26.54.61/admin/api/order/list";
    /**
     * 统计案件数量
     * @param type  要统计的案件类型
     * @return
     */
    public CaseCount getCount(String type, String way) {
        //如果是反查的时候用这个方法，把查到的list也放进去
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
        /*if (StringUtils.isNotBlank(starttime)) {
            queryParam.setBeginCallTime(starttime);
        }
        if (StringUtils.isNotBlank(endtime)) {
            queryParam.setEndCallTime(endtime);
        }
        if (StringUtils.isNotBlank(caseNum)) {
            queryParam.setOrderId(caseNum);
        }*/
        if (StringUtils.isNotBlank(caseNum)) {
            queryParam.setOrderId(caseNum);
            if (StringUtils.isNotBlank(starttime)) {
                queryParam.setBeginCallTime(starttime);
            }
            if (StringUtils.isNotBlank(endtime)) {
                queryParam.setEndCallTime(endtime);
            }
        } else {
            String beginCalltime = StringUtils.isBlank(starttime)?sdf.format(nowDate)+ " 08:00:00":starttime;
            String endCalltime = StringUtils.isBlank(endtime)?sdf.format(nowDate)+ " 23:00:00":endtime;
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
            List<YesswCaseInfo> caseList = yesswCaseInfoDao.findByYesswStatusNot(Constant.YESSW_STATUS_FINISH);
            //判断出来需要操作update或者insert的数据，放到这个新的集合里。统一一起操作数据库
            List<YesswCaseInfo> batchList = new ArrayList<YesswCaseInfo>();
            for (YesswCaseInfo yesswCaseInfo : infoList) {
                boolean flag = false;
                for (YesswCaseInfo caseInfo : caseList) {
                    if (yesswCaseInfo.getYesswNumber().equals(caseInfo.getYesswNumber()) && yesswCaseInfo.getYesswCreatetime().equals(caseInfo.getYesswCreatetime())) {
                        //说明在表里已经存在抓取的数据了
                        flag = true;
                        yesswCaseInfo.setId(caseInfo.getId());
                        break;
                    }
                }
                //应该都需要查一下这条案件在96010中的案件号、状态，数字政通中的案件号、状态
                if (flag) {
                    try {
                        getRecordInfoCityInfo(yesswCaseInfo);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    //yesswCaseInfoDao.save(yesswCaseInfo);
                    batchList.add(yesswCaseInfo);
                } else {
                    //如果是没结案的才往数据库里插
                    if (!Constant.YESSW_STATUS_FINISH.equals(yesswCaseInfo.getYesswStatus())) {
                        try {
                            getRecordInfoCityInfo(yesswCaseInfo);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        yesswCaseInfo.setId(UUID.randomUUID().toString().replaceAll("-",""));
                        //yesswCaseInfoDao.save(yesswCaseInfo);
                        batchList.add(yesswCaseInfo);
                    }

                }
            }
            yesswCaseInfoDao.saveAll(batchList);
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
        if (bean.getContent().length()>2000) {
            info.setContent(bean.getContent().substring(0,2000));
        } else {
            info.setContent(bean.getContent());
        }

        return info;
    }

    /**
     * 根据12345案件号查询96010的工单号、状态，调取接口查询数字政通中的案件号、状态
     * @param yesswCaseInfo
     */
    private void getRecordInfoCityInfo(YesswCaseInfo yesswCaseInfo) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        List<CapBusiRecord> recordList = capBusiRecordDao.findByYesswOrderId(yesswCaseInfo.getYesswNumber());
        if (recordList != null && !recordList.isEmpty()) {
            CapBusiRecord record = recordList.get(0);
            yesswCaseInfo.setRecordNumber(record.getRecordNumber());
            yesswCaseInfo.setRecordCreatetime(sdf.format(record.getGatheringTime()));
            yesswCaseInfo.setRecordStatus(record.getNowState());
            yesswCaseInfo.setRecordTaskStatus(record.getTaskStatus());
            yesswCaseInfo.setRecordDeadtime(sdf.format(record.getDeadLineTime()));
            yesswCaseInfo.setCityNumber(record.getIndividaulAtt5());
            //yesswCaseInfo.setCityStatus(record.get);
        }


        if (StringUtils.isBlank(yesswCaseInfo.getCityNumber())) {
            //查一下数字政通的接口，查城管任务号，状态
        }
        yesswCaseInfo.setCreateTime(sdf.format(new Date()));
    }


    /**
     * websocket发送信息
     */
    @Scheduled(fixedRate = 10000)
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
    }


    /**
     * 分页
     * @param currentPage
     * @param filingBeginTime
     * @param filingOverTime
     * @return
     */
    public Page<YesswCaseInfo> findPage(int currentPage, String filingBeginTime, String filingOverTime, String yesswNumber) {

        Sort sort = new Sort(Sort.Direction.DESC,"createTime"); //创建时间降序排序
        Pageable pageable = new PageRequest(currentPage,Constant.PAGECOUNT,sort);
        if (StringUtils.isNotBlank(yesswNumber)) {
            return yesswCaseInfoDao.findByYesswNumber(yesswNumber, pageable);
        }
        if (StringUtils.isNotBlank(filingBeginTime) && StringUtils.isNotBlank(filingOverTime)) {
            return yesswCaseInfoDao.findFirst20ByYesswCreatetimeAfterAndYesswCreatetimeBefore(filingBeginTime, filingOverTime, pageable);
        } else {
            return yesswCaseInfoDao.findAll(pageable);
        }
    }


}
