import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;

public class AllEvents {

    // If you create a new Event object -> automatically put it inside
    // create an arraylist with Events(objects) inside
    // allEvents

    // create new Event()



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

        //Event.createEvent();



        //System.out.println(allEvents);
        //Event.displayUpcomingEvents();
        //Event.displayCancelledEvents();
        //Event.DisplayPricePoolEvent();
        //Event.DisplayAllEvents();
        //Event.DisplayPricePoolEvent();

        Event.DisplayAllEvents();
        //Event.editEventDateStatus();



    }

}
