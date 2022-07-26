package com.wang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: OrderZK80
 * @Description
 * @Author:我自己
 * @Date: 2022/7/20  15:04
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZk80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZk80.class,args);
    }
}
