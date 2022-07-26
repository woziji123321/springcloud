package com.wang.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @ClassName: Order
 * @Description 订单实体类
 * @Author:我自己
 * @Date: 2022/7/26  13:50
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    /**
     * 订单id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 产品id
     */
    private Long productId;
    /**
     * 数量
     */
    private Integer count;
    /**
     * 价格
     */
    private BigDecimal money;
    /**
     * 订单状态：0：创建中；1：已完结
     */
    private Integer status;
}
