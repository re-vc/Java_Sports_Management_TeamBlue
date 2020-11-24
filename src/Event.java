import java.time.LocalDate;
import java.util.ArrayList;

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

    //private ArrayList<User> users = new ArrayList<User>();

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

    // method(s)


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