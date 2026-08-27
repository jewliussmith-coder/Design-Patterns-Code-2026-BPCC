public class Main {
    public static void main(String[] args) {

        // Create the GameTicker
        GameTicker ticker = new GameTicker();

        // Create the observers
        MobilePushNotification phone = new MobilePushNotification();
        StadiumDisplay stadium = new StadiumDisplay();
        SocialMediaBot social = new SocialMediaBot();

        // Register the observers
        ticker.register(phone);
        ticker.register(stadium);
        ticker.register(social);

        // Simulate game events
        ticker.addUpdate("The game has started!");
        ticker.addUpdate("The home team scored!");
        ticker.addUpdate("The final score is 3-2!");
    }
}