public class StuyStudent extends Protagonist {

    private final int lensThickness;

    /**
     * Gets lensThickness
     *
     * @return value of lensThickness
     */

    public int getLensThickness() {
        return lensThickness;
    }

    /**
     * Creates a StuyStudent
     *
     * @param name is the name of the StuyStudent
     * @param lensThickness is the thickness of the lens of the glasses of the StuyStudent
     */

    public StuyStudent(String name, int lensThickness) {
        super(name);
        this.lensThickness = lensThickness;
    }

    /**
     * The StuyStudent puts on his glasses,
     * giving them a defense boost due the protection they offer,
     * and increases their strength due to the glasses accuracy boost
     */

    public void putOnGlasses() {
        setDefense(getDefense() + getLensThickness());
        setStrength(getStrength() * 2);
    }

    /**
     * Does nothing
     */
    public void aceTheSAT() {

    }

    /**
     * @return the name of the StuyStudent and their SAT score
     */

    @Override
    public String toString() {
        return super.toString() + " got a 1600 on the SAT";
    }
}
