package com.wang.springcloud.alibaba.controller;

import com.wang.springcloud.alibaba.domain.CommonResult;
import com.wang.springcloud.alibaba.domain.Order;
import com.wang.springcloud.alibaba.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: OrderController
 * @Description
 * @Author:我自己
 * @Date: 2022/7/26  14:37
 * @Version 1.0
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 创建订单
     * @param order
     * @return
     */

    @GlobalTransactional(name = "wfc-create-order",rollbackFor = Exception.class)
    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult<>(200,"订单创建成功");
    }
}
