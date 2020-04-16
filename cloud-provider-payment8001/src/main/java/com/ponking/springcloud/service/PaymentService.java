package com.ponking.springcloud.service;

import com.ponking.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Ponking
 * @ClassName PaymentService
 * @date 2020/4/15--21:04
 **/
public interface PaymentService {
    /**
     * 创建
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 获取Payment
     * @param id
     * @return
     */
    Payment getPaymentById(@Param("id") Long id);
}
