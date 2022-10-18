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
        Book book = new Book();
        book.setUserId("1");
        book.setUserName("苇名流");
        book.setuStatus("S++");
        bookService.addBook(book);

    }
}
