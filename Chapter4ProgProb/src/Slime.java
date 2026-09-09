public class Slime extends Enemy{
    public Slime(EquipmentFactory equipmentFactory){
        super(equipmentFactory);
    }

    @Override
    public void attack(){
        System.out.println("A Slime wearing a " + armour.getDescription()
                + " attacks with a " + weapon.getDescription());
    }

}

