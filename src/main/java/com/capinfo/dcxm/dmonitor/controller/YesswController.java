package com.capinfo.dcxm.dmonitor.controller;

import com.capinfo.dcxm.dmonitor.utils.ResultData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/caseapi")
public class YesswController {


    /**
     * 抓取12345案件
     * @param capYesswCase
     * @param request
     * @return
     */
    @RequestMapping(value = "yesswCaseList")
    public ResultData yesswCaseList(CapYesswCase capYesswCase, HttpServletRequest request) {

        ResultData result = new ResultData();
        result.setFlag(true);
        result.setMsg("success");
        return result;
    }


}
