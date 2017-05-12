import java.util.ArrayList;
import java.util.Iterator;

public class User
{
    
    
        private String avurl;
        private String uID;
        private String name;
        private String email;
        

        public User(String avurl, String uID, String name, String email)
        {
            this.avurl = avurl;
            this.uID = uID;
            this.name = name;
            this.email = email;
           

        }

        

        public String getUserInfo()
        {
            return "User " + uID + " Information: " + name + ", " + email + ", " + avurl;

        } 

        public String getUserID()
        {
            return uID;

        }

        public String getAvurl() {
            return avurl;
        }

        public void setAvurl(String avurl) {
            this.avurl = avurl;
        }

        public String getuID() {
            return uID;
        }

        public void setuID(String uID) {
            this.uID = uID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }


