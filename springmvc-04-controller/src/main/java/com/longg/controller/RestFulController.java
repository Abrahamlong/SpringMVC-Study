package com.longg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author long
 * @date 2020/9/15
 */
@Controller
public class RestFulController {

    /**
     *  传统的url：http://localhost:8080/long3?a=2&b=3
     *  RestFul风格的url：http://localhost:8080/long3/a/b
     */
    @RequestMapping("/long3/{a}/{b}")
    public String test(@PathVariable int a, @PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg","a+b的结果为：" + res);
        return "test";
    }

}
