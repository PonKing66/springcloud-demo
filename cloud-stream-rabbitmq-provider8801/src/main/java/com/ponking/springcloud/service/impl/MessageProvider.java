package com.ponking.springcloud.service.impl;

import com.ponking.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author Ponking
 * @ClassName MessageProvider
 * @date 2020/5/2--12:40
 **/
@Slf4j
@EnableBinding(Source.class)// 定义消息的推送管道
public class MessageProvider implements IMessageProvider {

    @Resource
    private MessageChannel output; //消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("servial:"+serial);
        return null;
    }
}
