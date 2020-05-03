package com.ponking.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Ponking
 * @ClassName PaymentHystrixFallback
 * @date 2020/4/26--17:03
 **/
@Component
public class PaymentHystrixFallback implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService paymentInfo_TimeOut , /(ㄒoㄒ)/~~";
    }
}
