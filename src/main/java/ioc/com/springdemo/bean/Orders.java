package ioc.com.springdemo.bean;

public class Orders
{
    private String oname;

    // 无参构造
    public Orders()
    {
        System.out.println("第一步 执行无参数构造创建bean");
    }

    public void setOname(String oname)
    {
        this.oname = oname;
        System.out.println("第二步 调用set方法设置属性的值");
    }

    // 创建执行化的初始化方法
    public void initMethod()
    {
        System.out.println("第三步 执行初始化方法");
    }

    // 销毁执行化的初始化方法
    public void destroyMethod()
    {
        System.out.println("第五步 执行销毁方法");
    }
}
