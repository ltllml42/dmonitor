package com.capinfo.dcxm.dmonitor.controller;

import com.capinfo.dcxm.dmonitor.service.YerssService;
import com.capinfo.dcxm.dmonitor.utils.ResultData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/caseapi")
public class YesswController {
    private final static Logger logger=LoggerFactory.getLogger(YesswController.class);
    @Autowired
    private YerssService yerssService;

    /**
     * 抓取12345案件
     * @param capYesswCase
     * @param request
     * @return
     */
    /*@RequestMapping(value = "yesswCaseList")
    public ResultData yesswCaseList(CapYesswCase capYesswCase, HttpServletRequest request) {

        ResultData result = new ResultData();
        result.setFlag(true);
        result.setMsg("success");
        return result;
    }*/

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


}
