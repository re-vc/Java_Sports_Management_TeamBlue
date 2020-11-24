import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;


public class UserInterface {

    public UserInterface(String init) {

        switch (init){
            case "default":
                displayMainMenu();
                break;
            case "subEventL1":
                displaySubEventL1(3);

            default:
                System.out.println("I can not fine the Menu: "+init);
                break;
        }
    }

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

    public void displayMainMenu() {
        printHeader();
        printMenu();
    }

    public void displaySubEventL1(int maxChoice) {

        int choice = -1;
        while (choice != 0) {

            UserInterface subMenuLevel1 = new UserInterface("subLevel1");
            printSubMenuLevel1();
            choice =0;
            choice = menu.getUserInput(3);
            menu.performAction(choice);
        }

        printSubMenu();
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


    public void performAction(int choice) {
        boolean exit = false;
        while (!exit) {
            switch (choice) {
                case 1: {
                    //new GenerateData();
                    //Shop aa=GenerateData.GenerateProductData();
                    //method call is missing

                    displaySubMenu(3);

                    System.out.println("You choosed option 1!");





                    exit = true;
                    break;
                }
                case 2: {

                    System.out.println("You choosed option 2!");
                    exit = true;
                    break;
                }

                case 0: {
                    System.out.println("Thanks for running the Application!");
                    exit = true;
                    break;
                }

            }
        }
    }





}
