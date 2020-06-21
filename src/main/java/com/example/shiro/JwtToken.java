package com.example.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @className:JwtToken
 * @description:
 * @author:Peter
 * @date:2020/6/17 10:49
 **/
public class JwtToken implements AuthenticationToken {

    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
