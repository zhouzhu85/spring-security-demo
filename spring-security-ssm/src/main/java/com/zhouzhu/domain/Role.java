package com.zhouzhu.domain;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-19 11:09
 */
public class Role {
    private Integer id;
    private String roleName;
    private String roleDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}
