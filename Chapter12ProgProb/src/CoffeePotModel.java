public class CoffeePotModel {
    private int currentVolume;
    private int maxCapacity;

    public CoffeePotModel(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.currentVolume = 0;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void brew(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("cannot be negative.");
        }
        if (currentVolume + amount > maxCapacity) {
            throw new IllegalStateException("pot capacity exceeded.");
        }
        currentVolume += amount;
    }

    public void pour(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("cannot be negative.");
        }
        if (currentVolume - amount < 0) {
            throw new IllegalStateException("Not enough coffee (brew more).");
        }
        currentVolume -= amount;
    }
}