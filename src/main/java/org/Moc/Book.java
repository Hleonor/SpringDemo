package org.Moc;
/**
 * @author moc
 * @date 2022-09-22 17:40
 */

public class Book
{
    private String bname;
    private String bauthor;

    public void setBname(String bname)
    {
        this.bname = bname;
    }

    public void setBauthor(String bauthor)
    {
        this.bauthor = bauthor;
    }

    public void testDemo()
    {
        System.out.println(bname + " : " + bauthor);
    }
}
