package com.zhouzhu.security;

import org.springframework.security.core.AuthenticationException;

/**
 * @author zhouzhu
 * @Description
 * @create 2019-06-21 10:57
 */
public class ImageCodeException extends AuthenticationException {

    public ImageCodeException(String msg, Throwable t) {
        super(msg, t);
    }

    public ImageCodeException(String msg) {
        super(msg);
    }
}
