package com.wang.springcloud.alibaba.service;

import com.wang.springcloud.entities.CommonResult;
import com.wang.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @ClassName: PaymentService
 * @Description
 * @Author:我自己
 * @Date: 2022/7/26  9:38
 * @Version 1.0
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
