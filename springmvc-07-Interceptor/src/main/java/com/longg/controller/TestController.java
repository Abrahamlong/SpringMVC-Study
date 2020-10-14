package com.longg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author long
 * @date 2020/10/14
 */
@RestController
public class TestController {

    @RequestMapping("/interceptor")
    public String testFunction() {
        System.out.println("拦截器生效了！");
        return "hello";
    }
}
