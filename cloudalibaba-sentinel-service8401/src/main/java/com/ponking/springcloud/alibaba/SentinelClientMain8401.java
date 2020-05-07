package com.ponking.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Ponking
 * @ClassName SentinelClientMain8401
 * @date 2020/5/5--16:48
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelClientMain8401 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelClientMain8401.class,args);
    }
}
