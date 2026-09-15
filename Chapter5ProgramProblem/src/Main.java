public class Main {

    public static void main(String[] args) {

        AudioSystem audioSystem = new AudioSystem();
        GraphicsRenderer graphicsRenderer = new GraphicsRenderer();

        audioSystem.playSound("Background Music");
        graphicsRenderer.renderGame();

        audioSystem.adjustVolume(40);

        audioSystem.playSound("Battle Music");
        graphicsRenderer.renderGame();

        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        System.out.println("Are both references the same object? " + (config1 == config2));
        System.out.println("Current volume: " + config2.getVolume());
    }
}
