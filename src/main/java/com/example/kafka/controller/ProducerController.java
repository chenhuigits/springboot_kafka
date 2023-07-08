package com.example.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chen.hui
 * @version 1.0
 * @title ProducerController
 * @description kafka生产者控制器
 * @create 2023/7/8 12:00
 **/
@RestController
public class ProducerController {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    /**
     * @description 发送消息
     * @author chen.hui
     * @param[1] msg
     * @throws
     * @return String
     * @time 2023/7/8 15:48
     */
    @GetMapping("/sentMessage")
    public String sentDate(String msg){
        kafkaTemplate.send("first",msg);
        return msg;
    }
}
