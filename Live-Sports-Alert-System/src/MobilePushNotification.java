public class MobilePushNotification implements Observer {

    @Override
    public void update(String data) {
        System.out.println("PUSH ALERT: " + data);
    }
}
