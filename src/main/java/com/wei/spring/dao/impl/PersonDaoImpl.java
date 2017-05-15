package com.wei.spring.dao.impl;

import com.wei.spring.dao.DaoTemplate;
import com.wei.spring.dao.PersonDao;

import java.sql.SQLException;

/**
 * Created by WEI on 2017/5/15.
 */
public class PersonDaoImpl extends DaoTemplate implements PersonDao{
    public void addPerson(String sql) throws SQLException {
        System.out.println("开始保存人员...");
        this.insert(sql);
    }
}
