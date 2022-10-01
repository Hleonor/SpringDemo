package com.springdemo.test;

import com.springdemo.bean.Orders;
import com.springdemo.colletiontype.Book;
import com.springdemo.colletiontype.Course;
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

    @Test
    public void testBook()
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean6.xml");
        Book book = context.getBean("book" , Book.class);
        Book book1 = context.getBean("book" , Book.class);
        // book.testList();
        System.out.println(book);
        System.out.println(book1);
    }

    @Test
    public void testBean2()
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean7.xml");
        Course course = context.getBean("myBean" , Course.class);
        System.out.println(course);
    }

    @Test
    public void  testBean3()
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean8.xml");
        Orders orders = context.getBean("orders" , Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);

        // 手动销毁bean实例
        ((ClassPathXmlApplicationContext)context).close();
    }

}