package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @program: spring-boot-04-web-restfulcrud
 * @description:
 * @author: zhangshulong
 * @create: 2018-07-11 15:56
 **/
@Controller
public class LoginCongtroller {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session) {
        if (!StringUtils.isEmpty(username) && "123".equals(password)){

            session.setAttribute("loginUser",username);
            //登录成功,防止表单重复提交,可以重定向到主页
            //return "dashboard";
            return "redirect:/tologin";
        }
        map.put("msg","用户名或密码错误");
        return "index";
    }
    @RequestMapping("/tologin")
    public String tologin(){
        return "dashboard";
    }
}
