package aop.springdemo02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

// 增强的类
@Component
@Aspect // 生成代理对象
public class UserProxy
{
    // 相同切入点抽取
    @Pointcut(value = "execution(* aop.springdemo02.User.add(..))")
    public void pointDemo()
    {

    }

    // 前置通知
    // @Before注解表示作为前置通知
    // @Before(value = "execution(* aop.springdemo02.User.add(..))")
    @Before(value = "pointDemo()")
    public void before()
    {
        System.out.println("before....");
    }

    @After(value = "execution(* aop.springdemo02.User.add(..))")
    // 最终通知，不论有没有异常都会执行
    public void after()
    {
        System.out.println("after....");
    }

    @AfterReturning(value = "execution(* aop.springdemo02.User.add(..))")
    // 后置通知，返回通知，有异常不会执行
    public void afterReturning()
    {
        System.out.println("after returning....");
    }

    @AfterThrowing(value = "execution(* aop.springdemo02.User.add(..))")
    public void afterThrowing()
    {
        System.out.println("after throwing....");
    }

    // 环绕通知
    @Around(value = "execution(* aop.springdemo02.User.add(..))")
    public void afterAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        System.out.println("环绕之前....");
        // 被增强的方法
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后....");
    }
}
