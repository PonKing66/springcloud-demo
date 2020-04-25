package com.ponking.springcloud;

import com.ponking.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Ponking
 * @ClassName OrderMain80
 * @date 2020/4/15--22:13
 **/
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "ClOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
