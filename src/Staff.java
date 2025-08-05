public class Staff implements Weapon {
    private int damage;

    public Staff() {
        this.damage = 8; // Default damage value for Staff
    }

    public Staff(int damage) {
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
