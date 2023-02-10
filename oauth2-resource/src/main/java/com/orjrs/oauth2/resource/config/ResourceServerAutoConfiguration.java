package com.orjrs.oauth2.resource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
/**
 * OAuth2 资源服务配置类
 *
 * @author liujun
 * @create 2023-02-10 11:13:12
 */
@Configuration
public class ResourceServerAutoConfiguration {

    @Bean
    public SecurityFilterChain resourceServerSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests().anyRequest().authenticated().and()
                .oauth2ResourceServer().jwt();

        return http.build();
    }
}