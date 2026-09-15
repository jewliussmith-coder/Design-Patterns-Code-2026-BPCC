public class Main {

    public static void main(String[] args) {

        System.out.println("Before getting the ConfigurationManager...");

        ConfigurationManager config1 = ConfigurationManager.getInstance();

        System.out.println("After first getInstance() call.");

        ConfigurationManager config2 = ConfigurationManager.getInstance();

        System.out.println("After second getInstance() call.");

        System.out.println("Are both references the same object? " + (config1 == config2));

        System.out.println("Original volume: " + config1.getVolume());

        config1.setVolume(50);

        System.out.println("Volume through config2: " + config2.getVolume());

        System.out.println("Resolution: " + config1.getResolution());
        System.out.println("Display Mode: " + config1.getDisplayMode());
    }
}
