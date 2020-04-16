package com.ponking.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Ponking
 * @ClassName ApplicationContextConfig
 * @date 2020/4/15--22:16
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //使用@loadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
