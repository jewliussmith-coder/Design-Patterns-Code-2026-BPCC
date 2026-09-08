public class SimpleEnemyFactory {
    public Enemy createEnemy(String type){
        switch (type){
            case "goblin":
                return new Goblin();
            case "skeleton":
                return new Skeleton();
            default:
                return null;
        }
    }
}
