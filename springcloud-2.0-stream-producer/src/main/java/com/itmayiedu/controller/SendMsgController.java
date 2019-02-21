package com.itmayiedu.controller;

import com.itmayiedu.stream.SendMsgInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

/**
 * @version 1.0
 * @Description: 发送消息接口
 * @author: ChenRuiQing.
 * Create Time:  2019-02-21 下午 1:54
 */
@RestController
public class SendMsgController {
    @Autowired
    private SendMsgInterface sendMsgInterface;
    /**
     * 生产者流程：
     * 1、创建发送消息通道
     * 2、生产者投递
     * 3、开启绑定（结合）
     */
    @RequestMapping("/sendMsg")
    public String sendMsg(){
        String msg = UUID.randomUUID().toString();
        System.out.println("生产者发送内容msg:" + msg);
        Message build = MessageBuilder.withPayload(msg.getBytes()).build();
        sendMsgInterface.sendMsg().send(build);
        return "success";
    }
}
