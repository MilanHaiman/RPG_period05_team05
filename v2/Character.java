public class Character {
	protected int health;
	protected int strength;
	protected int defense;
	protected double attack;

	public boolean isAlive() {
		return health > 0;
	}

	public int getDefense() {
		return defense;
	}

	public void lowerHP(int decrement) {
		health -= decrement;
	}

	public int attack(Character c) {
		int damage = (int) (strength * attack - c.getDefense());
		if (damage < 0) {
			damage = 0;
		}
		c.lowerHP(damage);
		return damage;
	}
}