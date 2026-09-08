public class Main {

    public static void main(String[] args) {
        SimpleEnemyFactory factory = new SimpleEnemyFactory();

        Enemy goblin = factory.createEnemy("goblin");
        Enemy skeleton = factory.createEnemy("skeleton");

        goblin.attack();
        skeleton.attack();
    }
}

