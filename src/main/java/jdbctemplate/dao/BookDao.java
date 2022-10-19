package jdbctemplate.dao;

import jdbctemplate.entity.Book;

public interface BookDao
{
    // 添加的方法
    void add(Book book);

    // 修改的方法
    void updateBook(Book book);

    // 删除的方法
    void deleteBook(String id);
}
