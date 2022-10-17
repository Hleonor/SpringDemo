package ioc.com.springdemo02.test;

import ioc.com.config.SpringConfig;
import ioc.com.springdemo02.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringDemo1
{
    @Test
    public void testUserService()
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean02/bean1.xml");
        UserService userService = context.getBean("userService" , UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testUserService2()
    {
        // 1.加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService" , UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
