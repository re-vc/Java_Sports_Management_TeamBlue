public class Main {

    public static void main(String[] args) {

        // createTestDataUsers()
        // createTestDataEvents()

        int choice = -1;
        while (choice != 0) {

            UserInterface menu = new UserInterface("default");
            choice =0;
            choice = menu.getUserInput(2);
            menu.performAction(choice);
        }

    }

}