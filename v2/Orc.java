public class Orc extends Monster {
	private int height;
	public Orc() {
		super();
		height = 9;
	}
	public String toString() {
		return super.toString() + System.lineSeparator() + "\tthat is " + height + " feet tall";
	}
}