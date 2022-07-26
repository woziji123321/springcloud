package com.wang.springcloud;

import com.wang.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @ClassName: OrderMain80
 * @Description
 * @Author:我自己
 * @Date: 2022/7/19  15:51
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
/**
 * 开启随机选择服务端的规则
 *@RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration= MySelfRule.class)
 */

public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
