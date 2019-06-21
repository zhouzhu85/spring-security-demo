package com.zhouzhu.security;

import com.zhouzhu.domain.Permission;
import com.zhouzhu.domain.User;
import com.zhouzhu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-20 10:40
 */
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //根据用户名查询用户信息
        User user = userMapper.findByUsername(username);
        if (user!=null) {
            //根据用户名查询用户信息
            List<Permission> permList = userMapper.findPermissionByUsername(username);
            //存放所有用户权限
            List<GrantedAuthority> authorities = new ArrayList<>();

            for (Permission permission : permList) {
                GrantedAuthority authority = new SimpleGrantedAuthority(permission.getPermTag());
                authorities.add(authority);
            }
            user.setAuthorities(authorities);
        }
        return user;
    }
}
