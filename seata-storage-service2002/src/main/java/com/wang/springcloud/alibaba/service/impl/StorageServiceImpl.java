package com.wang.springcloud.alibaba.service.impl;

import com.wang.springcloud.alibaba.dao.StorageDao;
import com.wang.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: StorageServiceImpl
 * @Description
 * @Author:我自己
 * @Date: 2022/7/26  15:31
 * @Version 1.0
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;


    @Override
    public void decrease(Long productId, Integer count) {
    log.info("------->storage-service中扣减库存开始");
    storageDao.decrease(productId,count);
    log.info("------->storage-service中扣减库存结束");

    }
}
