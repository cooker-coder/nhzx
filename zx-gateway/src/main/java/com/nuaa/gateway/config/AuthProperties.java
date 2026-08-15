package com.nuaa.gateway.config;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.HashSet;

@Data
@Component
@ConfigurationProperties(prefix = "nhzx.auth")
public class AuthProperties implements InitializingBean {

    private Set<String> excludePath = new HashSet<String>();

    @Override
    public void afterPropertiesSet() throws Exception {
        if (excludePath == null) {
            excludePath = new HashSet<>();
        }
        // 添加默认不拦截的路径
        excludePath.add("/error/**");
        excludePath.add("/jwks");
        excludePath.add("/accounts/login");
        excludePath.add("/accounts/admin/login");
        excludePath.add("/accounts/refresh");
    }
}
