public class Main {
    public static void main(String[] args) {
        CoffeePotModel model = new CoffeePotModel(20);
        CoffeePotView view = new CoffeePotView();

        CoffeePotController controller = new CoffeePotController(model, view);

        controller.start();
    }
}

//to use the brew and pour type it like so: (brew 10 or pour 11)
