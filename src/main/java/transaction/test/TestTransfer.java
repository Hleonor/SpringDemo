package transaction.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import transaction.service.UserService;

public class TestTransfer
{
    @Test
    public void testAccount()
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("transaction/bean01.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
