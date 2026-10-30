public class Main {
    public static void main(String[] args) {

        SentinelGuard guard = new SentinelGuard();

        System.out.println("Current State: " + guard.getCurrentState());

        guard.hearNoise();
        System.out.println("Current State: " + guard.getCurrentState());

        guard.seeEnemy();
        System.out.println("Current State: " + guard.getCurrentState());

        guard.loseTarget();
        System.out.println("Current State: " + guard.getCurrentState());

        guard.hearNoise();
        System.out.println("Current State: " + guard.getCurrentState());

        guard.setState(new IdleState(guard));

        System.out.println("\nTesting Idle Edge Case:");

        guard.loseTarget();
        System.out.println("Current State: " + guard.getCurrentState());
    }
}
