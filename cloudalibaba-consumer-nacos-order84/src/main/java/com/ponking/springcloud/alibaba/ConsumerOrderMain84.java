package com.ponking.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Ponking
 * @ClassName ConsumerOrderMain84
 * @date 2020/5/6--18:32
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerOrderMain84 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrderMain84.class,args);
    }
}
