abstract class EnemySpawner {
    protected  abstract  Enemy createEnemy(String type);

    public Enemy spawnEnemy(String type){
        Enemy enemy = createEnemy(type);
        System.out.println("Spawning "+ type);
        return enemy;
    }

}
