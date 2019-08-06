package com.zhouzhu.cotroller;

import com.github.pagehelper.PageInfo;
import com.zhouzhu.pojo.Orders;
import com.zhouzhu.service.IOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-05 15:24
 */
@Controller
@RequestMapping("orders")
public class OrdersController {
    @Autowired
    private IOrdersService iOrdersService;

    @RequestMapping("findAll")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue = "1") Integer page,
                                @RequestParam(name = "pageSize",required = true,defaultValue = "10") Integer pageSize){
        List<Orders> ordersList=iOrdersService.findAllByPage(page,pageSize);
        PageInfo pageInfo=new PageInfo(ordersList);
        ModelAndView mv=new ModelAndView();
        mv.setViewName("orders-list");
        mv.addObject("pageInfo",pageInfo);
        return mv;
    }
    @RequestMapping("findById")
    public ModelAndView findById(@RequestParam(name = "id",required = true)String orderId){
        ModelAndView modelAndView=new ModelAndView();
        Orders orders=iOrdersService.findById(orderId);
        modelAndView.addObject("orders",orders);
        modelAndView.setViewName("orders-show");
        return modelAndView;
    }
}
