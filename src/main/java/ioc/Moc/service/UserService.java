package ioc.Moc.service;

import ioc.Moc.dao.UserDao;

public class UserService
{
    // 创建UserDao类型的属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao)
    {
        this.userDao = userDao;
    }

    public void add()
    {
        System.out.println("service add...");
        // 原始方式：创建UserDao对象
        //  UserDao userDao = new UserDaoImp1();
        //  userDao.update();
        userDao.update();
    }
}
