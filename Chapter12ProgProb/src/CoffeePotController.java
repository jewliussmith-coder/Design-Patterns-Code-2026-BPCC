public class CoffeePotController {
    private CoffeePotModel model;
    private CoffeePotView view;

    public CoffeePotController(CoffeePotModel model, CoffeePotView view) {
        this.model = model;
        this.view = view;
    }

    public void start() {
        boolean running = true;

        while (running) {
            view.showMenu();
            String input = view.getUserInput().trim();
            String[] parts = input.split("\\s+");

            try {
                switch (parts[0].toLowerCase()) {
                    case "brew":
                        if (parts.length != 2) {
                            view.displayMessage("Enter an amount to brew.");
                            break;
                        }

                        int brewAmount = Integer.parseInt(parts[1]);
                        model.brew(brewAmount);
                        view.displayMessage("Coffee brewed! Current amount: " + model.getCurrentVolume());
                        break;

                    case "pour":
                        if (parts.length != 2) {
                            view.displayMessage("Enter an amount to pour.");
                            break;
                        }

                        int pourAmount = Integer.parseInt(parts[1]);
                        model.pour(pourAmount);
                        view.displayMessage("Coffee poured! Current amount: " + model.getCurrentVolume());
                        break;

                    case "status":
                        view.displayMessage("Current coffee: " + model.getCurrentVolume());
                        break;

                    case "exit":
                        running = false;
                        view.displayMessage("Goodbye!");
                        break;

                    default:
                        view.displayMessage("Unknown command.");
                        break;
                }
            } catch (IllegalArgumentException e) {
                view.displayMessage("Invalid amount. Please enter a number.");
            } catch (IllegalStateException e) {
                view.displayMessage("Error: " + e.getMessage());
            }
        }
    }
}