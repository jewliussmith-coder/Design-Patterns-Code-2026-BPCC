public class SentinelGuard {

    private GuardState currentState;

    public SentinelGuard() {
        currentState = new SleepingState(this);
    }

    public void setState(GuardState state) {
        currentState = state;
    }

    public GuardState getCurrentState() {
        return currentState;
    }

    public void hearNoise() {
        currentState.hearNoise();
    }

    public void seeEnemy() {
        currentState.seeEnemy();
    }

    public void loseTarget() {
        currentState.loseTarget();
    }
}
