public class Human extends Protagonist{

    private final String pronoun;

    /**
     * Gets pronoun
     *
     * @return value of pronoun
     */

    public String getPronoun() {
        return pronoun;
    }

    /**
     * Creates the Human
     *
     * @param name
     * @param pronoun
     */

    public Human(String name, String pronoun) {
        super(name);
        this.pronoun = pronoun;
    }

    /**
     * Constructs the Human's name
     *
     * @return the String representation of the Human's name
     */

    @Override
    public String toString() {
        return getPronoun() + super.toString();
    }
}
