package com.wang.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName: StorageDao
 * @Description
 * @Author:我自己
 * @Date: 2022/7/26  15:21
 * @Version 1.0
 */
@Mapper
public interface StorageDao {
    /**
     * 扣减库存
     * @param productId
     * @param count
     */
    void decrease(@Param("productId") Long productId,@Param("count") Integer count);
}
