package com.wang.springcloud.alibaba.controller;

import com.wang.springcloud.alibaba.domain.CommonResult;
import com.wang.springcloud.alibaba.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: StorageController
 * @Description
 * @Author:我自己
 * @Date: 2022/7/26  15:35
 * @Version 1.0
 */
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    /**
     * 扣减库存
     */
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }
}

