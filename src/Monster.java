public class Monster {
    private String name;
    private String ssn;


    public Monster(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public String getName() {
        return this.name;
    }

    public String getSsn() {
        return ssn;
    }

    public void scare() {
        System.out.println(name + " said, \"Boo!\"");
    }
}
