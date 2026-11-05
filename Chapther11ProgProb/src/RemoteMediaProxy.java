public class RemoteMediaProxy implements MediaItem {
    private RealMedia realMedia;
    private boolean isConnected = false;

    public RemoteMediaProxy(RealMedia realMedia) {
        this.realMedia = realMedia;
    }

    private void checkConnection() {
        if (!isConnected) {
            System.out.println("Establishing remote connection...");
            isConnected = true;
        }
    }

    public String getTitle() {
        checkConnection();
        return realMedia.getTitle();
    }

    public int getDuration() {
        checkConnection();
        return realMedia.getDuration();
    }

    public void play() {
        checkConnection();
        realMedia.play();
    }
}
