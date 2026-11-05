public class RealMedia implements MediaItem {
    private String title;
    private int duration;

    public RealMedia(String title, int duration) {
        this.title = title;
        this.duration = duration;
        System.out.println("Establishing connection to remote server... [Success]");
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void play() {
        System.out.println("Now playing: " + title);
    }
}