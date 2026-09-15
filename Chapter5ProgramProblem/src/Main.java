import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        AudioSystem audioSystem = new AudioSystem();
        GraphicsRenderer graphicsRenderer = new GraphicsRenderer();

        ConfigurationManager config = ConfigurationManager.getInstance();

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("===== Game Engine Console =====");
            System.out.println("1. View Current Status");
            System.out.println("2. Change Volume");
            System.out.println("3. Change Resolution");
            System.out.println("4. Change Display Mode");
            System.out.println("5. Test Audio System");
            System.out.println("6. Test Graphics Renderer");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            String input = scanner.nextLine();

            switch (input) {

                case "1":
                    System.out.println();
                    System.out.println("===== Current Status =====");
                    System.out.println("Volume: " + config.getVolume());
                    System.out.println("Resolution: " + config.getResolution());
                    System.out.println("Display Mode: " + config.getDisplayMode());
                    System.out.println();
                    audioSystem.playSound("Status Sound");
                    graphicsRenderer.renderGame();
                    break;

                case "2":
                    System.out.print("Enter new volume (0-100): ");

                    try {
                        int volume = Integer.parseInt(scanner.nextLine());

                        if (volume >= 0 && volume <= 100) {
                            audioSystem.adjustVolume(volume);
                        } else {
                            System.out.println("Volume needs to be between 0 and 100.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }

                    break;

                case "3":
                    System.out.print("Enter new resolution: ");
                    String resolution = scanner.nextLine();

                    if (!resolution.isEmpty()) {
                        config.setResolution(resolution);
                        System.out.println("Resolution changed to " + resolution);
                    } else {
                        System.out.println("Resolution cannot be empty.");
                    }

                    break;

                case "4":
                    System.out.println("Choose display mode:");
                    System.out.println("1. Fullscreen");
                    System.out.println("2. Windowed");
                    System.out.println("3. Borderless");
                    System.out.print("Choose an option: ");

                    String displayChoice = scanner.nextLine();

                    switch (displayChoice) {
                        case "1":
                            config.setDisplayMode("Fullscreen");
                            System.out.println("Display mode changed to Fullscreen.");
                            break;

                        case "2":
                            config.setDisplayMode("Windowed");
                            System.out.println("Display mode changed to Windowed.");
                            break;

                        case "3":
                            config.setDisplayMode("Borderless");
                            System.out.println("Display mode changed to Borderless.");
                            break;

                        default:
                            System.out.println("Invalid display mode.");
                    }

                    break;

                case "5":
                    audioSystem.playSound("Background Music");
                    break;

                case "6":
                    graphicsRenderer.renderGame();
                    break;

                case "7":
                    running = false;
                    System.out.println("Exiting Game Engine Console...");
                    break;

                default:
                    System.out.println("Invalid option. Please choose a number from 1 to 7.");
            }
        }

        scanner.close();
    }
}
