package com.ponking.springcloud.alibaba.service;

import com.ponking.springcloud.entities.CommonResult;
import com.ponking.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author Ponking
 * @ClassName PaymentFallbackService
 * @date 2020/5/6--20:14
 **/
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
