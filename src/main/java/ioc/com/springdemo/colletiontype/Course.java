package ioc.com.springdemo.colletiontype;

public class Course
{
    // 课程名称
    private String cname;

    public void setCname(String cname)
    {
        this.cname = cname;
    }

    @Override
    public String toString()
    {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
