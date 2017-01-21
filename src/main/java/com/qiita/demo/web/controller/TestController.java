package com.qiita.demo.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qiita.demo.domain.tbl.TestBean;
import com.qiita.demo.service.test.TestService;


@Controller
public class TestController {
   @Autowired
   private TestService testService;

  @RequestMapping("/test")
  @ResponseBody
  public String home() {
      String returnStr = "";
      List<TestBean> list = testService.selectAll();
      for (TestBean testBean : list) {
          returnStr += "id  :" + testBean.getId() + " ";
          returnStr += "name:" + testBean.getName() + "<br>";
      }
      return returnStr;
  }
}