package src;

class Main {
    public static void main(String[] args) {
        // CharacterFactory factory = new CharacterFactory();

        // Character rogue = factory.createRogue();
        // Character warrior = factory.createWarrior();
        // Character mage = factory.createMage();

        Character rogue = createRogue();
        Character warrior = createWarrior();
        Character mage = createMage();

        // Example of setting armour class
        rogue.setArmourClass(5);
        warrior.setArmourClass(10);
        mage.setArmourClass(3);

        // Example of taking damage
        // warrior.takeDamage(20);
        // mage.takeDamage(15);

        // Example of setting up game
        Game game = new Game(warrior, mage);
        game.start();
        
    }

    public static Character createRogue() {
        Weapon dagger = new Dagger();
        return new Character("Rogue", dagger, 30, 12, true, false);
    }

    public static Character createWarrior() {
        Weapon claymore = new Claymore(15);
        return new Character("Warrior", claymore, 50, 15, true, false);
    }

    public static Character createMage() {
        Weapon staff = new Staff();
        return new Character("Mage", staff, 25, 10, true, false);
    }
}