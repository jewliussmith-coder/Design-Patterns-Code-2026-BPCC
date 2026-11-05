public class Main {
    public static void main(String[] args) {

        System.out.println("===== REMOTE PROXY TEST =====");

        RealMedia remoteMedia = new RealMedia("Generic Everyday Somewhat Boring Adventure Soundtrack", 240);
        MediaItem remoteProxy = new RemoteMediaProxy(remoteMedia);

        System.out.println("Title: " + remoteProxy.getTitle());
        System.out.println("Duration: " + remoteProxy.getDuration());
        remoteProxy.play();
        remoteProxy.play();

        System.out.println("\n===== VIRTUAL PROXY TEST =====");

        MediaItem virtualProxy = new VirtualMediaProxy("Action Soundtrack", 300);

        System.out.println("Virtual proxy created.");

        System.out.println("Title: " + virtualProxy.getTitle());
        System.out.println("Duration: " + virtualProxy.getDuration());
        virtualProxy.play();
        virtualProxy.play();
    }
}
