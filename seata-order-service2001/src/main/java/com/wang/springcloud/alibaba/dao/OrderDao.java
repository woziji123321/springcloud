package com.wang.springcloud.alibaba.dao;

import com.wang.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: OrderDao
 * @Description 订单
 * @Author:我自己
 * @Date: 2022/7/26  14:00
 * @Version 1.0
 */
@Mapper
public interface OrderDao {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);

    /**
     * 修改订单状态
     * @param userId
     * @param status
     */
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}
