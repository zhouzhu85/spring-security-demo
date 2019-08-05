package com.zhouzhu.service;

import com.zhouzhu.pojo.ProductDO;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-02 14:30
 */
public interface IproductService {
    List<ProductDO> findAll();
}
