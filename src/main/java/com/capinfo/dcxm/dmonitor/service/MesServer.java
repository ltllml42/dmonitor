package com.capinfo.dcxm.dmonitor.service;

import com.alibaba.fastjson.JSON;
import com.capinfo.dcxm.dmonitor.utils.CaseCount;
import com.capinfo.dcxm.dmonitor.utils.Constant;
import com.capinfo.dcxm.dmonitor.utils.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;

/**
 * @ClassName MesServer
 * @Description TODO 用于前台打入消息
 * @Author 消魂钉
 * @Date 6/18 0018 10:43
 */
@Controller
public class MesServer {

    @Autowired
    private SimpleMessageService simpleMessageService;
    @Autowired
    private CaseCountService caseCountService;

    /*@Scheduled(fixedRate = 1000)
    public void information() {
        simpleMessageService.sendTopicMessage("/topic/callback","测试");
    }*/



}
