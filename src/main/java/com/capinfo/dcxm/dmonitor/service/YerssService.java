package com.capinfo.dcxm.dmonitor.service;

import com.capinfo.dcxm.dmonitor.client.YerSsWClient;
import com.capinfo.dcxm.dmonitor.dao.CapBusiRecordDao;
import com.capinfo.dcxm.dmonitor.entity.CapBusiRecord;
import com.capinfo.dcxm.dmonitor.enums.StreeAccountEnum;
import com.capinfo.dcxm.dmonitor.factory.YerssClientFactory;
import com.capinfo.dcxm.dmonitor.utils.ResultData;
import com.capinfo.dcxm.dmonitor.yerss.A5ProcessInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YerssService {
    @Autowired
    private CapBusiRecordDao capBusiRecordDao;
    public ResultData replyCase(String recordNumber, String content, String operateType) {
        List<CapBusiRecord> list = capBusiRecordDao.findByRecordNumber(recordNumber);
        if(list==null||list.size()<=0){
            return ResultData.error("此案件号存在问题,请检查后再试");
        }
        CapBusiRecord capBusiRecord=list.get(0);
        StreeAccountEnum streeAccountEnum = StreeAccountEnum.getByUnitId(capBusiRecord.getDispatchUnit());
        YerSsWClient client = YerssClientFactory.getClient(streeAccountEnum.getDelegateUUID(), streeAccountEnum.getAgentID(), streeAccountEnum.getOrderUnitID());
//        YerSsWClient yerSsWClient=new YerSsWClient();
//        yerSsWClient.setAgentID(agentID);
//        yerSsWClient.setDelegateUUID(delegateUUID);
//        yerSsWClient.setOrderUnitID(orderUnitID);
//        A5ProcessInfo a5ProcessInfo = new A5ProcessInfo();
//        a5ProcessInfo.setID("22888004");
//        a5ProcessInfo.setOrderUnitID("263");
//        a5ProcessInfo.setHandleResult("2019061398642");// 填写返回结果
//        a5ProcessInfo.setReason("经核实，此案件由于技术对接原因，区平台将案件排至东华门街道，请市级工作人员重派此案件至天坛街道。");
//
//        System.out.println(yerSsWClient.rejectSignOrder(a5ProcessInfo));
         boolean flag=false;
         if("0".equals(operateType)){
             flag=doRejectSignOrder(client,content,capBusiRecord);
         }else if("1".equals(operateType)){
             flag=doRejectOrder(client,content,capBusiRecord);
         }else if("2".equals(operateType)){
             flag=doEndCae(client,content,capBusiRecord);
         }else{
             return ResultData.error("操作类型有误");
         }
        if(flag){
            return ResultData.sucess("操作成功");
        }else{
            return ResultData.error("12345接口返回失败");
        }

    }

    private boolean doEndCae(YerSsWClient client, String content, CapBusiRecord capBusiRecord) {
        A5ProcessInfo  a5ProcessInfo=new A5ProcessInfo();
        a5ProcessInfo.setHandleResult(content);
        a5ProcessInfo.setID(capBusiRecord.getCaseNumber());
        a5ProcessInfo.setOrderUnitID(client.getOrderUnitID());
        boolean flag=client.A5ReplyResult(a5ProcessInfo);
        return flag;
    }

    private boolean doRejectOrder(YerSsWClient client, String content, CapBusiRecord capBusiRecord) {
        A5ProcessInfo a5ProcessInfo = new A5ProcessInfo();
        a5ProcessInfo.setID(capBusiRecord.getCaseNumber());
        a5ProcessInfo.setOrderUnitID(client.getOrderUnitID());
        a5ProcessInfo.setHandleResult(capBusiRecord.getRecordNumber());// 填写返回结果
        a5ProcessInfo.setReason(content);
        boolean flag = client.rejectOrder(a5ProcessInfo);
        return flag;
    }

    private boolean doRejectSignOrder(YerSsWClient client, String content, CapBusiRecord capBusiRecord) {
        A5ProcessInfo a5ProcessInfo = new A5ProcessInfo();
        a5ProcessInfo.setID(capBusiRecord.getCaseNumber());
        a5ProcessInfo.setOrderUnitID(client.getOrderUnitID());
        a5ProcessInfo.setHandleResult(capBusiRecord.getRecordNumber());// 填写返回结果
        a5ProcessInfo.setReason(content);
        boolean flag = client.rejectSignOrder(a5ProcessInfo);
        return flag;
    }
}
