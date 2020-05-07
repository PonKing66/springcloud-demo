package com.ponking.springcloud.alibaba.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Ponking
 * @ClassName StorageDao
 * @date 2020/5/7--16:28
 **/
@Mapper
public interface StorageDao {

    /**
     * 扣减库存信息
     * @param productId
     * @param count
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}
