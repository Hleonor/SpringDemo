package aop.springdemo01;

public class UserDaoImpl implements UserDao
{
    @Override
    public int add(int a, int b)
    {
        System.out.println("add...");
        return a + b;
    }

    @Override
    public String update(String id)
    {
        System.out.println("update...");
        return id;
    }
}
