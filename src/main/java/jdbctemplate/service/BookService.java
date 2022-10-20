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

    // 修改的方法
    public void updateBook(Book book)
    {
        bookDao.updateBook(book);
    }

    // 删除的方法
    public void deleteBook(String id)
    {
        bookDao.deleteBook(id);
    }

    // 查询表中的记录数
    public int findCount()
    {
        return bookDao.selectCount();
    }

    // 查询书籍信息
    public Book findOne(String id)
    {
        return bookDao.findBookInfo(id);
    }
}
