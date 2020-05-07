package com.ponking.springcloud.alibaba.controller;

import com.ponking.springcloud.alibaba.domain.CommonResult;
import com.ponking.springcloud.alibaba.domain.Order;
import com.ponking.springcloud.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Ponking
 * @ClassName StorageController
 * @date 2020/5/7--16:32
 **/
@RestController
public class OrderController{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}

