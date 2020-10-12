package com.longg.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.longg.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author long
 * @date 2020/10/12
 */
@Controller
public class FastJsonController {
    @RequestMapping("/fjson1")
    @ResponseBody   // 使用该注解使该方法不走视图解析器，直接返回一个字符串，等同于@RestController
    public String fjson1(){
        User user = new User("long", 16, "girl");
        return JSON.toJSONString(user);
    }

    @RequestMapping("/fjson2")
    @ResponseBody
    public String fjson2() throws JsonProcessingException {
        User user1 = new User("long1", 16, "girl");
        User user2 = new User("long2", 16, "girl");
        User user3 = new User("long3", 16, "girl");
        User user4 = new User("long4", 16, "girl");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return JSON.toJSONString(list);
    }
}
