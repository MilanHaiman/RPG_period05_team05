/**
 * A Panda is a type of Protagonist
 */

public class Panda extends Protagonist {

    private final int kungFuSkill;
    private final int rotundness;

    /**
     * Gets kungFuSkill
     *
     * @return value of kungFuSkill
     */

    public int getKungFuSkill() {
        return kungFuSkill;
    }

    /**
     * Gets rotundness
     *
     * @return value of rotundness
     */

    public int getRotundness() {
        return rotundness;
    }

    /**
     * Creates a Panda
     *
     * @param name the name of the Panda
     * @param kungFuSkill how skillful the Panda is at KungFu
     * @param rotundness how rotund the Panda is
     */

    public Panda(String name, int kungFuSkill, int rotundness) {
        super(name);
        this.kungFuSkill = kungFuSkill;
        this.rotundness = rotundness;
    }

    /**
     * The panda commits seppuku, dealing a large amount of damage to itself and the monster
     *
     * @param monster is the monster to attack
     * @return the damage dealt
     */

    public int seppuku(Monster monster) {
        double orginalAttackRating = getAttackRating();
        int damage = (int) Math.pow(getRotundness(), getKungFuSkill());
        setAttackRating(damage);
        setHp(1);
        int damageDone = attack(monster);
        setAttackRating(orginalAttackRating);
        return damageDone;
    }

    /**
     * @return how scared you should be of the Panda
     */

    @Override
    public String toString() {
        return super.toString() + "is a " + getKungFuSkill() + " belt in KungFu";
    }
}
