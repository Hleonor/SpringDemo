package com.springdemo02.dao;

import org.springframework.stereotype.Repository;

@Repository // 有注解才能被扫描到
public class UserDaoImp2 implements UserDao
{
    @Override
    public void add()
    {
        System.out.println("Dao2 add.....");
    }
}

