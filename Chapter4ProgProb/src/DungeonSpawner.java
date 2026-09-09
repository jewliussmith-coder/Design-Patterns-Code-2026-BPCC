public class DungeonSpawner extends EnemySpawner{
    @Override
    protected Enemy createEnemy(String type){
        switch (type){
            case "skeleton":
                return new Skeleton();
            case "slime":
                return new Slime();
            default:
                return null;
        }
    }
}
