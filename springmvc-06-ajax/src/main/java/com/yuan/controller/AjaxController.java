package com.yuan.controller;

import com.yuan.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: AjaxController
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/7/25-16:27
 * @Version: 1.0
 */
@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>" + name);
        if ("yuan".equals(name)) {
            response.getWriter().print("true");
        } else {
            response.getWriter().print("flase");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        ArrayList<User> userList = new ArrayList<>();

        //添加数据
        userList.add(new User("yuanaaaa",1,"男"));
        userList.add(new User("yuanbbbb",1,"女"));
        userList.add(new User("yuancccc",1,"男"));

        return userList;
    }
}
