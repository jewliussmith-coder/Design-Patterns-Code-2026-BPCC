public class Main {
    public static void main(String[] args) {
        CoffeePotModel pot = new CoffeePotModel(20);

        pot.brew(10);
        System.out.println("After brewing: " + pot.getCurrentVolume());

        pot.pour(5);
        System.out.println("After pouring: " + pot.getCurrentVolume());

        try {
            pot.brew(20);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        try {
            pot.pour(10);
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}