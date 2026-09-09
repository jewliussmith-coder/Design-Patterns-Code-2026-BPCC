public class Main {

    public static void main(String[] args) {

       Enemy skeleton = new Skeleton(new MageEquipmentFactory());
       Enemy goblin = new Goblin(new WarriorEquipmentFactory());

       skeleton.attack();
       goblin.attack();
    }
}

