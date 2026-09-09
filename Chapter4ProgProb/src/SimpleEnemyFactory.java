public class SimpleEnemyFactory {
    public Enemy createEnemy(String type){
        switch (type){
            case "goblin":
                return new Goblin(new WarriorEquipmentFactory());
            case "skeleton":
                return new Skeleton(new MageEquipmentFactory());
            case "wolf":
                return new Wolf(new WarriorEquipmentFactory());
            case "slime":
                return new Slime(new MageEquipmentFactory());
            default:
                return null;
        }
    }
}
