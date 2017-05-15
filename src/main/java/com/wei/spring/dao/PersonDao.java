package com.wei.spring.dao;

import java.sql.SQLException;

/**
 * Created by WEI on 2017/5/15.
 */
public interface PersonDao {
    void addPerson(String sql) throws SQLException;
}
