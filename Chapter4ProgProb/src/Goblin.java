public class Goblin extends Enemy{


    public Goblin(EquipmentFactory equipmentFactory){
        super(equipmentFactory);
    }

    @Override
    public void attack(){
        System.out.println("A Goblin wearing a " + armour.getDescription()
                + " attacks with a " + weapon.getDescription());
    }
}
