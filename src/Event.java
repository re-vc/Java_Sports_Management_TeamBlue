import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Event {

    private int eventID;
    private int eventRating;
    private int numberOfViewers;
    private int maxUsers;
    private double ticketPrice;
    private double pricePool;
    private String eventName;
    private String numberOfPlayers;
    private LocalDate eventDate;

    //enums
    private Category eventCategory;
    private Status eventStatus;

    private static int counter = 1;

    private ArrayList<User> users;
    public static ArrayList<Event> allEvents = new ArrayList<Event>();

    public static ArrayList<Event> EventList() {
        return allEvents;
    }


    // constructor(s)

    public Event(int maxUsers, double ticketPrice, double pricePool, String eventName, String numberOfPlayers, LocalDate eventDate, Category eventCategory, Status eventStatus) {
        this.eventID = counter++;
        this.maxUsers = maxUsers;
        this.ticketPrice = ticketPrice;
        this.pricePool = pricePool;
        this.eventName = eventName;
        this.numberOfPlayers = numberOfPlayers;
        this.eventDate = eventDate;
        this.eventCategory = eventCategory;
        this.eventStatus = eventStatus;
        this.users = new ArrayList<>();
    }

    public Event(){}

    public static Event createEvent(){
        System.out.println("type max Users");
        Scanner in = new Scanner(System.in);
        int maxUsers = in.nextInt();

        System.out.println("type ticket price");
        double ticketPrice = in.nextDouble();

        System.out.println("type price pool");
        double pricePool = in.nextDouble();

        System.out.println("type event name");
        String asdf = in.nextLine();  //for some reason it doesnt work without this unused line
        String eventName = in.nextLine();

        System.out.println("type number of players");
        String numberOfPlayers = in.nextLine();

        System.out.println("type event date(please enter this format d/MM/yyyy)");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String date = in.nextLine();
        LocalDate newDate = LocalDate.parse(date, formatter);

        System.out.println("type event Category: ");
        System.out.println("Tennis");
        System.out.println("Baseball");
        System.out.println("Football");
        System.out.println("Swimming");
        System.out.println("Badminton");
        System.out.println("Basketball");
        String eventCategory = in.next();
        Category category = Category.valueOf(eventCategory.toUpperCase());

        switch (category){
            case TENNIS:
                break;
            case BASEBALL:
                break;
            case FOOTBALL:
                break;
            case SWIMMING:
                break;
            case BADMINTON:
                break;
            case BASKETBALL:
                break;
        }

        System.out.println("type event Status:");
        System.out.println("Upcoming");
        System.out.println("Cancelled");
        String eventStatus = in.next();
        Status status = Status.valueOf(eventStatus.toUpperCase());

        switch (status){
            case UPCOMING:
                break;
            case CANCELLED:
                break;
        }

        Event event = new Event(maxUsers, ticketPrice, pricePool, eventName, numberOfPlayers, newDate, category, status);

        allEvents.add(event);
        return event;
    }

    public static void DisplayAllEvents(){
        for (int i = 0; i < allEvents.size(); i++){
            System.out.println(allEvents.get(i).getEventName() + " | " + allEvents.get(i).getEventCategory() + " | " +  allEvents.get(i).getEventDate() + " | Ticket price: € " +  allEvents.get(i).getTicketPrice() + ",- | " + allEvents.get(i).getNumberOfPlayers() + " players | " + allEvents.get(i).getEventStatus());
        }
    }

    public static void DisplayPricePoolEvent(){
        System.out.println("type Event Name to display price pool");
        Scanner in = new Scanner(System.in);
        String eventName1 = in.nextLine();
        for (int i = 0; i < allEvents.size(); i++){
            if (eventName1.toUpperCase().equals(allEvents.get(i).eventName.toUpperCase())) {
                System.out.println(allEvents.get(i).eventName + " prize pool is € " + allEvents.get(i).pricePool + ",-");
            }
        }
    }

    // getter | setter

    public int getMaxUsers() {
        return maxUsers;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public Category getEventCategory() {
        return eventCategory;
    }

    public Status getEventStatus() {
        return eventStatus;
    }

    public static int getCounter() {
        return counter;
    }

    public int getEventID() {
        return eventID;
    }

    public int getEventRating() {
        return eventRating;
    }

    public int getNumberOfViewers() {
        return numberOfViewers;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public double getPricePool() {
        return pricePool;
    }

    public String getEventName() {
        return eventName;
    }

    public String getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public void setEventRating(int eventRating) {
        this.eventRating = eventRating;
    }

    public void setNumberOfViewers(int numberOfViewers) {
        this.numberOfViewers = numberOfViewers;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public void setPricePool(double pricePool) {
        this.pricePool = pricePool;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setNumberOfPlayers(String numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public void setEventCategory(Category eventCategory) {
        this.eventCategory = eventCategory;
    }

    public void setEventStatus(Status eventStatus) {
        this.eventStatus = eventStatus;
    }

        public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public static ArrayList<Event> getAllEvents() {
        return allEvents;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public static void setAllEvents(ArrayList<Event> allEvents) {
        Event.allEvents = allEvents;
    }
    public static void displayUpcomingEvents(){
        System.out.println("All Upcoming Events");
        for(int i=0;i<allEvents.size();i++){
            if (allEvents.get(i).getEventStatus()==Status.UPCOMING){
                System.out.println(allEvents.get(i));
            }
        }

    }
    public static void displayCancelledEvents(){
        System.out.println("All Cancelled Events");
        for(int i=0;i<allEvents.size();i++){
            if(allEvents.get(i).getEventStatus()==Status.CANCELLED){
                System.out.println(allEvents.get(i));
            }
        }
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventID=" + eventID +
                ", eventRating=" + eventRating +
                ", numberOfViewers=" + numberOfViewers +
                ", maxUsers=" + maxUsers +
                ", ticketPrice=" + ticketPrice +
                ", pricePool=" + pricePool +
                ", eventName='" + eventName + '\'' +
                ", numberOfPlayers='" + numberOfPlayers + '\'' +
                ", eventDate=" + eventDate +
                ", eventCategory=" + eventCategory +
                ", eventStatus=" + eventStatus +
                '}';
    }
}