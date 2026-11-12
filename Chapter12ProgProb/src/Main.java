public class Main {
    public static void main(String[] args) {
        CoffeePotView view = new CoffeePotView();
        String command = "";

        while (!command.equalsIgnoreCase("exit")) {
            view.showMenu();
            command = view.getUserInput();
            view.displayMessage("You entered: " + command);
        }

        view.displayMessage("Goodbye!");
    }
}
