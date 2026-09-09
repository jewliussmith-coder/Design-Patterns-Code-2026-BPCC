public class Main {

    public static void main(String[] args) {
       EnemySpawner forestSpawner = new ForestSpawner();
       EnemySpawner dungeonSpawner = new DungeonSpawner();

       Enemy goblin = forestSpawner.spawnEnemy("goblin");
       goblin.attack();

       Enemy skeleton = dungeonSpawner.spawnEnemy("skeleton");
       skeleton.attack();
    }
}


