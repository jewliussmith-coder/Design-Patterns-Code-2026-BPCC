public class MageEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon(){
        return new Staff();
    }

    @Override
    public Armour createArmour(){
        return new Robe();
    }
}
