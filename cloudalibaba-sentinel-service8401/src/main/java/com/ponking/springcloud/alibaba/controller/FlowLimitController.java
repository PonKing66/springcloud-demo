package com.ponking.springcloud.alibaba.controller;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ponking
 * @ClassName RateLimitController
 * @date 2020/5/5--16:51
 **/
@RestController
@Slf4j
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA() throws InterruptedException {
//        Thread.sleep(1000);
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() throws InterruptedException {
        log.info(Thread.currentThread().getName()+" do something....");
//        Thread.sleep(1000);
        return "------testB";
    }

    @GetMapping("/testD")
    public String testD() throws InterruptedException {
        Thread.sleep(1000);
        int a = 10 / 0;
        log.info("testD  测试RT");
        return "------testD";
    }


    @GetMapping("/testE")
    public String testE() throws InterruptedException {
        Thread.sleep(1000);
        log.info("testE 测试RT");
        return "------testE";
    }

    @GetMapping("testHotKey")
    @SentinelResource(value = "testHotKey",blockHandler = "deal_testHotKey")
    public String testHotKey( @RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false)String p2){
        return "------------testHotKey";
    }

    public String deal_testHotKey(String p1, String p2, BlockException exception){
        return "------------deal_testHotKey O(∩_∩)O";
    }
}
