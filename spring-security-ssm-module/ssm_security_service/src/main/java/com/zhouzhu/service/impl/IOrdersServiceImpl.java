package com.zhouzhu.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhouzhu.dao.IOrdersDao;
import com.zhouzhu.pojo.Orders;
import com.zhouzhu.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-05 15:26
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class IOrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao iOrdersDao;

    @Override
    public List<Orders> findAllByPage(Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        return iOrdersDao.findAll();
    }

    @Override
    public Orders findById(String orderId) {
        return iOrdersDao.findById(orderId);
    }
}
