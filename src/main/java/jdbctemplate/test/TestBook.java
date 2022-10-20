package jdbctemplate.test;

import jdbctemplate.entity.Book;
import jdbctemplate.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook
{
    @Test
    public void testJdbcTemplate()
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("jdbctemplate/bean01.xml");

        BookService bookService = context.getBean("bookService", BookService.class);
        // 添加
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUserName("苇名流");
//        book.setuStatus("S++");
//        bookService.addBook(book);

        // 修改
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUserName("丈的手记");
//        book.setuStatus("S");
//        bookService.updateBook(book);

        // 删除
//        bookService.deleteBook("1");

        // 查询某个值
//        int count = bookService.findCount();
//        System.out.println("查询结果: " + count);

        // 查询返回对象
        Book book = bookService.findOne("1");
        System.out.println(book);
    }
}
