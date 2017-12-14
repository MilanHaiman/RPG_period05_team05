// Credit to Josh Weiner's code for hw48.

public class UserOfRPGv2 {
	public static void main(String[] args) {
		Monster[] agents = new Monster[8];			// Prediction: will fail during compilation
													// Error occurred during compilation
													// Error message: incompatible types: Protagonist cannot be converted to Monster
		// Character[] agents = new Character[8];

		// agents[0] = new Protagonist("Milan");
		// agents[1] = new StuyStudent("Milan",4);
		// agents[2] = new Human("Milan","he");
		// agents[3] = new Panda("The panda",3,4);

		agents[4] = new Monster(40,5,0.5);
		agents[5] = new DoctorEggman();
		agents[6] = new LordFarquaad();
		agents[7] = new KimJongUn();

		// for (Character ch : agents) {
		// 	System.out.println(ch);
		// }

		for (Monster m : agents) {
			System.out.println(m.getName());
		}
		// Prediction: will fail during compilation
		// Error occurred during compilation
		// Error message: cannot find symbol
		// 	System.out.println(m.getName());
		// 	                    ^
  		// symbol:   method getName()
  		// location: variable m of type Monster

	}
}