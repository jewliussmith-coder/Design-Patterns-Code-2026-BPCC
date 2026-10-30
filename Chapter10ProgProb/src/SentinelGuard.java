public class SentinelGuard {

    enum State {
        Idle,
        Patrolling,
        Attacking
    }

    private State currentState = State.Idle;

    public void hearNoise() {
        if (currentState == State.Idle) {
            currentState = State.Patrolling;
            System.out.println("Guard heard a noise and is investigating.");

        } else if (currentState == State.Patrolling) {
            System.out.println("Guard is already on alert.");

        } else if (currentState == State.Attacking) {
            System.out.println("Guard is too busy fighting to notice the noise.");
        }
    }

    public void seeEnemy() {
        currentState = State.Attacking;
        System.out.println("Guard has spotted the enemy and is now attacking.");
    }

    public void loseTarget() {
        if (currentState == State.Attacking) {
            currentState = State.Patrolling;
            System.out.println("Guard is searching for the escaped enemy.");

        } else {
            System.out.println("No target to lose.");
        }
    }

    public void displayState() {
        System.out.println("Current State: " + currentState);
    }
}

