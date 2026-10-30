public class IdleState implements GuardState {

    private SentinelGuard guard;

    public IdleState(SentinelGuard guard) {
        this.guard = guard;
    }

    public void hearNoise() {
        System.out.println("Guard heard a noise and is investigating.");
        guard.setState(new PatrollingState(guard));
    }

    public void seeEnemy() {
        System.out.println("Guard has spotted the enemy and is now attacking.");
        guard.setState(new AttackingState(guard));
    }

    public void loseTarget() {
        System.out.println("No target to lose.");
    }
}

