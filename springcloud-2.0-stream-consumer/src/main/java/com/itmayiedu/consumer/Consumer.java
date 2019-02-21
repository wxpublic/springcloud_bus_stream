package com.itmayiedu.consumer;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-02-21 下午 2:56
 */
@Component
public class Consumer {
    @StreamListener("my_stream_Channel")
    public void redMsg(String msg){
        System.out.println("消费者获取到生产者投递的消息_UUID: "+msg);
    }
}
