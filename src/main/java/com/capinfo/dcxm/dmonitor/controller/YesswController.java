package com.capinfo.dcxm.dmonitor.controller;

import com.capinfo.dcxm.dmonitor.dao.YesswCaseInfoDao;
import com.capinfo.dcxm.dmonitor.entity.YesswCaseInfo;
import com.capinfo.dcxm.dmonitor.service.CaseCountService;
import com.capinfo.dcxm.dmonitor.utils.CaseCount;
import com.capinfo.dcxm.dmonitor.utils.Constant;
import com.capinfo.dcxm.dmonitor.utils.ResultData;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
        CaseCount finishCount = caseCountService.getCount(Constant.TYPE_FINISH, null);
        caseCountList.add(finishCount);
        //推送城管系统后未能获取到城管案件编号
        CaseCount cityNoNumberCount = caseCountService.getCount(Constant.TYPE_CITYNUMBER_WARNING, null);
        caseCountList.add(cityNoNumberCount);
        //案件快到截止日期
        CaseCount deadtimeCount = caseCountService.getCount(Constant.TYPE_DEADTIME, null);
        caseCountList.add(deadtimeCount);

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




}
