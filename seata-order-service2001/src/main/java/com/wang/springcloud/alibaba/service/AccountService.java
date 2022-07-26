package com.wang.springcloud.alibaba.service;

import com.wang.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @ClassName: AccountService
 * @Description
 * @Author:我自己
 * @Date: 2022/7/26  14:31
 * @Version 1.0
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

    /**
     * 扣减账户余额
     * @param userId
     * @param money
     * @return
     */
    @PostMapping("/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money")BigDecimal money);
}
