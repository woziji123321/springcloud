package com.wang.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: FlowLimitController
 * @Description
 * @Author:我自己
 * @Date: 2022/7/25  13:12
 * @Version 1.0
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        log.info(Thread.currentThread().getName()+"\t"+"...testB");
        return "--------testA";
    }

    @GetMapping("/testB")
    public String testB(){
        return "--------testB";
    }

    @GetMapping("/testD")
    public String testD()
    {
        //暂停几秒钟线程
        try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
        log.info("testD 测试RT");
        int age = 10/0;
        return "------testD";
    }

    @GetMapping("/testE")
    public String testE()
    {
        log.info("testE 测试异常比例");
        int age = 10/0;
        return "------testE 测试异常比例";
    }

    @GetMapping("/testHotkey")
    @SentinelResource(value = "testHotkey",blockHandler = "dealHandler_testHotKey")
    public String testHotkey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){
        return "----------testHotkey";
    }

    public String dealHandler_testHotKey(String p1, String p2, BlockException exception){
        return "------------dealHandler_testHotKey,成功兜底";
    }
}
