package com.kjss.mq.listener;

import java.util.Map;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "TestDirectQueue") //监听的队列名称 TestDirectQueue
public class DirectReceiver2 {
	
	@RabbitHandler
    public void process(Map testMessage) {
        System.out.println("第二个DirectReceiver消费者收到消息  : " + testMessage.toString());
    }
}
