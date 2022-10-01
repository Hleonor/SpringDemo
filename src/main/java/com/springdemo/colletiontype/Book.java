package com.springdemo.colletiontype;

import java.util.List;

public class Book
{
    private List<String> list;

    public void setList(List<String> list)
    {
        this.list = list;
    }

    public void testList()
    {
        System.out.println(list);
    }
}
