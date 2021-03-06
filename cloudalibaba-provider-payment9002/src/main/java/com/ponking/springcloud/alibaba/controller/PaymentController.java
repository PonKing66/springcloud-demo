package com.ponking.springcloud.alibaba.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ponking
 * @ClassName PaymentController
 * @date 2020/5/3--18:05
 **/
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        return "nacos registry, serverPort:"+serPort+"\t id"+id;
    }

}
