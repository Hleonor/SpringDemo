package ioc.Moc;
/**
 * @author moc
 * @date 2022-09-22 18:29
 */

public class Student
{
    private String sname;
    private String sage;

    public void setSname(String sname)
    {
        this.sname = sname;
    }

    public void setSage(String sage)
    {
        this.sage = sage;
    }

    public void testStudent()
    {
            System.out.println(sname + " : " + sage);
    }
}
