public class Main {
    public static void main(String[] args) {
        InventoryComponent mainBackpack = new Bag("Main Backpack", 2.0);

        InventoryComponent bedroll = new Item("Bedroll", 5.0);
        InventoryComponent rope = new Item("Rope", 3.0);
        mainBackpack.add(bedroll);
        mainBackpack.add(rope);

        InventoryComponent potionPouch = new Bag("Potion Pouch", 0.5);
        potionPouch.add(new Item("Health Potion", 0.5));
        potionPouch.add(new Item("Mana Potion", 0.5));

        InventoryComponent bagOfHolding = new Bag("Bag of Holding", 1.0);
        InventoryComponent gemBag = new Bag("Gem Bag", 0.2);
        gemBag.add(new Item("Ruby", 0.1));
        gemBag.add(new Item("Sapphire", 0.1));
        bagOfHolding.add(gemBag);
        bagOfHolding.add(new Item("Gold Bar", 10.0));

        mainBackpack.add(potionPouch);
        mainBackpack.add(bagOfHolding);

        System.out.println("--- Full Backpack Hierarchy ---");
        mainBackpack.displayInfo();
        System.out.println("Total Backpack Weight: " + mainBackpack.getWeight() + " lbs\n");

        System.out.println("--- Independent Potion Pouch Subtree ---");
        potionPouch.displayInfo();
        System.out.println("Potion Pouch Weight: " + potionPouch.getWeight() + " lbs\n");

        System.out.println("--- Safety Handling Test ---");
        try {
            InventoryComponent sword = new Item("Sword", 8.0);
            sword.add(new Item("Dagger", 2.0));
        } catch (UnsupportedOperationException e) {
            System.out.println("Caught expected exception: " + e.getMessage());
        }
    }
}
