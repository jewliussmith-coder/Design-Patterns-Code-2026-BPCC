public class SleepingState implements GuardState {

    private SentinelGuard guard;

    public SleepingState(SentinelGuard guard) {
        this.guard = guard;
    }

    public void hearNoise() {
        System.out.println("The guard wakes up and starts patrolling.");
        guard.setState(new PatrollingState(guard));
    }

    public void seeEnemy() {
        System.out.println("The guard is snoring loudly and doesn’t see a thing.");
    }

    public void loseTarget() {
        System.out.println("The guard is fast asleep and doesn’t care about targets.");
    }
}
