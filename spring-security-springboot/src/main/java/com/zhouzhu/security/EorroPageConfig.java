package com.zhouzhu.security;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * @author zhouzhu
 * @Description 自定义错误页面
 * @create 2019-06-24 17:38
 */
@Configuration
public class EorroPageConfig {
    @Bean
    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                ErrorPage errorPage=new ErrorPage(HttpStatus.FORBIDDEN,"/403");
                factory.addErrorPages(errorPage);
            }
        };
    }
}
