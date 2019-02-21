package com.itmayiedu;

import com.itmayiedu.stream.SendMsgInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @version 1.0
 * @Description: 启动类，问题：RabbitMQ中的交换机和队列都在底层被stream封装好了，默认以通道名称创建交换机，消费者启动的时候，随机创建一个队列名称
 * @author: ChenRuiQing.
 * Create Time:  2019-02-21 下午 2:16
 */
@SpringBootApplication
@EnableBinding(SendMsgInterface.class)
public class AppProducer {
    public static void main(String[] args) {
        SpringApplication.run(AppProducer.class);
    }
}
