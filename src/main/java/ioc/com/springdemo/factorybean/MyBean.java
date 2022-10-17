package ioc.com.springdemo.factorybean;

import ioc.com.springdemo.colletiontype.Course;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Course>
{
    @Override
    public boolean isSingleton()
    {
        return FactoryBean.super.isSingleton();
    }

    // 定义返回bean
    @Override
    public Course getObject() throws Exception
    {
        Course course = new Course();
        course.setCname("Sekiro");
        return course;
    }

    @Override
    public Class<?> getObjectType()
    {
        return null;
    }
}
