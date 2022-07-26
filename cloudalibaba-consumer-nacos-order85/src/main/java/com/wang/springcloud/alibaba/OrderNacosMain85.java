package com.wang.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: OrderNacosMain85
 * @Description
 * @Author:我自己
 * @Date: 2022/7/26  9:36
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderNacosMain85 {
    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain85.class,args);
    }
}
