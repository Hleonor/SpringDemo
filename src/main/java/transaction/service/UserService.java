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

    // 转账的方法
    public void accountMoney()
    {
        // 只狼少100钱
        userDao.reduceMoney();

        // 神子多100
        userDao.addMoney();
    }
}
