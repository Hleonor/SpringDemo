package jdbctemplate.dao;

import jdbctemplate.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao
{
    // 注入JdbcTemplate，这个类是Spring提供的用于简化数据库操作的类，注入之后就可以直接使用
    @Autowired // AutoWired的作用是自动注入，这里是自动注入JdbcTemplate
    private JdbcTemplate jdbcTemplate;

    // 添加的方法
    @Override
    public void add(Book book)
    {
        // jdbcTemplate已经被创建并且注入了，直接使用即可
        // 1、创建sql语句
        String sql = "insert into t_book values(?,?,?)";
        // 2、调用方法实现
        Object[] args = {book.getUserId(), book.getUserName(), book.getuStatus()};
        // int update = jdbcTemplate.update(sql, book.getUserId(), book.getUserName(), book.getuStatus());
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void updateBook(Book book)
    {
        String sql = "update t_book set username=?, ustatus=? where user_id=?";
        Object[] args = {book.getUserName(), book.getuStatus(), book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void deleteBook(String id)
    {
        String sql = "delete from t_book where user_id=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);

    }
}
