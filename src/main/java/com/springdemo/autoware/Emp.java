package com.springdemo.autoware;

public class Emp
{
    private Department dept;

    public void setDept(Department dept)
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
