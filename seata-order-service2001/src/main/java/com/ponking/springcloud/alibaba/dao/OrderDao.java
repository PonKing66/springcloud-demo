package com.ponking.springcloud.alibaba.dao;


import com.ponking.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Ponking
 * @ClassName OrderDao
 * @date 2020/5/7--16:28
 **/
@Mapper
public interface OrderDao {

    /**
     * 新建订单
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态，从零改为1
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId,@Param("status") Integer status);

}
