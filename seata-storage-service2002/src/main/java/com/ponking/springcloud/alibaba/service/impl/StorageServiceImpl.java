package com.ponking.springcloud.alibaba.service.impl;

import com.ponking.springcloud.alibaba.dao.StorageDao;
import com.ponking.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Ponking
 * @ClassName StorageServiceImpl
 * @date 2020/5/7--16:30
 **/
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger log = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    // 扣减库存
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId, count);
        log.info("------->storage-service中扣减库存结束");
    }
}
