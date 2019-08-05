package com.zhouzhu.dao;

import com.zhouzhu.pojo.ProductDO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IproductDao {

    @Select("select * from product")
    List<ProductDO> findAll();
}
