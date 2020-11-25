import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import java.util.ArrayList;

public class AllEvents {

    // If you create a new Event object -> automatically put it inside
    // create an arraylist with Events(objects) inside
    // allEvents

    // create new Event()

    private HashMap<Integer,User> userHashMap = new HashMap<>();

    public static ArrayList<Event> createEvents() {
        Event e1= new Event(10000,99.00,1.00,"Event1",
                "2",LocalDate.of(2021,02,22),Category.BASKETBALL,Status.UPCOMING, 800);
        ArrayList<Event> events = new ArrayList<>();
        events.add(e1);
        return events;
    }

    public static void main(String[] args) {

            Event e1= new Event(10000,99.00,1.00,"Event1",
                    "2",LocalDate.of(2021,02,22),Category.BASKETBALL,Status.UPCOMING, 8000);

            Event.allEvents.add(e1);
            Event.allEvents.add(new Event(8000,25.00,2.00,"Event2","2v2",
                    LocalDate.of(2021,02,11),Category.TENNIS,Status.UPCOMING, 400));
            Event.allEvents.add(new Event(15000,49.00,3.00,"Event3","11v11",
                    LocalDate.of(2021,01,25),Category.FOOTBALL,Status.CANCELLED, 700));
            Event.allEvents.add(new Event(8800,85.00,5.00,"Event4","2vs2",
                    LocalDate.of(2021,06,11),Category.BADMINTON,Status.UPCOMING, 1));
            Event.allEvents.add(new Event(7000,77.00,2.00,"Event5","20vs20",
                    LocalDate.of(2021,06,01),Category.SWIMMING,Status.CANCELLED, 300));

        ArrayList<Event> allEvents = Event.EventList();
        User user = new User("kiri","lion","@gmail.com");
        User user1 = new User("kiri2","lion2","2@gmail.com");

        //Event.createEvent();



        //System.out.println(allEvents);
        //Event.displayUpcomingEvents();
        //Event.displayCancelledEvents();
        e1.addUsertoEvent(user);
        //e1.addUsertoEvent(user1);

        //Event.DisplayPricePoolEvent();
        //Event.DisplayAllEvents();
        //Event.DisplayPricePoolEvent();

        //Event.DisplayAllEvents();
        //Event.editEventDateStatus();



    }

}
