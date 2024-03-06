public class Monster {

    private String name;
    private final String ssn;
    private int limbs = 4;
    private int eyes;

    /**
     * Monster object constructor
     * @param name  Monster's name
     * @param ssn   Social security number
     * @param limbs # of limbs (arms, legs, etc.)
     * @param eyes  # of eyes
     */
    public Monster(String name, String ssn, int limbs, int eyes) {
        this.name = name;
        this.ssn = ssn;
        this.limbs = limbs;
        this.eyes = eyes;
    }

    /**
     * Monster object constructor (eyes = 2)
     * @param name Monster's name
     * @param ssn social security
     * @param limbs # of limbs (arms, legs)
     */
    public Monster(String name, String ssn, int limbs) {
        this.name = name;
        this.ssn = ssn;
        this.limbs = limbs;
        this.eyes = 2;
    }

    // ******* Getters ********
    public String getName() {
        return name;
    }
    public String getSsn() {
        return ssn;
    }
    public int getLimbs() {
        return limbs;
    }
    public int getEyes() {
        return eyes;
    }

    // ******* Setters *******
    public void setName(String name) {
        this.name = name;
    }




    public void scare(String victim) {
        System.out.println(this.name + " said, \"Boo!\" and " + victim + " was scared.");
    }
}
