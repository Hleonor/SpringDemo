package transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import transaction.dao.UserDao;

@Service
@Transactional
public class UserService
{
    // 注入dao
    @Autowired
    private UserDao userDao;

    // 转账的方法
    public void accountMoney()
    {
//        try
//        {
//            // 第一步开启事务操作
//
//            // 第二步；进行业务操作
//

            // 只狼少100钱
            userDao.reduceMoney();

             // 模拟异常
             int i = 10 / 0;

            // 神子多100
            userDao.addMoney();

            // 第三步，没有异常，提交事务
//        }
//        catch (Exception ee)
//        {
//            // 第四步，捕获异常，事务rollback
//        }
    }
}
