package com.longg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author long
 * @date 2020/10/12
 *
 * 测试解决乱码问题
 */
@Controller
public class EncodingController {

    @RequestMapping("/long/encode")
    public String test(Model model, String name){
        System.out.println(name);
        model.addAttribute("msg",name); //获取表单提交的值
        return "test"; //跳转到test页面显示输入的值
    }
}
