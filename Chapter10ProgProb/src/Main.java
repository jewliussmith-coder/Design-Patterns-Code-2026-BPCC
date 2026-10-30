public class Main {

    public static void main(String[] args) {
        SentinelGuard guard = new SentinelGuard();

        guard.hearNoise();
        guard.hearNoise();
        guard.seeEnemy();
        guard.hearNoise();
        guard.loseTarget();
        guard.loseTarget();
    }
}
