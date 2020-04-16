package com.ponking.springcloud.dao;

import com.ponking.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Ponking
 * @ClassName PaymentDao
 * @date 2020/4/15--20:56
 **/
@Mapper
public interface PaymentDao {
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
