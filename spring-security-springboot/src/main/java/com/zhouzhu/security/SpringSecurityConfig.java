package com.zhouzhu.security;

import com.zhouzhu.service.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-24 11:31
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyUserDetailService myUserDetailService;

    @Autowired
    private MyAuthentiactionFailureHandler myAuthentiactionFailureHandler;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //security5.0 改变密码的格式，需要加密才能登录
//        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
//                .withUser("zhouzhu").password(new BCryptPasswordEncoder().encode("123456")).authorities("ROLE_USER");
        auth.userDetailsService(myUserDetailService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().mvcMatchers("/css/**","/img/**","/plugins/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
            http
                .authorizeRequests()
                    .antMatchers("/product/add").hasAuthority("ROLE_USER")
                    .antMatchers("/product/update").hasAuthority("ROLE_ADMIN")
                    .antMatchers("/product/delete").hasAuthority("ROLE_ADMIN")
                    .antMatchers("/product/list").hasAuthority("ROLE_ADMIN")
                    .antMatchers("/register").permitAll()
                .anyRequest().authenticated()
                .and()
                    .formLogin().loginPage("/login").permitAll().loginProcessingUrl("/login").defaultSuccessUrl("/").failureUrl("/login?error=true")
                .and()
                    .csrf().disable()
        ;
        http.logout().logoutSuccessUrl("/login");
    }
}
