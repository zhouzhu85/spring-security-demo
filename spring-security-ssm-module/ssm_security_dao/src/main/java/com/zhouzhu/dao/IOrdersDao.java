package com.zhouzhu.dao;

import com.zhouzhu.pojo.Member;
import com.zhouzhu.pojo.Orders;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-05 15:32
 */
public interface IOrdersDao {
    @Select("select * from orders")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "orderNum",property = "orderNum"),
            @Result(column = "orderTime",property = "orderTime"),
            @Result(column = "orderStatus",property = "orderStatus"),
            @Result(column = "peopleCount",property = "peopleCount"),
            @Result(column = "payType",property = "payType"),
            @Result(column = "orderDesc",property = "orderDesc"),
            @Result(column = "productId",property = "product",javaType = IproductDao.class,one = @One(select = "com.zhouzhu.dao.IproductDao.findById")),
    })
    List<Orders> findAll();

    @Select("select * from orders where id=#{orderId}")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "orderNum",property = "orderNum"),
            @Result(column = "orderTime",property = "orderTime"),
            @Result(column = "orderStatus",property = "orderStatus"),
            @Result(column = "peopleCount",property = "peopleCount"),
            @Result(column = "payType",property = "payType"),
            @Result(column = "orderDesc",property = "orderDesc"),
            @Result(column = "productId",property = "product",javaType = IproductDao.class,one = @One(select = "com.zhouzhu.dao.IproductDao.findById")),
            @Result(column = "memberId",property = "member",javaType = Member.class,one = @One(select = "com.zhouzhu.dao.IMemberDao.findById")),
            @Result(column = "id",property = "travellers",javaType = java.util.List.class,many = @Many(select = "com.zhouzhu.dao.ITravellerDao.findByOrdersId"))
    })
    Orders findById(String orderId);
}
