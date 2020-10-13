package com.longg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author long
 * @date 2020/10/13
 */
@RestController
public class AjaxController {

    @RequestMapping("/hello")
    public String test(){
        return "hello";
    }

    @RequestMapping("a1")
    public void a1(String name, HttpServletResponse response){
        System.out.println(name);

    }
}
