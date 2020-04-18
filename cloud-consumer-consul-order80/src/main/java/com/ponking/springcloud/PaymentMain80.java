package com.ponking.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Ponking
 * @ClassName PaymentMain80
 * @date 2020/4/17--17:32
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain80 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain80.class,args);
    }
}
