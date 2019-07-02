package com.capinfo.dcxm.dmonitor.controller;

import com.capinfo.dcxm.dmonitor.dao.YesswCaseInfoDao;
import com.capinfo.dcxm.dmonitor.entity.YesswCaseInfo;
import com.capinfo.dcxm.dmonitor.service.CaseCountService;
import com.capinfo.dcxm.dmonitor.utils.ResultData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/caseapi")
public class YesswController {

    @Autowired
    private YesswCaseInfoDao yesswCaseInfoDao;
    @Autowired
    private CaseCountService caseCountService;


    /**
     * 抓取12345案件
     * @param request
     * @return
     */
    @RequestMapping(value = "yesswCaseList")
    public ResultData yesswCaseList(HttpServletRequest request) {

        String filingBeginTime = request.getParameter("filingBeginTime");
        String filingOverTime = request.getParameter("filingOverTime");
        String grabTime = request.getParameter("grabTime");

        List<YesswCaseInfo> list = new ArrayList<YesswCaseInfo>();
        if (StringUtils.isNotBlank(filingBeginTime) && StringUtils.isNotBlank(filingOverTime)) {
            list = yesswCaseInfoDao.findByYesswCreatetimeAfterAndYesswCreatetimeBefore(filingBeginTime, filingOverTime);
        } else {
            list = yesswCaseInfoDao.findAll();
        }
        ResultData result = new ResultData();
        result.setFlag(true);
        result.setMsg("success");
        result.setData(list);
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
        ResultData result = new ResultData();
        try {
            caseCountService.saveYesswCase(filingBeginTime, filingOverTime, caseNum);
            result.setFlag(true);
            result.setMsg("success");
        } catch (Exception e) {
            e.printStackTrace();
            result.setFlag(false);
            result.setMsg("fail");
        }
        return result;
    }


    @RequestMapping(value = "getDetial")
    public ResultData getDetial(HttpServletRequest request) {
        String id = request.getParameter("id");
        //YesswCaseInfo caseInfo = yesswCaseInfoDao.getOne(id);
        Optional<YesswCaseInfo> info = yesswCaseInfoDao.findById(id);
        YesswCaseInfo yesswCaseInfo = info.get();
        ResultData result = new ResultData();
        result.setFlag(true);
        result.setMsg("success");
        result.setData(yesswCaseInfo);
        return result;
    }




}
