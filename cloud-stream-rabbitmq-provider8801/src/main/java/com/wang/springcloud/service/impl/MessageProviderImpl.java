package com.wang.springcloud.service.impl;

import com.wang.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @ClassName: IMessageProviderImpl
 * @Description
 * @Author:我自己
 * @Date: 2022/7/24  10:40
 * @Version 1.0
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        //创建并发送消息
        this.output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****serial = " + serial);
        return serial;
    }
}
