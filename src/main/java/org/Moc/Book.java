package org.Moc;
/**
 * @author moc
 * @date 2022-09-22 17:40
 */

public class Book
{
    private String bname;
    private String bauthor;
    private String address;
    public void setBname(String bname)
    {
        this.bname = bname;
    }

    public void setBauthor(String bauthor)
    {
        this.bauthor = bauthor;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void testDemo()
    {
        System.out.println(bauthor + " " + bname + " " + address);
    }
}
