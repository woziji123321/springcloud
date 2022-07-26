package com.wang.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MyBatisConfig
 * @Description
 * @Author:我自己
 * @Date: 2022/7/26  14:44
 * @Version 1.0
 */
@Configuration
@MapperScan("com.wang.springcloud.alibaba.dao")
public class MyBatisConfig {
}
