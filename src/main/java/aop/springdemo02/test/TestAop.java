package aop.springdemo02.test;

import aop.springdemo02.User;
import aop.springdemo02.aopxml.Book;
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
        user.add(); // 调用被增强的方法
    }

    @Test
    public void testAopXml()
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aopxml/bean.xml");
        Book book = context.getBean("book", Book.class);

        book.buy(); // 调用被增强的方法
    }
}
