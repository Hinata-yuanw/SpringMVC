package com.yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author yuan.wang
 * @date 2022/7/3 - 19:09
 */
@Controller
public class ModeTest1 {

    @RequestMapping ("/m1/t1")
    public String test1(Model model){
        model.addAttribute("msg","ModelTest1");
        return "redirect:/index.jsp";
    }

}
