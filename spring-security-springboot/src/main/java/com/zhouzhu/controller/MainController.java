package com.zhouzhu.controller;

import com.zhouzhu.pojo.User;
import com.zhouzhu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-24 11:13
 */
@Controller
public class MainController {
    @Autowired
    private UserService userService;

    @GetMapping("login")
    public String login(){
        return "admin-login";
    }
    @GetMapping("register")
    public String register(){
        return "all-admin-register";
    }
    @PostMapping("register")
    @ResponseBody
    public String register(User user){
        userService.createUser(user);
        return "200";
    }
    @RequestMapping("403")
    public String notAuth(){
        return "403";
    }
}
