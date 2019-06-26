package com.zhouzhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-24 11:13
 */
@Controller
public class MainController {

    @GetMapping("login")
    public String login(){
        return "admin-login";
    }


    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @RequestMapping("403")
    public String notAuth(){
        return "403";
    }
}
