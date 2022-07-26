package com.wang.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: CommonResult
 * @Description
 * @Author:我自己
 * @Date: 2022/7/26  15:17
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{
    /**
     *响应码
     */
     private Integer code;

     /**
      *响应消息
      */
      private String message;

      private T data;

      public CommonResult(Integer code,String message){
          this(code,message,null);
      }


}
