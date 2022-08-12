package com.yuan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.yuan.pojo.User;
import com.yuan.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: User
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/7/4-11:34
 * @Version: 1.0
 */
//@Controller
@RestController
public class UserController {

    @RequestMapping("t1")
//    @ResponseBody //他就不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {

        //jackson，objectMapper
        ObjectMapper mapper = new ObjectMapper();

        //创建一个对象
        User user = new User("yuayuan",3,"男");

        String str = mapper.writeValueAsString(user);

        return str;
    }

    @RequestMapping("t2")
    public String json2() throws JsonProcessingException {

        List<User> userList = new ArrayList<User>();

        User user = new User("yuayuan",3,"男");
        User user1 = new User("yuayuan",3,"男");
        User user2 = new User("yuayuan",3,"男");
        User user3 = new User("yuayuan",3,"男");

        userList.add(user);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        return JsonUtils.getJson(userList);
    }

    @RequestMapping("/t3")
    public String json3() throws JsonProcessingException {

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

    @RequestMapping("/t4")
    public String json4() {

        Date date = new Date();

        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }


}
