package com.wang.springcloud.alibaba.service;

import com.wang.springcloud.alibaba.domain.Order;

/**
 * @ClassName: OrderService
 * @Description
 * @Author:我自己
 * @Date: 2022/7/26  14:14
 * @Version 1.0
 */
public interface OrderService {
    /**
     * 创建订单
     * @param order
     */
    void create(Order order);
}
