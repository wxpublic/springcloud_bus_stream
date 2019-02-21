package com.itmayiedu;

import com.itmayiedu.stream.RedMsgInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @version 1.0
 * @Description: 消费者启动类，消费者队列，底层自动创建一个队列，绑定my_stream_Channel；
 * @author: ChenRuiQing.
 * Create Time:  2019-02-21 下午 2:16
 */
@SpringBootApplication
@EnableBinding(RedMsgInterface.class)
public class AppConsumer {
    public static void main(String[] args) {
        SpringApplication.run(AppConsumer.class);
    }
    //
}
