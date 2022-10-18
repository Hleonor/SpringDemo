package jdbctemplate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao
{
    // 注入JdbcTemplate，这个类是Spring提供的用于简化数据库操作的类，注入之后就可以直接使用
    @Autowired
    private JdbcTemplate jdbcTemplate;
}
