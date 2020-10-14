package com.longg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author long
 * @date 2020/10/14
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    /**
     * 跳转到登陆页面
     */
    @RequestMapping("/enterLogin")
    public String enterLogin() {
        return "login";
    }

    /**
     * 跳转到登录成功的main页面
     */
    @RequestMapping("/success")
    public String success() {
        return "main";
    }

    /**
     * 登陆提交
     */
    @RequestMapping("/login")
    public String login(HttpSession session, String username, String pwd) throws Exception {
        // 向session存入用户身份信息
        System.out.println(username);
        session.setAttribute("username", username);
        return "main";
    }

    /**
     * 退出登陆
     */
    @RequestMapping("/logout")
    public String logout(HttpSession session) throws Exception {

//        session.invalidate(); // session销毁
        session.removeAttribute("username");    // 移除session中的单个username节点（推荐使用）
        return "login";
    }

    /**
     * 回首页
     */
    @RequestMapping("/index")
    public String index() throws Exception {
        return "redirect:/index.jsp";
    }
}
