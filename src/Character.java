package src;

public class Character {
	private String name;
	private int hp;
	private int armourClass;
	private Weapon weapon;
	private boolean action;
	private boolean bonusAction;
	
	Character() {	
		name = "Unknown";
		hp = 0;
		armourClass = 10; // Default armour class
		weapon = null;
		action = false;
		bonusAction = false;
	}

	Character(String name, Weapon weapon, int hp, int armourClass, boolean action, boolean bonusAction) {

		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be null or empty");
		}

		if (hp < 0) {
			throw new IllegalArgumentException("HP cannot be negative");
		}

		if (armourClass < 0) {
			throw new IllegalArgumentException("Armour Class cannot be negative");
		}

		if (weapon == null) {
			throw new IllegalArgumentException("Weapon cannot be null");
		}

		createCharacter(name, weapon, hp, armourClass, action, bonusAction);
	}

	public void createCharacter(String name, Weapon weapon, int hp, int armourClass, boolean action, boolean bonusAction) {
		this.name = name;
		this.hp = hp;
		this.armourClass = armourClass;
		this.weapon = weapon;
		this.action = action;
		this.bonusAction = bonusAction;
	}

	/*******************************************************
	 * Setters
	 *
	 * These functions assign values to the private member 
	 * variables of the class. They allow controlled access 
	 * to internal state by external code, often including 
	 * validation or transformation logic.
	 *******************************************************/

	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be null or empty");
		}

		this.name = name;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			throw new IllegalArgumentException("HP cannot be negative");
		}

		this.hp = hp;
	}

	public void setArmourClass(int armourClass) {
		if (armourClass < 0) {
			throw new IllegalArgumentException("Armour Class cannot be negative");
		}

		this.armourClass = armourClass;
	}

	public void setWeapon(Weapon weapon) {
		if (weapon == null) {
			throw new IllegalArgumentException("Weapon cannot be null");
		}

		this.weapon = weapon;

	}

	public void setAction(boolean action) {
		this.action = action;
	}

	public void setBonusAction(boolean bonusAction) {
		this.bonusAction = bonusAction;
	}

	/*******************************************************
	 * Getters
	 *
	 * These functions retrieve the values of private member 
	 * variables. They provide read-only access to internal 
	 * state, helping maintain encapsulation and protecting 
	 * against unintended modification.
	 *******************************************************/

	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getArmourClass() {
		return armourClass;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public boolean isAction() {
		return action;
	}

	public boolean isBonusAction() {
		return bonusAction;
	}

	public boolean isAlive() {
		return hp > 0; // Character is alive if HP is greater than zero
	}

	/******************************************************* 
	 * Attack Method
	 *
	 * This method simulates an attack using the character's 
	 * weapon. It retrieves the damage value from the weapon 
	 * and applies it to the character, potentially affecting 
	 * their HP or other game state.
	 *******************************************************/

	public void attack(Character targetCharacter) {
		if (weapon == null) {
			System.out.println(name + " has no weapon to attack with.");
		}

		int damage = weapon.attack();

		if (damage <= 0) {
			System.out.println(name + " attacks but deals no damage.");
		}

		System.out.println(name + " attacks with " + weapon.getClass().getSimpleName() + " for " + damage + " damage.");
		targetCharacter.takeDamage(damage);
		action = false; // Reset action after attack
	}

	/*******************************************************
	 * Take Damage Method
	 *
	 * This method applies damage to the character's HP by
	 * subtracting the targets armourClass from damage. It 
	 * ensures that HP does not fall below zero and handles 
	 * any necessary game logic related to taking damage.
	 *******************************************************/

	public void takeDamage(int damage) {

		damage -= armourClass; // Subtract armour class from damage

		if (damage < 0) {
			throw new IllegalArgumentException("Damage cannot be negative");
		}
		hp -= (damage);
		if (hp < 0) {
			hp = 0; // Ensure HP does not go below zero
		}

		System.out.println(name + " takes " + damage + " damage. Remaining HP: " + hp);

		if (!isAlive()) {
			System.out.println(name + " has been defeated.");
			// Additional logic for character defeat can be added here, such as removing from game state
		}
	}


}
