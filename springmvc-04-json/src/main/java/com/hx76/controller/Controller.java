package com.hx76.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hx76.pojo.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//所有方法都不会走视图解析器，而是返回一个字符串
@RestController
public class Controller {
    //fastjson
    @RequestMapping("/j1")
    public String json1(){
        List<User> userList = new ArrayList<User>();
        userList.add(new User(5,"张三","123456"));
        userList.add(new User(6,"张6","1234567"));
        return JSON.toJSONString(userList);
    }

    //jackjson
    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        List<User> userList = new ArrayList<User>();
        userList.add(new User(5,"张三","123456"));
        userList.add(new User(6,"张6","1234567"));
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(userList);
    }
}
