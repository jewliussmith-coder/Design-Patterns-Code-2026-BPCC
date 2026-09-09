public class Main {
    public static void main(String[] args) {

        EnemySpawner forestSpawner = new ForestSpawner();
        EnemySpawner dungeonSpawner = new DungeonSpawner();

        EnemySpawner[] spawners = {
                forestSpawner,
                dungeonSpawner
        };

        String[][] enemyTypes = {
                {"goblin", "wolf"},
                {"skeleton", "slime"}
        };

        for (int i = 0; i < spawners.length; i++) {
            for (int j = 0; j < enemyTypes[i].length; j++) {
                Enemy enemy = spawners[i].spawnEnemy(enemyTypes[i][j]);
                enemy.attack();
            }
        }
    }
}
