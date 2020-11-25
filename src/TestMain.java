import java.time.LocalDate;
import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        //Display all users
       AllUsers allUsers = new AllUsers();
        ArrayList<Event> allEvents = AllEvents.createEvents();
        Event e1= new Event(10000,99.00,1.00,"Event1",
                "2", LocalDate.of(2021,02,22),Category.BASKETBALL,Status.UPCOMING, 10000);
       User user = new User("sari","laiki" ,"@gmail.com");


       /*allUsers.Display_AllUsers();

       allUsers.CreateNewUser();

       allUsers.Display_AllUsers();
       allUsers.addUsertoEventMenu();*/
        e1.addUsertoEvent(user);





    }
}
