package aop.springdemo02.test;

import aop.springdemo02.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop
{
    @Test
    public void testAop()
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aopbean/bean01.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
}
