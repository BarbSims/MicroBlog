import java.util.ArrayList;
import java.util.Iterator;

public class Post
{
    private int postOrder;
    private String name;
    private String email;
    private String post;
    private String uID;
    private String siteLink;

    public Post(int postOrder, String uID, String post, String siteLink)
    {
        this.postOrder = postOrder;
        this.uID = uID;
        this.name = name;
        this.email = email;
        this.post = post;
        this.siteLink = siteLink;
    }
    public String getUID()
    {
        return uID;
    }

    public String getPostInfo()
    {

        return "Post Order = "  + postOrder + ", " + post + ", "  + uID + ", " + siteLink;
 
    }
    public String getPostInfoWithSiteLink()
    {

        return postOrder + " - " + post + ", " + siteLink + ", " + uID;

    }

    public int getpostOrder()
    {
        return postOrder;
    }

    public String getname()
    {
        return name;
    }

    public String getemail()
    {
        return email;
    }
}
