package com.springdemo02.service;

import org.springframework.stereotype.Component;

// 在注解里面value属性值可以省略不写，默认值是类名首字母小写
@Component(value = "userService") // 等价于 <bean id = "Sekiro" class="类的路径"
public class UserService
{
    public void add()
    {
        System.out.println("Service add.....");
    }
}
