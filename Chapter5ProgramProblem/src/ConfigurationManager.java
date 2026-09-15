public class ConfigurationManager {

    private static ConfigurationManager instance = null;

    private int volume = 75;
    private String resolution = "1920x1080";
    private String displayMode = "Fullscreen";

    private ConfigurationManager() {
        System.out.println("ConfigurationManager instance created!");
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }

        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getDisplayMode() {
        return displayMode;
    }

    public void setDisplayMode(String displayMode) {
        this.displayMode = displayMode;
    }
}
