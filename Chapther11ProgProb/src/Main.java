public class Main {
    public static void main(String[] args) {
        MediaItem proxy = new VirtualMediaProxy("Generic Everyday Adventure Soundtrack", 240);

        System.out.println("Media proxy created.");
        System.out.println("Title: " + proxy.getTitle());
        System.out.println("Duration: " + proxy.getDuration() + " seconds");

        proxy.play();
    }
}
