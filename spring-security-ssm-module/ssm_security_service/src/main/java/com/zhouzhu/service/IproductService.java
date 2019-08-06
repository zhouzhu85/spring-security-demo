package com.zhouzhu.service;

import com.zhouzhu.pojo.Product;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-02 14:30
 */
public interface IproductService {
    List<Product> findAll();

    void save(Product product);
}
