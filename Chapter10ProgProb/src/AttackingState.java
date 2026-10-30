public class AttackingState implements GuardState {

    private SentinelGuard guard;

    public AttackingState(SentinelGuard guard) {
        this.guard = guard;
    }

    public void hearNoise() {
        System.out.println("Guard is too busy fighting to notice the noise.");
    }

    public void seeEnemy() {
        System.out.println("Guard has spotted the enemy and is now attacking.");
    }

    public void loseTarget() {
        System.out.println("Guard is searching for the escaped enemy.");
        guard.setState(new PatrollingState(guard));
    }
}
