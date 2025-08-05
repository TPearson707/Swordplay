public class Claymore implements Weapon {
    private int damage;

    public Claymore() {
        this.damage = 10; // Default damage value
    }

    public Claymore(int damage) {
        if (damage <= 0) {
            throw new IllegalArgumentException("Damage must be positive");
        }
        this.damage = damage;
    }

    @Override
    public int attack() {
        return damage;
    }
    
}
