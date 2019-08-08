package com.zhouzhu.cotroller;

import com.zhouzhu.pojo.Role;
import com.zhouzhu.pojo.UserInfo;
import com.zhouzhu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-06 14:54
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView=new ModelAndView();
        List<UserInfo> userInfoList=userService.findAll();
        modelAndView.addObject("userList",userInfoList);
        modelAndView.setViewName("user-list");
        return modelAndView;
    }

    /**
     * 添加用户
     * @param userInfo
     * @return
     */
    @RequestMapping("save")
    public String save(UserInfo userInfo){
        userService.save(userInfo);
        return "redirect:findAll.do";
    }

    /**
     * 查询用户信息详情
     * @param id
     * @return
     */
    @RequestMapping("findById")
    public ModelAndView findById(String id){
        ModelAndView modelAndView=new ModelAndView();
        UserInfo userInfo=userService.findById(id);
        modelAndView.addObject("user",userInfo);
        modelAndView.setViewName("user-show");
        return modelAndView;
    }

    /**
     * 查询未添加的角色
     * @param userId
     * @return
     */
    @RequestMapping("findUserByIdAndAllRole")
    public ModelAndView findUserByIdAndAllRole(@RequestParam(name = "id",required = true) String userId){
        ModelAndView modelAndView=new ModelAndView();
        //查询用户
        UserInfo userInfo = userService.findById(userId);
        //查询可以添加的角色
        List<Role> otherRoles=userService.findOtherRole(userId);
        modelAndView.addObject("user",userInfo);
        modelAndView.addObject("roleList",otherRoles);
        modelAndView.setViewName("user-role-add");
        return modelAndView;
    }

    /**
     * 为用户添加角色
     * @param userId
     * @param roleIds
     */
    @RequestMapping("addRoleToUser")
    public String addRoleToUser(@RequestParam(name = "userId",required = true)String userId,@RequestParam(name = "ids",required = true)String[] roleIds){
        userService.addRoleToUser(userId,roleIds);
        return "redirect:findAll.do";
    }
}
