package com.costomer.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import sun.plugin2.message.Message;

import java.nio.channels.Channel;

/**
 * @description: 监听队列，接收消息
 * @date: 2020/7/29 9:56
 * @author: lizhenhong
 */
@Component
public class RabbitReceiveHandler {

    //监听email队列
    @RabbitListener(queues = {RabbitConfig.QUEUE_INFORM_EMAIL})
    public void receive_email(Object msg, Message message, Channel channel){
        System.out.println("QUEUE_INFORM_EMAIL msg"+msg);
    }
    //监听sms队列
    @RabbitListener(queues = {RabbitConfig.QUEUE_INFORM_SMS})
    public void receive_sms(Object msg, Message message, Channel channel){
        System.out.println("QUEUE_INFORM_SMS msg"+msg);
    }
    
}
