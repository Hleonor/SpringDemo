package aop.springdemo02;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class PersonProxy
{
    @Before(value = "execution(* aop.springdemo02.User.add(..))")
    // 后置通知，返回通知，有异常不会执行
    public void afterReturning()
    {
        System.out.println("Person Before....");
    }
}
