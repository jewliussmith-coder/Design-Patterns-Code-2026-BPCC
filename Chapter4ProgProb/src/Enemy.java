abstract class Enemy {
    protected Weapon weapon;
    protected Armour armour;

    public Enemy(EquipmentFactory equipmentFactory){
        this.weapon = equipmentFactory.createWeapon();
        this.armour = equipmentFactory.createArmour();
    }

    public abstract void attack();
}

