public class ForestSpawner extends EnemySpawner {
    @Override
    protected Enemy createEnemy(String type){
        switch (type){
            case "goblin":
                return new Goblin(new WarriorEquipmentFactory());
            case "wolf":
                return new Wolf(new WarriorEquipmentFactory());
            default:
                return null;
        }
    }
}
