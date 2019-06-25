package com.zhouzhu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-24 11:08
 */
@SpringBootApplication
@MapperScan("com.zhouzhu.mapper")
public class ApplicationSpringSecurityDemo {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationSpringSecurityDemo.class,args);
    }
}
