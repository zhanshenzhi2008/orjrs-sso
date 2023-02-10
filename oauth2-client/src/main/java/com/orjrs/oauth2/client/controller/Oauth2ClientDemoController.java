package com.orjrs.oauth2.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Oauth2 客户端控制类
 *
 * @author liujun
 * @create 2023-02-10 10:40:23
 */
@Slf4j
@RestController
public class Oauth2ClientDemoController {

    @RequestMapping(path = "/hello")
    public String demo() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        log.info("authentication: {}", authentication);

        return "success !";
    }
}