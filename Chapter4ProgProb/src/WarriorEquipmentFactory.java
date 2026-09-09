public class WarriorEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon(){
        return new Sword();
    }

    @Override
    public Armour createArmour(){
        return new PlateArmour();
    }
}
