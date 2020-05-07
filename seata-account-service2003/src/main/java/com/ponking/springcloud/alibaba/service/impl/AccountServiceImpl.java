package com.ponking.springcloud.alibaba.service.impl;

import com.ponking.springcloud.alibaba.dao.AccountDao;
import com.ponking.springcloud.alibaba.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author Ponking
 * @ClassName StorageServiceImpl
 * @date 2020/5/7--16:30
 **/
@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);

    @Resource
    private AccountDao accountDao;


    @Override
    public void decrease(Long userId, BigDecimal money) {

        log.info("------->account-service中扣减账户余额开始");
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        accountDao.decrease(userId, money);
        log.info("------->account-service中扣减账户余额结束");
    }
}
