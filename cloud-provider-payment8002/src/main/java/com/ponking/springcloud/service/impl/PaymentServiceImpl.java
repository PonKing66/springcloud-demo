package com.ponking.springcloud.service.impl;

import com.ponking.springcloud.dao.PaymentDao;
import com.ponking.springcloud.entities.Payment;
import com.ponking.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Ponking
 * @ClassName PaymentServiceImpl
 * @date 2020/4/15--21:05
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
