package com.springdemo02.service;

import com.springdemo02.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// 在注解里面value属性值可以省略不写，默认值是类名首字母小写
@Service(value = "userService") // 等价于 <bean id = "Sekiro" class="类的路径">
public class UserService
{
    // 定义dao类型属性
    // 不需要添加set方法
    // 添加注入属性注解
    @Autowired // 根据类型进行注入
    private UserDao userDao;
    public void add()
    {
        System.out.println("Service add.....");
        userDao.add();
    }
}
