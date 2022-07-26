package com.wang.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wang.springcloud.entities.CommonResult;

/**
 * @ClassName: CustomerBlockHandler
 * @Description
 * @Author:我自己
 * @Date: 2022/7/25  16:55
 * @Version 1.0
 */
public class CustomerBlockHandler {
    public static CommonResult handleException1(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler1");
    }
    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler2");
    }
}
