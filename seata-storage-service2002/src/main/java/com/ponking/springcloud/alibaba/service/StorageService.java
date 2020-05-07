package com.ponking.springcloud.alibaba.service;

/**
 * @author Ponking
 * @ClassName StorageService
 * @date 2020/5/7--16:30
 **/
public interface StorageService {
    /**
     * 减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId,Integer count);
}
