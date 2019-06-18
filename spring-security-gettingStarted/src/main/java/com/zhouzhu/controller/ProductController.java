package com.zhouzhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-17 15:51
 */
@Controller
@RequestMapping("product")
public class ProductController {
    /**
     *  主页
     * @return
     */
    @RequestMapping("index")
    public String index(){
        return "/index";
    }
    /**
     *  商品查询
     * @return
     */
    @RequestMapping("list")
    public String list(){
        return "/product/productList";
    }
    /**
     *  商品添加
     * @return
     */
    @RequestMapping("add")
    public String add(){
        return "/product/productAdd";
    }

    /**
     *  商品修改
     * @return
     */
    @RequestMapping("update")
    public String update(){
        return "/product/productUpdate";
    }

    /**
     *  商品删除
     * @return
     */
    @RequestMapping("delete")
    public String delete(){
        return "/product/productDelete";
    }

}
