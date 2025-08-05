package src;

class Main {
    public static void main(String[] args) {

        Character rogue = CharacterFactory.createCharacter("rogue", "Shadow");
        Character warrior = CharacterFactory.createCharacter("warrior", "Arthur");
        Character mage = CharacterFactory.createCharacter("mage", "Merlin");

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
}