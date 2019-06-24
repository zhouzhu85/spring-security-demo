package com.zhouzhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-24 11:13
 */
@Controller
public class MainController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @RequestMapping("403")
    public String notAuth(){
        return "403";
    }
}
