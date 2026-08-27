public class SocialMediaBot implements Observer {

    @Override
    public void update(String data) {
        System.out.println("TWEET: " + data + " #GameDay2026");
    }
}