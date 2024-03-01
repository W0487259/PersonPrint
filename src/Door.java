public class Door {
    /**
     * Author:      Evan VanOostrum
     * Last edited: 03/01/2024
     * Filename:    Monster.java
     * Purpose:     Monster class
     */

    private String colour;
    private String kid;
    private boolean isActive;
    private int doorId;

    public Door(String colour, String kid, boolean isActive, int doorId) {
        this.colour = colour;
        this.kid = kid;
        this.isActive = isActive;
        this.doorId = doorId;
    }

    public void open() {
        if(!isActive) {
            isActive = true;
        }
    }
    public void close() {
        if(isActive) {
            isActive = false;
        }
    }
}
