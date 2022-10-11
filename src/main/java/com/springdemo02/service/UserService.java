package com.springdemo02.service;

import com.springdemo02.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

// 在注解里面value属性值可以省略不写，默认值是类名首字母小写
@Service(value = "userService") // 等价于 <bean id = "Sekiro" class="类的路径">
public class UserService
{
    // 定义dao类型属性
    // 不需要添加set方法
    // 添加注入属性注解
    /*@Autowired // 根据类型进行注入，当一个接口有多个实现类的时候是无法确定要使用哪一个进行注入的
    @Qualifier(value = "userDaoImp2") // 根据名称进行注入
    private UserDao userDao;*/

    @Resource(name = "userDaoImp2") // 相当于上面两个注解的结合，使用resource需要指定name属性
    private UserDao userDao;

    public void add()
    {
        System.out.println("Service add.....");
        userDao.add();
    }
}
