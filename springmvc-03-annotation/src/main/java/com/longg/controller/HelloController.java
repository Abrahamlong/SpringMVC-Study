package com.longg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author long
 * @date 2020/9/15
 */
@Controller
/**
 * 如果添加在类上的请求路径则请求路径为多级：http://localhost/hello/long
 * 如果不添加类上的请求路径则：http://localhost/long
  */
//@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/long")
    public String hello(Model model){
        // 封装数据
        model.addAttribute("msg","Hello,我是SpringMVC");
        // 会自动被视图解析器处理
        return "hello";
    }

}
