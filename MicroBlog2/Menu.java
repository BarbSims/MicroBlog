import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;

public class Menu
{
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {

        int postorder = 1;
        String userID = null;
        ArrayList<User> listOfUsers = new ArrayList<User>();
        ArrayList<Post> listOfPosts = new ArrayList<Post>();

        while(true) {
            System.out.println("Main Menu");
            System.out.println("1) Create a new user");
            System.out.println("2) Become an existing user");
            System.out.println("3) Create a post as the current user");
            System.out.println("4) Print all posts");
            System.out.println("5) Print all users");
            System.out.println("6) Exit");

            if (userID != null)
            {
                System.out.println("You are currently user " + userID + ".  What do you want to do?");
            }

            System.out.print("> ");
            int action = keyboard.nextInt();
            keyboard.nextLine();

            if (action < 1 || action > 6)
            {
                System.out.println("That{is not a valid option. Please try again.");
            }
            System.out.println("");

            if (action == 1)
            {
                System.out.println("Please enter your name:");
                String newName = keyboard.nextLine();
                
                System.out.println("Please enter your email address:");
                String newEmail = keyboard.nextLine();

                
                System.out.println("Please enter your user ID:");
                String newUid = keyboard.nextLine();
                Boolean chkUser = false;
                for (User checkUser : listOfUsers) {
                    if (checkUser.getuID().equalsIgnoreCase(newUid)) 
                    {
                        chkUser = true;
                        //System.out.println("That userID is already in use.   Please choose a different User ID:");
                    }
                    if (chkUser) {
                        System.out.println("That User ID is already in use.   Please choose a different User ID:");
                        newUid = keyboard.nextLine();
                    }
                }
                System.out.println("Please enter your avatar URL:");
                String newAvUrl = keyboard.nextLine();


                    listOfUsers.add(new User(newAvUrl, newUid, newName, newEmail));

                }
            
                System.out.println("");

                if (action == 2) 
                {

                    for (User list : listOfUsers)  {
                        System.out.println(list.getuID());

                    }

                    System.out.print("Choose the user: ");
                    String intendedUserName = keyboard.nextLine();

                    Boolean userFound = false;
                    for (User list : listOfUsers) {
                        if (list.getuID().equalsIgnoreCase(intendedUserName)) {
                            userID = list.getuID();
                            userFound = true;
                        }
                    }
                    for (User list : listOfUsers) {
                        if (!userFound) {
                            System.out.println("That is not a valid user.");
                            break;
                        }
                    }

                }
                if (action == 3) first:
                {
                    if (userID == null)
                    {
                        System.out.println("Please choose a user before creating a post");
                        break first;
                    }

                    String userLastPost = null;
                    for(Post curPost : listOfPosts) 
                        if (curPost.getUID().equalsIgnoreCase(userID)) 
                        {
                            userLastPost = curPost.getPostInfo();  
                        }

                    if (userLastPost != null)
                    {
                        System.out.println(userLastPost);
                    }
                    System.out.println("You are currently user " + userID + ".  Create your post.");
                    String createPost = keyboard.nextLine();
                    System.out.println("Enter a web address link for your post if applicable:");
                    String createLink = keyboard.nextLine();

                    listOfPosts.add(new Post(postorder, userID, createPost, createLink));
                    System.out.println("");
                    postorder++;

                }

                if (action == 4)
                {

                    if (listOfPosts != null)
                        for(Post list : listOfPosts) 
                        {

                            System.out.println(list.getPostInfo());
                        }

                }

                if (action == 5)
                {
                    for (User list : listOfUsers) {

                        System.out.println(list.getUserInfo());

                    }

                }
                System.out.println("");
                if (action == 6)
                {
                    break;
                }

            }
        }
    }
