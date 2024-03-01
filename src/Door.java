public class Door {
    /**
     * Author:      Evan VanOostrum
     * Last edited: 03/01/2024
     * Filename:    Monster.java
     * Purpose:     Monster class
     */

    private String colour;      // Colour
    private String kid;         // Name of the kid that the door is connected to
    private boolean isActive;   //
    private final int doorId;

    private static int numDoors = 0x0;  // Door IDs are catalogued in Hexadecimal

    public Door(String colour, String kid) {
        numDoors++;
        this.colour = colour;
        this.kid = kid;
        this.isActive = false;
        this.doorId = numDoors;
    }

    // ******* Getters *******
    public String getColour() {
        return colour;
    }

    public boolean getStatus() {
        return isActive;
    }

    public int getDoorId() {
        return doorId;
    }


    // ******* Setters *******
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setKid(String kid) {
        this.kid = kid;
    }
    public void activate() {
        this.isActive = true;
    }
    public void deactivate() {
        this.isActive = false;
    }

    // ******* Other methods *******

    public void open() {
        if(isActive) {
            System.out.println();
        }
    }
    public void close() {
        if(!isActive) {
            System.out.println();
        }
    }


    public String toString() {
        return "Door Id:\t" + doorId
                + "\nColour: \t" + colour
                + "\nKid:\t\t" + kid
                + "\nIsActive:\t" + isActive;
    }

}
