package jdbctemplate.entity;

public class Book
{
    @Override
    public String toString()
    {
        return "Book{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", uStatus='" + uStatus + '\'' +
                '}';
    }

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getuStatus()
    {
        return uStatus;
    }

    public void setuStatus(String uStatus)
    {
        this.uStatus = uStatus;
    }

    private String userId;
    private String userName;
    private String uStatus;
}
