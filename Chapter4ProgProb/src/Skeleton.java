public class Skeleton extends Enemy{

    public Skeleton(EquipmentFactory equipmentFactory){
        super(equipmentFactory);
    }

    @Override
    public void attack(){
        System.out.println("A Skeleton wearing a " + armour.getDescription()
                + " attacks with a " + weapon.getDescription());
    }
}
