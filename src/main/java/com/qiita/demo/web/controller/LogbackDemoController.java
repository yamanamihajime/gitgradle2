package com.qiita.demo.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LogbackDemoController
{
    @Autowired
    private JdbcTemplate jdbc;

    @RequestMapping("/demo")
    @ResponseBody
    public String home() {

        List<Map<String, Object>> list = jdbc.queryForList("SELECT * FROM demo");

        return "";
    }
}