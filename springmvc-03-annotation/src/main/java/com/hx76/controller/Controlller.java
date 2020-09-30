package com.hx76.controller;

import com.hx76.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controlller {
   @RequestMapping(value="/hello")
    public String hello(User user, Model model){
        model.addAttribute("msg","hello!!");
        // 会被视图解析器处理
        return "redirect:/hello.jsp";
    }
}
