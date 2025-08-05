import characters.Character;
import characters.CharacterFactory;

public class Main {
    public static void main(String[] args) {
        // Initialize the game
        System.out.println("Welcome to the Swordplay Game!");
        System.out.println("Setting up characters and weapons...");

        // Create characters
        Character rogue = CharacterFactory.createCharacter("rogue", "Shadow");
        Character mage = CharacterFactory.createCharacter("mage", "Mystic");
        Character warrior = CharacterFactory.createCharacter("warrior", "Berserker");


        // Create a game instance with the characters
        System.out.println("Characters created:");
        System.out.println(rogue.getName() + " (Rogue) - Health: " + rogue.getHealth());
        System.out.println(mage.getName() + " (Mage) - Health: " + mage.getHealth());
        // System.out.println(warrior.getName() + " (Warrior) - Health: " + warrior.getHealth());

        System.out.println("Characters ready for battle!");
        System.out.println("Starting the game...");
        Game game = new Game(rogue, warrior);
        game.start();
    }
}
