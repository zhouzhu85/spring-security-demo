package com.zhouzhu.cotroller;

import com.zhouzhu.pojo.Permission;
import com.zhouzhu.pojo.Role;
import com.zhouzhu.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-08-07 14:57
 */
@Controller
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * 查询所有角色
     * @return
     */
    @RequestMapping("findAll")
    public ModelAndView findAll(){
        ModelAndView modelAndView=new ModelAndView();
        List<Role> roleList=roleService.findAll();
        modelAndView.addObject("roleList",roleList);
        modelAndView.setViewName("role-list");
        return modelAndView;
    }

    @RequestMapping("save")
    public String save(Role role){
        roleService.save(role);
        return "redirect:findAll.do";
    }

    /**
     * 查询所有未关联的权限
     * @param roleId
     * @return
     */
    @RequestMapping("findRoleByIdAndAllPermission")
    public ModelAndView findRoleByIdAndAllPermission(@RequestParam(name = "id",required = true) String roleId){
        ModelAndView modelAndView=new ModelAndView();
        Role role=roleService.findById(roleId);
        List<Permission> permissionList=roleService.findOtherPermission(roleId);
        modelAndView.addObject("role",role);
        modelAndView.addObject("permissionList",permissionList);
        modelAndView.setViewName("role-permission-add");
        return modelAndView;
    }

    /**
     * 角色关联权限
     * @param roleId
     * @param permissionIds
     */
    @RequestMapping("addPermissionToRole")
    public String addPermissionToRole(@RequestParam(name = "roleId",required = true)String roleId,@RequestParam(name = "ids",required = true)String[] permissionIds){
        roleService.addPermissionToRole(roleId,permissionIds);
        return "redirect:findAll.do";
    }
}
