package org.Moc.springtest;

import org.Moc.User;
import org.Moc.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean
{
    @Test
    public void testAdd()
    {
        // 1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        // 2、获取配置文件创建的对象
        UserService userService = context.getBean("userService" , UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
