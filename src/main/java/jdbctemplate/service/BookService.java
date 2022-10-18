package jdbctemplate.service;

import jdbctemplate.dao.BookDao;
import jdbctemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService
{
    // 注入dao
    @Autowired
    private BookDao bookDao;

    // 添加的方法
    public void addBook(Book book)
    {
        bookDao.add(book);
    }
}
