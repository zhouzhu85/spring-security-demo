package com.zhouzhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-24 11:14
 */
@Controller
@RequestMapping("product")
public class ProductController {
    @RequestMapping("add")
    public String add(){
        return "product/add";
    }
    @RequestMapping("update")
    public String update(){
        return "product/update";
    }
    @RequestMapping("delete")
    public String delete(){
        return "product/delete";
    }
    @RequestMapping("list")
    public String list(){
        return "product/list";
    }

}
