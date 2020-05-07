package com.ponking.springcloud.alibaba.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Ponking
 * @ClassName AccountService
 * @date 2020/5/7--20:30
 **/
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
