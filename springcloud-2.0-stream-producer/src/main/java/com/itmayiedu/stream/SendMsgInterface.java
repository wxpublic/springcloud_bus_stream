package com.itmayiedu.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

/**
 * @version 1.0
 * @Description: 创建消息通道
 * @author: ChenRuiQing.
 * Create Time:  2019-02-21 下午 1:39
 */
public interface SendMsgInterface {
    @Output("my_stream_Channel")
    SubscribableChannel sendMsg();
}
