package com.capinfo.dcxm.dmonitor.service;

import com.capinfo.dcxm.dmonitor.dao.CapBusiRecordDao;
import com.capinfo.dcxm.dmonitor.dao.YesswCaseInfoDao;
import com.capinfo.dcxm.dmonitor.entity.*;
import com.capinfo.dcxm.dmonitor.utils.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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
     * @param list     可能需要根据12345的案件数去统计96010的案件数，城管系统中的案件数
     * @return
     */
    public CaseCount getCount(String type, List<String> list) {
        CaseCount count = new CaseCount();
        if (Constant.TYPE_YESSW.equals(type)) {
            //获取12345未结案的案件，存到数据库里，然后得到数量放到对象里用websocket传回页面上
            count.setType(Constant.TYPE_YESSW);
            //count.setCount(1);
            List<YesswCaseInfo> infoList = yesswCaseInfoDao.findByYesswStatus("未结案");
            count.setCount(infoList.size());
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

        String beginCalltime = StringUtils.isBlank(starttime)?sdf.format(nowDate)+ " 08:00:00":starttime;
        String endCalltime = StringUtils.isBlank(endtime)?sdf.format(nowDate)+ " 23:00:00":endtime;
        int count = 0;
        Integer startPage=1;
        Integer totalPage=1;
        QueryParam queryParam=new QueryParam();
        /*queryParam.setBeginStartTime("2019-05-01 00:00:00");
        queryParam.setEndStartTime("2019-06-23 11:00:00");
        queryParam.setBeginCallTime("2019-04-01 00:00:00");
        queryParam.setEndCallTime("2019-06-30 00:00:00");*/
        queryParam.setBeginStartTime(beginStarttime);
        queryParam.setEndStartTime(endStarttime);
        queryParam.setBeginCallTime(beginCalltime);
        queryParam.setEndCallTime(endCalltime);
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
            List<YesswCaseInfo> caseList = yesswCaseInfoDao.findByYesswCreatetimeAfter(beginStarttime);
            for (YesswCaseInfo yesswCaseInfo : infoList) {
                boolean flag = false;
                for (YesswCaseInfo caseInfo : caseList) {
                    if (yesswCaseInfo.getYesswNumber().equals(caseInfo.getYesswNumber())) {
                        //说明在表里已经存在抓取的数据了
                        flag = true;
                        yesswCaseInfo.setId(caseInfo.getId());
                        break;
                    }
                }
                //应该都需要查一下这条案件在96010中的案件号、状态，数字政通中的案件号、状态

                //需要再改一下，改成批量保存数据的。暂时先这样写
                if (flag) {
                    //结案的时候
                    if ("".equals(yesswCaseInfo.getYesswStatus())) {
                        //这个时候把数据按现在的状态再update一下
                        try {
                            getRecordInfoCityInfo(yesswCaseInfo);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        yesswCaseInfoDao.save(yesswCaseInfo);
                    }

                } else {
                    //这个时候把数据插入到表里
                    try {
                        getRecordInfoCityInfo(yesswCaseInfo);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    yesswCaseInfo.setId(UUID.randomUUID().toString().replaceAll("-",""));
                    yesswCaseInfoDao.save(yesswCaseInfo);
                }

            }

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
    public void sendInfo() {



    }




}
