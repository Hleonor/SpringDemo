package ioc.Moc.bean;

public class Emp
{
    private String ename;
    private String gender;

    // 员工属于某一个公司
    private Dept dept;

    public void setDept(Dept dept)
    {
        this.dept = dept;
    }

    public void setEname(String ename)
    {
        this.ename = ename;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public Dept getDept()
    {
        return dept;
    }

    public void add()
    {
        System.out.println(ename + "::" + "gender: " + dept.toString());
    }
}
