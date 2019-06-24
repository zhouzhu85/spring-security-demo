package com.zhouzhu.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-24 11:31
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //security5.0 改变密码的格式，需要加密才能登录
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("zhouzhu").password(new BCryptPasswordEncoder().encode("123456")).authorities("ROLE_USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/product/add").hasAuthority("ROLE_USER")
                .antMatchers("/product/update").hasAuthority("ROLE_ADMIN")
                .antMatchers("/product/delete").hasAuthority("ROLE_ADMIN")
                .antMatchers("/product/list").hasAuthority("ROLE_ADMIN")
                .anyRequest().authenticated()
            .and()
            .formLogin()
        ;
    }
}
