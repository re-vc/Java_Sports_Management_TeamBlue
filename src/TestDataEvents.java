
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class TestDataEvents {

        private static void TestDataEvents(){
            Event e1= new Event(10000,99.00,1.00,"Event1",
                    "2",LocalDate.of(2021,02,22),Category.BASKETBALL,Status.UPCOMING);

            Event.getAllEvents1().add(e1);
            Event.getAllEvents1().add(new Event(8000,25.00,2.00,"Event2","2v2",
                    LocalDate.of(2021,02,11),Category.TENNIS,Status.UPCOMING));
            Event.getAllEvents1().add(new Event(15000,49.00,3.00,"Event3","11v11",
                    LocalDate.of(2021,01,25),Category.FOOTBALL,Status.UPCOMING));
            Event.getAllEvents1().add(new Event(8800,85.00,5.00,"Event4","2vs2",
                    LocalDate.of(2021,06,11),Category.BADMINTON,Status.UPCOMING));
            Event.getAllEvents1().add(new Event(7000,77.00,2.00,"Event5","20vs20",
                    LocalDate.of(2021,06,01),Category.SWIMMING,Status.UPCOMING));


        }




}
