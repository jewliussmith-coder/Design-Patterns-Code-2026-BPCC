public class AudioSystem {

    public void playSound(String sound) {
        ConfigurationManager config = ConfigurationManager.getInstance();

        System.out.println("Playing " + sound + " at volume " + config.getVolume());
    }

    public void adjustVolume(int volume) {
        ConfigurationManager config = ConfigurationManager.getInstance();

        config.setVolume(volume);

        System.out.println("Audio volume changed to " + volume);
    }
}