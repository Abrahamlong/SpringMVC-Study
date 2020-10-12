package com.longg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author long
 * @date 2020/10/12
 *
 * 测试视图转发和重定向
 */
@Controller
public class RedirectController {

    /**
     * 没有视图解析器的情况
     */
    @RequestMapping("/rc/t1")
    public String test1(){
        //转发一
        return "/WEB-INF/jsp/hello.jsp";
    }

    @RequestMapping("/rc/t2")
    public String test2(){
        //转发二（不建议使用）
        return "forward:/WEB-INF/jsp/hello.jsp";
    }

    @RequestMapping("/rc/t3")
    public String test3(){
        //重定向
        return "redirect:/index.jsp";
    }

    /**
     * 有视图解析器的情况
     */
    @RequestMapping("/c/t4")
    public String test4(){
        //重定向 (重定向不能访问WEB-INF路径下的文件)
        return "redirect:/index.jsp";
    }
}
