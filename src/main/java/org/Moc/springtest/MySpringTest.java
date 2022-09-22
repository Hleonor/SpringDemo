package org.Moc.springtest;

import org.Moc.Book;
import org.Moc.Orders;
import org.Moc.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author moc
 * @date 2022-09-22 16:42
 */
public class MySpringTest
{
    @Test
    public void testAdd()
    {
        // 1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2、获取配置文件创建的对象
        User user = context.getBean("user" , User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1()
    {
        // 1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2、获取配置文件创建的对象
        Book book = context.getBean("book" , Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders()
    {
        // 1、加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2、获取配置文件创建的对象
        Orders orders = context.getBean("orders" , Orders.class);
        System.out.println(orders);
        orders.testDemo(); }
}
