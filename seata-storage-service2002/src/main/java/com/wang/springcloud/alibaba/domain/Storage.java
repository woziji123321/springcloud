package com.wang.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Storage
 * @Description
 * @Author:我自己
 * @Date: 2022/7/26  15:07
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {

    private Long id;

    /**
     *产品id
     */
     private Long productId ;

     /**
      *总库存
      */
      private Integer total;

      /**
       * 已用库存
       */
      private Integer used;

      /**
       * 剩余库存
       */
      private Integer residue;
}
