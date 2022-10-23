package transaction.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
}