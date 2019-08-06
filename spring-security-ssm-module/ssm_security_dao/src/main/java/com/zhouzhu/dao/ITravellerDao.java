package com.zhouzhu.dao;

import com.zhouzhu.pojo.Traveller;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-06 11:29
 */
public interface ITravellerDao {

    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId})")
    List<Traveller> findByOrdersId(String ordersId);
}
