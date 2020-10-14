package com.longg.controller;

import com.longg.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    /**
     * 测试JQuery.ajax的使用
     */
    @RequestMapping("/ajax1")
    public void ajax1(String name, HttpServletResponse response) throws IOException {
        System.out.println(name);
        if ("long".equals(name)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }
    }

    /**
     * 测试利用SpringMVC异步加载用户数据
     */
    @RequestMapping("/ajax2")
    public List<User> ajax2(){
        List<User> list = new ArrayList<User>();
        list.add(new User("long",18,"girl"));
        list.add(new User("abraham",16,"girl"));
        list.add(new User("abraham",16,"girl"));
        return list;    //由于@RestController注解，将list转成json格式返回
    }

    /**
     * 测试在登录时利用ajax验证用户名密码
     */
    @RequestMapping("/ajax3")
    public String ajax3(String name,String pwd){
        String msg = "";
        if (name != null){
            if ("long".equals(name)){
                msg = "OK";
            }else {
                msg = "error";
            }
        }
        if (pwd!=null){
            if ("123456".equals(pwd)){
                msg = "OK";
            }else {
                msg = "error";
            }
        }
        return msg;
    }
}
