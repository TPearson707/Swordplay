package spells;

import characters.Character;

public interface Spell {
    /**
     * Casts the spell on the target character.
     *
     * @param target The character that the spell will be cast on.
     */
    void cast(Character target);

    /**
     * Gets the name of the spell.
     *
     * @return The name of the spell.
     */
    String getName();

    /**
     * Gets the mana cost of casting the spell.
     *
     * @return The mana cost.
     */
    int getManaCost();
    
}
