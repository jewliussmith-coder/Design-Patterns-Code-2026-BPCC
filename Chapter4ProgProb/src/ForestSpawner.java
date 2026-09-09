public class ForestSpawner extends EnemySpawner {
    @Override
    protected Enemy createEnemy(String type){
        switch (type){
            case "goblin":
                return new Goblin();
            case "wolf":
                return new Wolf();
            default:
                return null;
        }
    }
}
