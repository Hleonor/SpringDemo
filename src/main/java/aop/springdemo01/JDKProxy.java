package aop.springdemo01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import java.util.Arrays;


public class JDKProxy
{
    public static void main(String[] args)
    {
        // 创建接口实现类代理对象，保存了一系列的具体实现类
        Class[] interfaces = {UserDao.class};
        /*Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler()
        {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
            {
                return null;
            }
        });*/
        /**
         * 当需要增强逻辑时，只需要在invoke方法中添加即可
         * 当需要增加一个代理时，只需要在newProxyInstance方法中添加即可，并且需要实现InvocationHandler接口
         */
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        System.out.println("result = " + dao.add(1 , 2));
    }
}

// 创建代理对象代码
class UserDaoProxy implements InvocationHandler
{
    // 1、明确代理的对象，将被代理的对象传入
    // 通过有参构造传递
    public Object obj; // 本例中传入的类是userDao
    public UserDaoProxy(Object obj)
    {
        this.obj = obj;
    }

    // 增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        // 方法之前
        System.out.println("方法之前执行.... " + method.getName() + " :传递的参数 " + Arrays.toString(args));

        // 被增强的方法执行
        Object res = method.invoke(obj , args);

        // 方法之后
        System.out.println("方法之后执行...." + obj);
        return res;
    }
}
