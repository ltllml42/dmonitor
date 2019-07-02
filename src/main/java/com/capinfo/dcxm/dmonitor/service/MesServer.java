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

    /**
     * 这里可能就15分钟同步一次。可能再写一个定时器，每隔几秒或几分钟查一次数
     */
    //@Scheduled(fixedRate = 10000)
    public void getInfo() {

        ResultData result = new ResultData();
        //去12345网站上按对应条件获取数据
        try {
            //HttpLogin.getYesswData();
            caseCountService.saveYesswCase();
            result.setFlag(true);
            result.setMsg("获取信息成功");
            CaseCount count = caseCountService.getCount(Constant.TYPE_YESSW, null);
            result.setData(count);
            //simpleMessageService.sendTopicMessage("/topic/callback", JSON.toJSONString(result));
        } catch (Exception e) {
            e.printStackTrace();
            //这里可能需要记录日志
            result.setFlag(false);
            result.setMsg("获取信息失败");
            //simpleMessageService.sendTopicMessage("/topic/callback","测试");
        }

    }


    public void sendInfo() {

    }



}
