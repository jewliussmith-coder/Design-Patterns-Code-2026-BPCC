public class DungeonSpawner extends EnemySpawner{
    @Override
    protected Enemy createEnemy(String type){
        switch (type){
            case "skeleton":
                return new Skeleton(new MageEquipmentFactory());
            case "slime":
                return new Slime(new MageEquipmentFactory());
            default:
                return null;
        }
    }
}
