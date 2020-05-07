package com.ponking.springcloud.alibaba.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author Ponking
 * @ClassName AccountDao
 * @date 2020/5/7--16:28
 **/
@Mapper
public interface AccountDao {

    /**
     * 扣减库存信息
     * @param userId
     * @param money
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
