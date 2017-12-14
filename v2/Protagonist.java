public class Protagonist extends Character {
	private String name;

	private int baseDefense;
	private double baseAttack;

	public Protagonist(String name) {
		this.name = name;
		health = 125;
		strength = 100;
		baseDefense = defense = 40;
		baseAttack = attack = 0.4;
	}

	public String getName() {
		return name;
	}

	public void specialize() {
		defense -= 5;
		attack += 0.1;
	}

	public void normalize() {
		defense = baseDefense;
		attack = baseAttack;
	}

	public String toString() {
		return "Protagonist with:" + System.lineSeparator() + "\t" + health + " health points";
	}
}