package com.qiita.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController
{
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!";
    }
}