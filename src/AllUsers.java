import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AllUsers  {
    HashMap<Integer,User> userHashMap = new HashMap<>(); //creating new hashmap as property

    public AllUsers() {
        this.userHashMap = createUsers();  //Method to add new user to the Hashmap Method
    }


         public HashMap<Integer, User> createUsers() {
             User user1 = new User("Robert","Smith","Robert@gmail.com");
             User user2 = new User("John","Miller","John@gmail.com");
             User user3 = new User("William","Davis","William@gmail.com");
             User user4 = new User("Charles","Rodriguez","Charles@gmail.com");
             User user5 = new User("Maria","Martinez","Maria@gmail.com");
             User user6 = new User("James","Lopez","James@gmail.com");
             User user7 = new User("Richard","Wilson","Richard@gmail.com");
             User user8 = new User("Anna","Anderson","Anna@gmail.com");
             User user9 = new User("Paul","Morre","Paul@gmail.com");
             User user10 = new User("Anne","Jackson","Anne@gmail.com");
             userHashMap.put(user1.getUser_ID(), user1);
             userHashMap.put(user2.getUser_ID(), user2);
             userHashMap.put(user3.getUser_ID(), user3);
             userHashMap.put(user4.getUser_ID(), user4);
             userHashMap.put(user5.getUser_ID(), user5);
             userHashMap.put(user6.getUser_ID(), user6);
             userHashMap.put(user7.getUser_ID(), user7);
             userHashMap.put(user8.getUser_ID(), user8);
             userHashMap.put(user9.getUser_ID(), user9);
             userHashMap.put(user10.getUser_ID(), user10);
             return userHashMap;
         }



    public void Display_AllUsers(){
         System.out.println("Printing all users");
        for(Map.Entry m : userHashMap.entrySet()){
            User users = (User)m.getValue();
            System.out.println("User_ID " +m.getKey() + " " + users.getUserFirstname() +" " +users.getUserLastname() +"  " +users.getUserEmail());
        }
    }

    public void CreateNewUser(){
        Scanner user_input = new Scanner(System.in);
        String userFirstname;
        System.out.println("Enter User First Name: ");
        userFirstname= user_input.next();
        String userLast_Name;
        System.out.println("Enter User Last Name: ");
        userLast_Name=user_input.next();
        String email;
        System.out.println("Enter User Email: ");
        email = user_input.next();
        User user = new User(userFirstname,userLast_Name,email);
        System.out.println("New User " +userFirstname +" " +userLast_Name +" has been created sucessfully!");
        userHashMap.put(user.getUser_ID(), user);
    }




}
