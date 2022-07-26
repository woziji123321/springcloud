package com.wang.springcloud.alibaba.service;

import com.wang.springcloud.entities.CommonResult;
import com.wang.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @ClassName: PaymentFallbackService
 * @Description
 * @Author:我自己
 * @Date: 2022/7/26  9:41
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回,没有该流水信息",new Payment(id, "errorSerial......"));
    }
}
