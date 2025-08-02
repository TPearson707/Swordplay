package src;

public class CharacterFactory {
    public static Character createCharacter(String type, String name) {
        switch (type.toLowerCase()) {
            case "warrior":
                return createWarrior(name);
            case "mage":
                return createMage(name);
            case "rogue":
                return createRogue(name);
            default:
                throw new IllegalArgumentException("Unknown character type: " + type);
        }
    }

    private static Character createWarrior(String name) {
        Weapon claymore = new Claymore(15);
        return new Character(name, claymore, 50, 15, true, false);
    }

    private static Character createMage(String name) {
        Weapon staff = new Staff();
        return new Character(name, staff, 25, 10, true, false);
    }

    private static Character createRogue(String name) {
        Weapon dagger = new Dagger();
        return new Character(name, dagger, 30, 12, true, false);
    }

}
