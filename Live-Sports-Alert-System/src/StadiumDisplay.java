public class StadiumDisplay implements Observer {

    @Override
    public void update(String data) {
        System.out.println("SCREEN UPDATE: " + data);
    }
}
