package com.wei.spring.service;

import com.wei.spring.dao.PersonDao;

import java.sql.SQLException;

/**
 * Created by WEI on 2017/5/15.
 */
public class PersonService {
    private PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void add(String sql) throws SQLException {
        this.personDao.addPerson(sql);
    }
}
