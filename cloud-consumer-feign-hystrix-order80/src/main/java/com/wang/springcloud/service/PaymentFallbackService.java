package com.wang.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName: PaymentFallbackService
 * @Description
 * @Author:我自己
 * @Date: 2022/7/21  17:35
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService
{
    @Override
    public String paymentInfo_OK(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id)
    {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
