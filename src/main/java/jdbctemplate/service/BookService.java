package jdbctemplate.service;

import jdbctemplate.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService
{
    // 注入dao
    @Autowired
    private BookDao bookDao;
}