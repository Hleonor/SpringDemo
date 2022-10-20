package jdbctemplate.dao;

import jdbctemplate.entity.Book;

import java.util.List;

public interface BookDao
{
    // 添加的方法
    void add(Book book);

    // 修改的方法
    void updateBook(Book book);

    // 删除的方法
    void deleteBook(String id);

    // 查询表中的记录数
    int selectCount();

    // 返回书籍信息对象
    Book findBookInfo(String id);

    // 查询返回集合
    List<Book> findAllBook();
}
