public class Monster {

    /**
     * Author:      Evan VanOostrum
     * Last edited: 03/01/2024
     * Filename:    Monster.java
     * Purpose:     Monster class
     */

    private String name;
    private final String ssn;
    private int limbs = 4;
    private int eyes;


    public Monster(String name, String ssn, int limbs, int eyes) {
        this.name = name;
        this.ssn = ssn;
        this.limbs = limbs;
        this.eyes = eyes;
    }

    public Monster(String name, String ssn, int limbs) {
        this.name = name;
        this.ssn = ssn;
        this.limbs = limbs;
        this.eyes = 2;
    }

    public String getName() {
        return this.name;
    }
    public String getSsn() {
        return ssn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLimbs() {
        return limbs;
    }

    public void scare(String victim) {
        System.out.println(this.name + " said, \"Boo!\" and " + victim + " was scared.");
    }
}
