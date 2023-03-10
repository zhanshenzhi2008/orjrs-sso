package com.orjrs.oauth2.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

/**
 * OAuth2 客户端配置类
 *
 * @author liujun
 * @create 2023-02-10 10:40:23
 */
@Configuration
public class Oauth2ClientAutoConfiguration {

    @Bean
    public SecurityFilterChain authorizationClientSecurityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests()
                .anyRequest().authenticated()
                .and().logout()
                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.ALWAYS)
                .and().oauth2Client()
                .and().oauth2Login();

        return http.build();
    }
}