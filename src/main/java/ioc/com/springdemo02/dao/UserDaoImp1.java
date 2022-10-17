package ioc.com.springdemo02.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImp1 implements UserDao
{
    @Override
    public void add()
    {
        System.out.println("Dao add.....");
    }
}
