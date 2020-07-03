package com.example.test.controller;

/**
 * Created by babywaiting on 2020/7/2 1:50 PM.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

//    @RequestMapping("/portal/login")
//    public String login(){
//        return "login";
//    }


}
