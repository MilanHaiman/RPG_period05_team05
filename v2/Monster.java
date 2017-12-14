public class Monster extends Character {
	public Monster() {
		health = 80;
		strength = (int) (10 + 30 * Math.random());
		defense = 15;
		attack = 0.7;
	}
	public String toString() {
		return "Monster with:" + System.lineSeparator() + "\t" + health + " health points";
	}
}