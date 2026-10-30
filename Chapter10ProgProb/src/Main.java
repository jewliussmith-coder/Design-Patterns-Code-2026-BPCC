public class Main {

    public static void main(String[] args) {

        SentinelGuard guard = new SentinelGuard();

        guard.displayState();

        guard.hearNoise();
        guard.displayState();

        guard.hearNoise();

        guard.seeEnemy();
        guard.displayState();

        guard.hearNoise();

        guard.loseTarget();
        guard.displayState();

        guard.loseTarget();
    }
}
}
