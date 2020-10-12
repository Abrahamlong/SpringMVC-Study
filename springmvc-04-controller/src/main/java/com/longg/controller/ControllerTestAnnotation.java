package com.longg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author long
 * @date 2020/9/15
 */
@Controller // 代表这个类会被Spring接管
// 被这个注解的类，里面所有的方法如果返回值为String，并且有具体的页面可以跳转，那么就会被视图解析器解析
public class ControllerTestAnnotation {

    @RequestMapping(value = "/long2")   // value/path/不写的效果是一样的
    public String test(Model model){
        model.addAttribute("msg","测试ControllerTestAnnotation的类");
        return "test";
    }
}
