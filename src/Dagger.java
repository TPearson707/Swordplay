public class Dagger implements Weapon {
    private int damage;

    public Dagger() {
        this.damage = 5; // Default damage value for Dagger
    }

    public Dagger(int damage) {
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