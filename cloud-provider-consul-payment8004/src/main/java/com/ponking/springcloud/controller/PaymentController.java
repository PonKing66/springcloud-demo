package com.ponking.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Ponking
 * @ClassName PaymentController
 * @date 2020/4/17--17:21
 **/
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentZookeeper(){
        return "springcloud with consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
