package com.zhouzhu.cotroller;

import com.zhouzhu.pojo.Permission;
import com.zhouzhu.pojo.Role;
import com.zhouzhu.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-07 15:39
 */
@Controller
@RequestMapping("permission")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;
    /**
     * 查询所有角色
     * @return
     */
    @RequestMapping("findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView=new ModelAndView();
        List<Permission> permissionList=permissionService.findAll();
        modelAndView.addObject("permissionList",permissionList);
        modelAndView.setViewName("permission-list");
        return modelAndView;
    }

    @RequestMapping("save")
    public String save(Permission permission){
        permissionService.save(permission);
        return "redirect:findAll.do";
    }
}
