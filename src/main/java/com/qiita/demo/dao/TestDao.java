/*
 * TestDao.java
 *
 */

package com.qiita.demo.dao;

import java.util.List;

import com.qiita.demo.domain.tbl.TestBean;

public interface TestDao {


  List<TestBean> selectAll();

}