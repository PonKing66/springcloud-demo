package com.ponking.springcloud.service;

import com.ponking.springcloud.entities.CommonResult;
import com.ponking.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Ponking
 * @ClassName PaymentFeignService
 * @date 2020/4/25--21:23
 **/

@Component
@FeignClient(name = "CLOUD-PAYMENT-SERVICE",value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {


    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();
}
