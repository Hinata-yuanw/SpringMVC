package com.yuan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/8/30-20:50
 * @Version: 1.0
 */
@RestController
public class TestController {

    @GetMapping("/t1")
    public String test(){
        System.out.println("TestController==>test()执行了");
        return "ok";
    }
}
