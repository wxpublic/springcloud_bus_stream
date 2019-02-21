package com.itmayiedu.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-02-21 下午 3:03
 */
public interface RedMsgInterface {
    @Input("my_stream_Channel")
    SubscribableChannel redMsg();
}
