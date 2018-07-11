package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @program: spring-boot-04-web-restfulcrud
 * @description:
 * @author: zhangshulong
 * @create: 2018-07-10 11:08
 **/
@Controller
public class HelloWorld {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello world";
    }
    @RequestMapping("/success")
    public String success(Map<String,Object> map) {
        map.put("hello","<h1>你好</h1>");

        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }
}
