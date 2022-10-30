package transaction.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import transaction.config.TxConfig;
import transaction.service.UserService;

public class TestTransfer
{
    /*@Test
    public void testAccount()
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("transaction/bean01.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }*/
    /*@Test
    public void testAccount02()
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("transaction/bean02.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }*/
    @Test
    public void testAccount03()
    {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    // 函数式风格创建对象，交给spring管理
    @Test
    public void testGenericApplication()
    {
        // 1.创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        // 2.调用context的方法对象注册
        context.refresh();
        context.registerBean("user1", User.class, () -> new User());
        // 3.获取在spring注册的对象
        User user = (User) context.getBean("user1");
        System.out.println(user);
    }
}
