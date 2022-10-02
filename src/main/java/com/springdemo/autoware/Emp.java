package com.springdemo.autoware;

public class Emp
{
    private Dept1 dept;

    public void setDept(Dept1 dept)
    {
        this.dept = dept;
    }

    @Override
    public String toString()
    {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test()
    {
        System.out.println(dept);
    }
}
