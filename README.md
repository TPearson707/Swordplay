# Swordplay 🗡️⚔️

**Swordplay** is a turn-based combat game that fuses the strategic depth of Dungeons & Dragons with the snappy, back-and-forth mechanics of Pokémon battles. Build your fantasy character, equip unique weapons, and test your tactics in battles where timing, stats, and a bit of luck all matter.

---

## 🎮 Gameplay Overview

- ⚔️ **Turn-Based Battles**  
  Inspired by Pokémon — players take turns to attack, defend, or use abilities, planning each move to outsmart opponents.

- 🧙‍♂️ **D&D-Style Characters**  
  Choose from familiar fantasy archetypes like **Warrior**, **Mage**, or **Rogue**, each with unique stats and gear compatibility.

- 🛠️ **Weapons & Gear**  
  Equip characters with iconic weapons like **Claymores**, **Daggers**, and **Staves**, each granting distinct stat bonuses and effects.

- 🎲 **Strategy Meets Chance**  
  Balanced mechanics that incorporate dice-roll-inspired randomness, while rewarding smart choices and character synergy.

---

## 🚧 Project Status

> **In Development**  
Current features include:
- Character factory and base classes  
- Weapon inheritance structure  
- Basic battle mechanics (in progress)  
- Terminal-based game loop (upcoming)

---

## 📁 Project Structure

src/
├── Character.java // Base class for player/enemy characters
├── CharacterFactory.java // Builds characters by type (Warrior, Mage, Rogue)
├── Weapon.java // Abstract base for all weapon types
├── Claymore.java // Weapon class for Warriors
├── Staff.java // Weapon class for Mages
├── Dagger.java // Weapon class for Rogues
├── BattleSystem.java // Handles turn flow, attacks, and results
└── Main.java // Entry point for running the game


---

## 🧪 How to Run

### Prerequisites
- Java 8 or higher
- Terminal or command line access

### Steps

1. Compile the source code:
   ```bash
   javac -d bin src/*.java


java -cp bin Main

🧭 Planned Features

    ✅ Character creation via factory pattern

    🔄 Turn-based battle system

    🧠 AI-controlled enemies

    💥 Special attacks and critical hit mechanics

    ⏳ Cooldowns and stamina system

    📈 Experience and leveling system

    🎨 Future GUI using JavaFX or Swing

    🌐 Online battles (stretch goal)

🧙 Example Character
    Character rogue = CharacterFactory.createCharacter("rogue", "Nyx");

    Weapon: Dagger

    HP: 30

    Attack: 12

    Can dual-wield: Yes

    Can use magic: No

📜 License

This project is licensed under the MIT License.
Use it, fork it, break it, improve it — you're free to do what you want.

🙌 Contributions Welcome

Want to add new character classes, abilities, or help balance combat?
Feel free to open an issue, suggest an improvement, or make a pull request. Let's build something cool.

Swordplay: A duel between stats, strategy, and a little sword-flavored chaos.