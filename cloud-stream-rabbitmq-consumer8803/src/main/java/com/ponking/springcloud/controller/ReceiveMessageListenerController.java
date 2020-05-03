package com.ponking.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author Ponking
 * @ClassName ReceiveMessageListenerController
 * @date 2020/5/2--15:48
 **/
@Component
@EnableBinding(Sink.class)
public class ReceiveMessageListenerController {


    @Value("${server.port}")
    private String serverPort;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message ){
        System.out.println("消费者2号,---->接收到的消息:"+message.getPayload()+"\t port:"+serverPort);
    }
}
