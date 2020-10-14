package com.longg.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author long
 * @date 2020/10/14
 */
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("当前请求的URL: " + request.getRequestURI());
        // 放行: 在登陆页面则放行
        if (request.getRequestURI().contains("login")) {
            System.out.println("我在登录页面进入了main页面");
            return true;
        }

        // 放行: 回首页则放行
        if (request.getRequestURI().contains("index")) {
            System.out.println("我在登录页面进入了main页面");
            return true;
        }

        HttpSession session = request.getSession();
        // 放行: 用户已登陆则放行
        if(session.getAttribute("username") != null) {
            System.out.println("我已经登录成功，直接进入了main页面");
            return true;
        }

        // 判断用户没有登陆，则跳转到登陆页面
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        System.out.println("没有登录，请登录");
        return false;
    }
}
