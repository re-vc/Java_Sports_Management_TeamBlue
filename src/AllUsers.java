import java.lang.invoke.StringConcatException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AllUsers  {
    private HashMap<Integer,User> userHashMap = new HashMap<>(); //creating new hashmap as property

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

    public void CreateNewUser() {

        Scanner user_input = new Scanner(System.in);
        String userFirstname;
        System.out.println("Enter User First Name: ");
        userFirstname = user_input.next();
        String userLast_Name;
        System.out.println("Enter User Last Name: ");
        userLast_Name = user_input.next();
        String email;
        System.out.println("Enter User Email: ");
        email = user_input.next();
            User user = new User(userFirstname, userLast_Name, email);
            System.out.println("New User " + userFirstname + " " + userLast_Name + " has been created sucessfully!");
            userHashMap.put(user.getUser_ID(), user);
            }

    public HashMap<Integer, User> getUserHashMap() {
        return userHashMap;
    }

    public void setUserHashMap(HashMap<Integer, User> userHashMap) {
        this.userHashMap = userHashMap;
    }

    public void addUsertoEvent(User user){
        //int Old_viewers = Event.
    }
    public boolean addUsertoEventMenu() {
        int n=0;
        do {
            try {

                int user;
                System.out.println("Choose User to add to the Event");
                System.out.println("1) " + this.userHashMap.get(1));
                System.out.println("2) " + this.userHashMap.get(2));
                System.out.println("3) " + this.userHashMap.get(3));
                System.out.println("4) " + this.userHashMap.get(4));
                System.out.println("5) " + this.userHashMap.get(5));
                System.out.println("6) " + this.userHashMap.get(6));
                System.out.println("7) " + this.userHashMap.get(7));
                System.out.println("8) " + this.userHashMap.get(8));
                System.out.println("9) " + this.userHashMap.get(9));
                System.out.println("10) " + this.userHashMap.get(10));

                Scanner sc = new Scanner(System.in);
                System.out.println("Please make selection from 1 to 10 users");
                int choice= sc.nextInt();

                switch (choice) {
                    case 1:

                        System.out.println("Here will be adding method which add the user to event");
                        break;

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }while (n==0);
        return true;
    }

}

