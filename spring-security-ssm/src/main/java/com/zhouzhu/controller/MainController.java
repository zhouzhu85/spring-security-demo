package com.zhouzhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-18 10:52
 */
@Controller
public class MainController {
    @RequestMapping("userLogin")
    public String login(){
        return "/login";
    }

    @RequestMapping("error")
    public String error(){
        return "/error";
    }
}
