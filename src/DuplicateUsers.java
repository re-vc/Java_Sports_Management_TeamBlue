import java.util.HashMap;
import java.util.Map;

public class DuplicateUsers {

    public static HashMap<Integer, User> Display_AllUsers(){
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

        HashMap<Integer,User> allUsers = new HashMap<>();
        allUsers.put(user1.getUser_ID(),user1);
        allUsers.put(user2.getUser_ID(),user2);
        allUsers.put(user3.getUser_ID(),user3);
        allUsers.put(user4.getUser_ID(),user4);
        allUsers.put(user5.getUser_ID(),user5);
        allUsers.put(user6.getUser_ID(),user6);
        allUsers.put(user7.getUser_ID(),user7);
        allUsers.put(user8.getUser_ID(),user8);
        allUsers.put(user9.getUser_ID(),user9);
        allUsers.put(user10.getUser_ID(),user10);

        //printing all users
        System.out.println("Printing all users");
        for(Map.Entry m : allUsers.entrySet()){
            User users = (User)m.getValue();
            System.out.println("User_ID " +m.getKey() + " " + users.getUserFirstname() +" " +users.getUserLastname() +"  " +users.getUserEmail());
        }
        return allUsers;
    }






}
