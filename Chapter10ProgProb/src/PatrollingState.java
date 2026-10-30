public class PatrollingState implements GuardState {

    private SentinelGuard guard;

    public PatrollingState(SentinelGuard guard) {
        this.guard = guard;
    }

    public void hearNoise() {
        System.out.println("Guard is already on alert.");
    }

    public void seeEnemy() {
        System.out.println("Guard has spotted the enemy and is now attacking.");
        guard.setState(new AttackingState(guard));
    }

    public void loseTarget() {
        System.out.println("No target to lose.");
    }
}

