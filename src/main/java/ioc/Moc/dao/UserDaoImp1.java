package ioc.Moc.dao;

public class UserDaoImp1 implements UserDao
{
    @Override
    public void update()
    {
        System.out.println("dao update...");
    }
}
