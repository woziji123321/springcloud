package com.wang.springcloud.dao;

import com.wang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: PaymentDao
 * @Description
 * @Author:我自己
 * @Date: 2022/7/19  14:14
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {
    /**
     * 插入数据
     * @param payment
     * @return
     */
    public int create(Payment payment);

    /**
     * 根据id查询数据
     * @param id
     * @return
     */
    public Payment getPaymentById(@Param("id") Long id);
}
