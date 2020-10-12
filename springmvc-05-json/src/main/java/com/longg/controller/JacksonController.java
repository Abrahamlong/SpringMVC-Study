package com.longg.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.longg.pojo.User;
import com.longg.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author long
 * @date 2020/10/12
 */
@Controller
//@RestController // 该注解下的类中的所有方法都不走视图解析器，只返回字符串，等同于@ResponseBody
public class JacksonController {

    @RequestMapping("/json1")
    @ResponseBody   // 使用该注解使该方法不走视图解析器，直接返回一个字符串，等同于@RestController
    public String json1() throws JsonProcessingException {
        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user = new User("long", 16, "girl");
        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(user);
        //由于@ResponseBody注解，这里会将str转成json格式返回；十分方便
        return str;
    }

    @RequestMapping("/json2")
    @ResponseBody
    public String json2() throws JsonProcessingException {

        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();
        //创建一个对象
        User user1 = new User("long1", 16, "girl");
        User user2 = new User("long2", 16, "girl");
        User user3 = new User("long3", 16, "girl");
        User user4 = new User("long4", 16, "girl");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(list);
        return str;
    }

    @RequestMapping("/json3")
    @ResponseBody
    public String json3() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        //创建时间一个对象，java.util.Date
        Date date = new Date();

        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(date);
        return str;
    }

    @RequestMapping("/json4")
    @ResponseBody
    public String json4() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //自定义日期格式对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //指定日期格式
        mapper.setDateFormat(sdf);

        Date date = new Date();
        String str = mapper.writeValueAsString(date);

        return str;
    }

    @RequestMapping("/json5")
    @ResponseBody
    public String json5() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        Date date = new Date();
        //自定义日期的格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        return mapper.writeValueAsString(sdf.format(date));
    }

    @RequestMapping("/json6")
    @ResponseBody
    public String json6() throws JsonProcessingException {
        Date date = new Date();
//        return JsonUtils.getJson(date);
        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }

    @RequestMapping("/json7")
    @ResponseBody   // 使用该注解使该方法不走视图解析器，直接返回一个字符串，等同于@RestController
    public String json7() throws JsonProcessingException {
        User user = new User("long", 16, "girl");
        return JsonUtils.getJson(user);
    }

    @RequestMapping("/json8")
    @ResponseBody
    public String json8(){
        User user1 = new User("long1", 16, "girl");
        User user2 = new User("long2", 16, "girl");
        User user3 = new User("long3", 16, "girl");
        User user4 = new User("long4", 16, "girl");
        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return JsonUtils.getJson(list);
    }
}
