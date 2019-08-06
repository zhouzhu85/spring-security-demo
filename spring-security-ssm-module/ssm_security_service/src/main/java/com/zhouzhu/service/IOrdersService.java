package com.zhouzhu.service;

import com.zhouzhu.pojo.Orders;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-05 15:25
 */
public interface IOrdersService {

    List<Orders> findAllByPage(Integer page, Integer pageSize);
}
