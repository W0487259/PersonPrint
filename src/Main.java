import java.util.Scanner;

public class Main {
    /**
     * Generation Checker
     * Author:  E.V.O.
     * Date:    02/14/2024
     */

    public static void main(String[] args) {
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

        printPerson(name, age);
    }

    public static void printPerson(String name, int age) {
        System.out.println("Name: \t" + name);
        System.out.println("Age:  \t" + age);
        System.out.println("Gen:  \t" + getGen(age));
    }

    public static String getGen(int age) {
        int bYear = 2024 - age;     // Approximate age

        if(bYear > 2012) {
            return "Gen Alpha";
        } else if(bYear >= 1997) {
            return "Gen Z";
        } else if(bYear >= 1981) {
            return "Millennial (Gen Y)";
        } else if(bYear >= 1965) {
            return "Gen X";
        } else if(bYear >= 1946) {
            return "Baby Boomer";
        } else if(bYear >= 1928) {
            return "Silent Generation";
        } else if(bYear >= 1901) {
            return "Greatest Generation";
        } else if(bYear >= 1883) {
            return "Lost Generation";
        } else {
            return "Error: This person is over 140 years old?!";
        }
    }
}