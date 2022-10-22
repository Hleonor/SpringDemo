package transaction.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void addMoney()
    {
        String sql = "update t_account set money = money + ? where user_name = ?";
        jdbcTemplate.update(sql, 100, "神子");
    }

    // 只狼向神子转账100
    // 扣钱
    @Override
    public void reduceMoney()
    {
        String sql = "update t_account set money = money - ? where user_name = ?";
        jdbcTemplate.update(sql, 100, "只狼");
    }
}
