package jdbctemplate.test;

import jdbctemplate.entity.Book;
import jdbctemplate.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

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
//        Book book = bookService.findOne("1");
//        System.out.println(book);

        // 查询返回集合
//        List<Book> all = bookService.findAll();
//        System.out.println(all);

        // 批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"6", "寄鹰斩", "B"};
//        Object[] o2 = {"7", "不死斩", "S"};
//        Object[] o3 = {"8", "雷电奉还", "S++"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchAdd(batchArgs);

        // 批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"旋风斩", "B", "6"};
//        Object[] o2 = {"仙峰脚", "B", "7"};
//        Object[] o3 = {"识破", "SS++", "8"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        bookService.batchUpdate(batchArgs);

        // 批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"5"};
        Object[] o3 = {"1"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchDelete(batchArgs);
    }
}
