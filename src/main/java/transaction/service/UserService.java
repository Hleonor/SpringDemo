package transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import transaction.dao.UserDao;

@Service
public class UserService
{
    // 注入dao
    @Autowired
    private UserDao userDao;
}
