public class SentinelGuard {

    private GuardState currentState;

    public SentinelGuard() {
        currentState = new IdleState(this);
    }

    public void setState(GuardState state) {
        currentState = state;
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
