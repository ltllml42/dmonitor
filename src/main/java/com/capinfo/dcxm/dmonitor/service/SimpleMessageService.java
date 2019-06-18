package com.capinfo.dcxm.dmonitor.service;

import com.capinfo.dcxm.dmonitor.config.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class SimpleMessageService {

    @Autowired
    private SimpMessagingTemplate template;

    public void sendTopicMessage(String url,String message){
        template.convertAndSend(url,new SendMessage(message));
    }


}
