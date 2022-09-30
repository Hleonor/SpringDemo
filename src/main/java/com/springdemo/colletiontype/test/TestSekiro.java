package com.springdemo.colletiontype.test;

import com.springdemo.colletiontype.Stu;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSekiro
{
    @Test
    public void testCollection()
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean5.xml");
        Stu stu = context.getBean("stu" , Stu.class);
        stu.test();
    }
}
