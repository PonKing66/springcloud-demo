package com.ponking.springcloud.controller;

import com.ponking.springcloud.entities.CommonResult;
import com.ponking.springcloud.entities.Payment;
import com.ponking.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

/**
 * @author Ponking
 * @ClassName PaymentController
 * @date 2020/4/15--21:07
 **/
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果：{}",result);
        if(result>0){
            return new CommonResult(200,"插入数据成功",result);
        }else{
            return new CommonResult(444,"插入数据失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("查询结果：{}",result);
        if(result!=null){
            return new CommonResult(200,"查询成功",result);
        }else{
            return new CommonResult(444,"查询失败,查询ID："+id,null);
        }
    }
}