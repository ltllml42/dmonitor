package com.capinfo.dcxm.dmonitor.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.TemplateExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.capinfo.dcxm.dmonitor.dao.YesswCaseInfoDao;
import com.capinfo.dcxm.dmonitor.entity.YesswCaseInfo;
import com.capinfo.dcxm.dmonitor.service.CaseCountService;
import com.capinfo.dcxm.dmonitor.service.YerssService;
import com.capinfo.dcxm.dmonitor.utils.CaseCount;
import com.capinfo.dcxm.dmonitor.utils.Constant;
import com.capinfo.dcxm.dmonitor.utils.ResultData;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

import static cn.afterturn.easypoi.excel.ExcelExportUtil.exportExcel;

@RestController
@RequestMapping(value = "/caseapi")
public class YesswController {

    @Autowired
    private YesswCaseInfoDao yesswCaseInfoDao;
    @Autowired
    private CaseCountService caseCountService;
    @Autowired
    private YerssService yerssService;
    private final static Logger logger= LoggerFactory.getLogger(YesswController.class);


    /**
     * 抓取12345案件
     * @param request
     * @return
     */
    @RequestMapping(value = "yesswCaseList")
    public ResultData yesswCaseList(YesswCaseInfo yesswCaseInfo, HttpServletRequest request) {
        String currentPage = request.getParameter("current");
        int current = StringUtils.isBlank(currentPage)?0:Integer.parseInt(currentPage)-1;
        Page<YesswCaseInfo> page = caseCountService.findPageQuery(current, yesswCaseInfo);
        ResultData result = new ResultData();
        result.setFlag(true);
        result.setMsg("success");
        result.setData(page);
        return result;
    }


    /**
     * 抓取数据
     * @return
     */
    @RequestMapping(value = "getData")
    public ResultData getData(HttpServletRequest request) {
        String caseNum = request.getParameter("caseNum");
        String filingBeginTime = request.getParameter("filingBeginTime");
        String filingOverTime = request.getParameter("filingOverTime");
        String yerssToken = request.getParameter("yerssToken");
        ResultData result = new ResultData();
        try {
            caseCountService.saveYesswCase(filingBeginTime, filingOverTime, caseNum,yerssToken);
            result.setFlag(true);
            result.setMsg("success");
        } catch (Exception e) {
            e.printStackTrace();
            result.setFlag(false);
            result.setMsg("fail");
        }
        return result;
    }

    /**
     * 定时器定时用websocket刷新页面中的统计。进入页面的时候立刻刷新一次
     */
    @RequestMapping(value = "sendInfo")
    public ResultData sendInfo() {
        ResultData result = new ResultData();
        List<CaseCount> caseCountList = new ArrayList<CaseCount>();
        CaseCount yesswCount = caseCountService.getCount(Constant.TYPE_YESSW, null);
        caseCountList.add(yesswCount);
        CaseCount recordCount = caseCountService.getCount(Constant.TYPE_RECORD, null);
        caseCountList.add(recordCount);
        CaseCount cityCount = caseCountService.getCount(Constant.TYPE_CITY, null);
        caseCountList.add(cityCount);
        CaseCount finishCount = caseCountService.getCount(Constant.TYPE_FINISH, null);
        caseCountList.add(finishCount);
        //推送城管系统后未能获取到城管案件编号
        CaseCount cityNoNumberCount = caseCountService.getCount(Constant.TYPE_CITYNUMBER_WARNING, null);
        caseCountList.add(cityNoNumberCount);
        //案件快到截止日期
        CaseCount deadtimeCount = caseCountService.getCount(Constant.TYPE_DEADTIME, null);
        caseCountList.add(deadtimeCount);
        //12345接口异常（或者两个小时之内没有数据）
        CaseCount yesswExceptionCount = caseCountService.getCount(Constant.TYPE_YESSW_EXCEPTION, null);
        caseCountList.add(yesswExceptionCount);

        CaseCount noticeCount = caseCountService.getCount(Constant.TYPE_YESSWFINISH_NOTICE, null);
        caseCountList.add(noticeCount);

        CaseCount yesswhuituiCount = caseCountService.getCount(Constant.TYPE_YESSWHUITUI_EXCEPTION, null);
        caseCountList.add(yesswhuituiCount);

        result.setFlag(true);
        result.setMsg("success");
        result.setData(caseCountList);
        return result;
    }


    /**
     * 删除
     * @param request
     * @return
     */
    @RequestMapping(value = "delInfo")
    public ResultData delInfo(HttpServletRequest request) {
        ResultData result = new ResultData();
        try {
            String id = request.getParameter("id");
            yesswCaseInfoDao.deleteById(id);
            result.setFlag(true);
            result.setMsg("success");
        } catch (Exception e) {
            e.printStackTrace();
            result.setFlag(false);
            result.setMsg("fail");
        }
        return result;
    }


    @RequestMapping(value = "replyCase")
    public ResultData yesswCaseList(String recordNumber,String content,String operateType) {
        logger.info("recordNumber is {},content is {},operateType is{}",recordNumber,content,operateType);
        return yerssService.replyCase(recordNumber,content,operateType);
//        System.out.println("steetName"+recordNumber);
//        System.out.println("content"+content);
//        System.out.println("operateType"+operateType);
//        ResultData result = new ResultData();
//        result.setFlag(true);
//        result.setMsg("success");
//        return result;
    }

    @RequestMapping(value = "againPush")
    public ResultData againPush(String recordNumber) {
        logger.info("againPush recordNumber is {}",recordNumber);
        return yerssService.againPush(recordNumber);
    }

    @RequestMapping(value = "againPushNotice")
    public ResultData againPushNotice(String recordNumber,String a5Type) {
        logger.info("againPushNotice recordNumber is {}",recordNumber);
        return yerssService.againPushNotice(recordNumber,a5Type);
    }


}
