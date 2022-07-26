package com.wang.springcloud.alibaba.service.impl;

import com.wang.springcloud.alibaba.dao.OrderDao;
import com.wang.springcloud.alibaba.domain.Order;
import com.wang.springcloud.alibaba.service.AccountService;
import com.wang.springcloud.alibaba.service.OrderService;
import com.wang.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: OrderServiceImpl
 * @Description
 * @Author:我自己
 * @Date: 2022/7/26  14:15
 * @Version 1.0
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Resource
    private StorageService storageService;

    @Resource
    private AccountService accountService;
    /**
     * 创建订单；
     * 思路分析：调用库存服务扣减库存--->调用账户服务扣减账户余额--->修改订单状态
     * 简而言之：下订单--->减库存--->减余额--->该状态
     * @param order
     */
    @Override
    public void create(Order order) {

        log.info("------------>下单开始");
        //创建订单
        orderDao.create(order);

        //远程调用库存服务扣减库存
        log.info("------------>order-service扣减库存开始");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("------------>order-service扣减库存结束");

        //远程调用账户服务扣减余额
        log.info("------------>order-service扣减余额开始");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("------------>order-service扣减余额结束");

        //修改订单状态为已完成
        log.info("------->order-service中修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("------->order-service中修改订单状态结束");

        log.info("------->下单结束");
    }
}
