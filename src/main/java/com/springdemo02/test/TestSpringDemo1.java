package com.springdemo02.test;

import com.springdemo02.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDemo1
{
    @Test
    public void testService()
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean02/bean1.xml");
        UserService userService = context.getBean("userService" , UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
