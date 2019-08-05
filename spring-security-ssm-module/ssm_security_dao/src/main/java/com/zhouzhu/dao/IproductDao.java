package com.zhouzhu.dao;

import com.zhouzhu.pojo.ProductDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IproductDao {

    @Select("select * from product")
    List<ProductDO> findAll();

    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(ProductDO productDO);
}
