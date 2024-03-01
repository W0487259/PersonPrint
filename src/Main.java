import java.util.Scanner;

public class Main {
    /**
     * Generation Checker + Monsters Inc
     * Author:      E.V.O.
     * Date:        02/14/2024
     * Last edited: 03/01/2024
     */

    public static void main(String[] args) {
        // getGen();

        Monster randall = new Monster("Randall", "555-555-1234", 8, 2);
        Monster sully = new Monster("Sully", "972-282-9712", 4);

        sully.scare("Boo");
        System.out.println(randall.getName() + " said, \"go to greenland lol\"");

    }

    public static void getGen() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        int age = -1;
        while (age == -1) {
            try {
                System.out.print("Enter your age in years: ");
                age = input.nextInt();
            }
            catch (Exception e) {
                age = -1;
                System.out.println("Error, please try again.");
                input.next();

            } catch (StackOverflowError stk) {
                System.out.println("you broke it lol\n" + stk);
            }
        }

        String ageGen = getAgeGen(age);

        System.out.println("Name: \t" + name);
        System.out.println("Age:  \t" + age);
        System.out.println("Gen:  \t" + ageGen);
    }

    private static String getAgeGen(int age) {
        String ageGen = "";
        int bYear = 2024 - age;     // Approximate age

        if(bYear > 2012) {
            ageGen = "Gen Alpha";
        } else if(bYear >= 1997) {
            ageGen = "Gen Z";
        } else if(bYear >= 1981) {
            ageGen = "Millennial (Gen Y)";
        } else if(bYear >= 1965) {
            ageGen = "Gen X";
        } else if(bYear >= 1946) {
            ageGen = "Baby Boomer";
        } else if(bYear >= 1928) {
            ageGen = "Silent Generation";
        } else if(bYear >= 1901) {
            ageGen = "Greatest Generation";
        } else if(bYear >= 1883) {
            ageGen = "Lost Generation";
        } else {
            ageGen = "Error: This person is over 140 years old?!";
        }
        return ageGen;
    }

}