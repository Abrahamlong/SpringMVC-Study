package com.longg.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author long
 * @date 2020/9/15
 */

// 只要实现了Controller接口的类，说明这就是一个控制器了
public class ControllerTestInterface implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        mv.addObject("msg","这是ControllerInterface的测试");
        mv.setViewName("test");

        return mv;
    }
}
