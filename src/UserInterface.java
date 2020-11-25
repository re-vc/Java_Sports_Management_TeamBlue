import java.util.Scanner;


public class UserInterface {

    public UserInterface() {}

    public void printHeader() {
        System.out.println(" ---------------------------- ");
        System.out.println("|           WELCOME          |");
        System.out.println("|            to the          |");
        System.out.println("|   SportEvent Management    |");
        System.out.println(" ---------------------------- ");
    }

    public void printMenu() {
        System.out.println("Make a selection:");
        System.out.println("1.Event Management");
        System.out.println("2.User management");
        System.out.println("0.Exit");
    }

    public void printSubEventL1() {
        System.out.println("Make a selection:");
        System.out.println("1: Display Events");
        System.out.println("2: Create new event");
        System.out.println("3: Set event Status");
        System.out.println("0: Back to the main menu");

    }
    public void printSubEventL2() {
        System.out.println("Make a selection:");
        System.out.println("1: Display all events");
        System.out.println("2: Display Top 5 event category");
        System.out.println("3: Display all booked out events");
        System.out.println("4: Display all events with opened Spots");
        System.out.println("5: Display upcoming events");
        System.out.println("6: Display cancelled events");
        System.out.println("7: Display event price pool");
        System.out.println("8: Create Text file with all events");
        System.out.println("0: Back to the main menu");
    }

    public void printSubUserL1() {
        System.out.println("Make a selection:");
        System.out.println("1: Display all users");
        System.out.println("2: Create new user");
        System.out.println("3: Add user to event");
        System.out.println("0: Back to the main menu");

    }


    public void displayMainMenu() {
        printHeader();
        printMenu();
    }

    public void displaySubEventL1(int maxChoice) {
        printSubEventL1();
    }
    public void displaySubUserL1(int maxChoice) {
        printSubUserL1();
    }public void displaySubEventL2(int maxChoice) {
        printSubEventL2();
    }

    public int getUserInput(int maxChoice) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter choice: ");
        while (choice < 0 || choice > maxChoice) {
            try {

                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.println("Wrong input, can only be numeric.");

            }

            if (choice<0 || choice>maxChoice){
                System.out.println("Wrong input, try it again!");
                choice=-1;
            }
        }
        return choice;
    }

    /**
     * This method belongs to the main menu and calls the two sub menus Event an User management
     * @param choice
     */
    public void performAction(int choice) {
        boolean exit = false;
        int newChoice=-1;
        while (!exit) {
            switch (choice) {
                case 1: {
                    //UserInterface subEventL1 = new UserInterface("subEventL1");

                    displaySubEventL1(3);
                    choice = getUserInput(3);
                    newChoice=performActionL1(choice);
                    if (newChoice==0){
                        exit=true;
                    }
                    exit = false;
                    break;
                }
                case 2: {
                    //UserInterface subUserL1 = new UserInterface("subUserL1");
                    displaySubUserL1(3);
                    choice =getUserInput(3);
                    choice=performActionU1(choice);

                    exit = false;
                    break;
                }

                case 0: {
                    //System.out.println("Thanks for running the Application!");
                    exit = true;
                    break;
                }

            }
        }
    }

    /**
     * if user choose event management in the main, than this is the next menu level-L1
     * @param choice
     */
    public int performActionL1(int choice) {
        boolean exit = false;
        int newChoice=-1;
        while (!exit) {
            switch (choice) {
                case 1: {

                    //UserInterface subEventL2 = new UserInterface("subEventL2"); //calls the submenu for Display events
                    displaySubEventL2(8);
                    choice = getUserInput(8);
                    choice=performActionL2(choice);

                    newChoice =1;
                    exit = false;
                    break;
                }
                case 2: {
                    // method call for create event
                    System.out.println("You choose option 2!");
                    newChoice=1;
                    exit = true;
                    break;
                }
                case 3: {
                    // method call for set event status
                    System.out.println("You choose option 3!");
                    newChoice=1;
                    exit = true;
                    break;
                }
                case 0: {
                    newChoice=0;
                    exit = true;
                    break;
                }

            }
        }
        return newChoice;
    }

    public int performActionU1(int choice) {
        boolean exit = false;
        int newChoice=-1;
        while (!exit) {
            switch (choice) {
                case 1: {
                    //new GenerateData();
                    System.out.println("You choose option 1!");
                    newChoice=2;
                    exit = true;
                    break;
                }
                case 2: {
                    System.out.println("You choose option 2!");
                    newChoice=2;
                    exit = true;
                    break;
                }
                case 3: {
                    //method call is missing
                    System.out.println("You choose option 3!");
                    newChoice=2;
                    exit = true;
                    break;
                }

                case 0: {
                    //System.out.println("Thanks for running the Application!");
                    newChoice=0;
                    exit = true;
                    break;
                }

            }
        }
        return newChoice;
    }



    public int performActionL2(int choice) {
        boolean exit = false;
        int newChoice=-1;
        while (!exit) {
            switch (choice) {
                case 1: {

                    //method call for display all events
                    System.out.println("You choose option 1!");
                    newChoice=1;
                    exit = true;
                    break;
                }
                case 2: {
                    // method call for display top 5 event category
                    System.out.println("You choose option 2!");
                    newChoice=1;
                    exit = true;
                    break;
                }
                case 3: {
                    // method call for display all booked out events
                    System.out.println("You choose option 3!");
                    newChoice=1;
                    exit = true;
                    break;
                }
                case 4: {
                    // method call for display all events with opened spots
                    System.out.println("You choose option 4!");
                    newChoice=1;
                    exit = true;
                    break;
                }
                case 5: {
                    // method call for display upcoming events
                    System.out.println("You choose option 5!");
                    newChoice=1;
                    exit = true;
                    break;
                }
                case 6: {
                    // method call for display cancelled events
                    System.out.println("You choose option 6!");
                    newChoice=1;
                    exit = true;
                    break;
                }

                case 7: {
                    // event price pool
                    System.out.println("You choose option 7!");
                    newChoice=1;
                    exit = true;
                    break;
                }
                case 8: {
                    // event price pool
                    System.out.println("You choose option 8!");
                    newChoice=1;
                    exit = true;
                    break;
                }
                case 0: {
                    //System.out.println("Thanks for running the Application!");
                    newChoice=0;
                    exit = true;
                    break;
                }

            }
        }
        return newChoice;
    }


}

