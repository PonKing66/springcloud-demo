package com.ponking.springcloud.alibaba.myhandler;


import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ponking.springcloud.entities.CommonResult;
import com.ponking.springcloud.entities.Payment;


/**
 * @author Ponking
 * @ClassName CustomerHandler
 * @date 2020/5/6--18:04
 **/
public class CustomerHandler {

    public static CommonResult handlerException1(BlockException exception)
    {
        return new CommonResult(200,"按客户自定义的限流处理信息......方法1 "+exception.getRuleLimitApp(),new Payment(2020L,"serial001"));
    }

    public static CommonResult handlerException2(BlockException exception)
    {
        return new CommonResult(200,"按客户自定义的限流处理信息......方法2 "+exception.getRuleLimitApp(),new Payment(2020L,"serial002"));
    }
}
