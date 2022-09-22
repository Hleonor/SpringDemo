package org.Moc;
/**
 * @author moc
 * @date 2022-09-22 18:02
 */

public class Orders
{
    /**
     * 使用有参构造注入
     */
    private final String oname;
    private final String oaddress;

    public Orders(String oname, String oaddress)
    {
        this.oname = oname;
        this.oaddress = oaddress;
    }

    public void testDemo()
    {
        System.out.println(oname + " : " + oaddress);
    }
}
