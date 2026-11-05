public class Main {
    public static void main(String[] args) {
        RealMedia media = new RealMedia("Generic Everyday Adventure Soundtrack", 240);

        MediaItem proxy = new RemoteMediaProxy(media);

        System.out.println("Title: " + proxy.getTitle());
        System.out.println("Duration: " + proxy.getDuration() + " seconds");

        proxy.play();
        proxy.play();
    }
}