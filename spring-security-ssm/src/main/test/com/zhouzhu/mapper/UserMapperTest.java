package com.zhouzhu.mapper;

import com.zhouzhu.domain.Permission;
import com.zhouzhu.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindByUsername() {
        User user=userMapper.findByUsername("zhouzhu");
        System.out.println(user);
    }


    @Test
    public void testFindPermissionByUsername() {
        List<Permission> list = userMapper.findPermissionByUsername("zhouzhu");
        for (Permission permission : list) {
            System.out.println(permission.getPermName()+"-"+permission.getPermTag());
        }
    }
}