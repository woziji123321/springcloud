package com.wang.springcloud.alibaba.service;

import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: StorageService
 * @Description
 * @Author:我自己
 * @Date: 2022/7/26  15:30
 * @Version 1.0
 */
public interface StorageService {
    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(Long productId,Integer count);
}
