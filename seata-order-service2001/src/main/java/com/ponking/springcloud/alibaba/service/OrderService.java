package com.ponking.springcloud.alibaba.service;

import com.ponking.springcloud.alibaba.domain.Order;

/**
 * @author Ponking
 * @ClassName OrderService
 * @date 2020/5/7--16:30
 **/
public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
