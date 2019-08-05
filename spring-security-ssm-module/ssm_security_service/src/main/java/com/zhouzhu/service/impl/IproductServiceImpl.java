package com.zhouzhu.service.impl;

import com.zhouzhu.dao.IproductDao;
import com.zhouzhu.pojo.ProductDO;
import com.zhouzhu.service.IproductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-02 14:31
 */
@Service
public class IproductServiceImpl implements IproductService {

    @Autowired
    private IproductDao productDao;

    @Override
    public List<ProductDO> findAll() {
        return productDao.findAll();
    }

    @Override
    public void save(ProductDO productDO) {
        productDao.save(productDO);
    }
}
