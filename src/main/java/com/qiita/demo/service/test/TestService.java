package com.qiita.demo.service.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiita.demo.dao.TestDao;
import com.qiita.demo.domain.tbl.TestBean;


@Service
public class TestService {
  @Autowired
  private TestDao testDao;

  public List<TestBean> selectAll() {
    return testDao.selectAll();
  }
}