public class Main {

    public static void main(String[] args) {

        // createTestDataUsers()
        // createTestDataEvents()
        UserInterface menu = new UserInterface();

        int choice = -1;
        while (choice != 0) {

            menu.displayMainMenu();
            choice =0;
            choice = menu.getUserInput(2);
            menu.performAction(choice);
        }
        System.out.println("Thank you for running the application!");

    }

}