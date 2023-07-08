package com.example.kafka.consumer;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author chen.hui
 * @version 1.0
 * @title KafkaConsumer
 * @description kafka监听
 * @create 2023/7/8 16:42
 **/
@Configuration
public class KafkaConsumer {
    // 指定要监听的 topic
    @KafkaListener(topics="first")
    public void consumeTopic(String msg){
        System.out.println("收到的消息："+msg);
    }
}
