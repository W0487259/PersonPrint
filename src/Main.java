/**
 * Generation Checker + Monsters Inc
 * Author:      E.V.O.
 * Date:        02/14/2024
 * Last edited: 03/01/2024
 */

public class Main {

    public static void main(String[] args) {
        Monster randall = new Monster("Randall", "555-555-1234", 8, 2);
        Monster sully = new Monster("Sully", "972-282-9712", 4);
        Monster mike = new Monster("Mike", "297-236-0978", 4, 1);

        sully.scare("Boo");
        System.out.println(randall.getName() + " said, \"go to greenland lol\"");

        Door booDoor = new Door("White", "Boo");
        System.out.println(booDoor);
    }

//    public void destroyDoor(Door door) {
//        System.out.println("Door #" + door.getDoorId()
//                + " was thrown into the shredder.");
//    }
}