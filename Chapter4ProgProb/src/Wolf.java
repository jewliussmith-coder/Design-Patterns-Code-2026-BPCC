public class Wolf extends Enemy{
    public Wolf(EquipmentFactory equipmentFactory){
        super(equipmentFactory);
    }

    @Override
    public void attack(){
        System.out.println("A Wolf wearing a " + armour.getDescription()
                + " attacks with a " + weapon.getDescription());
    }
}

