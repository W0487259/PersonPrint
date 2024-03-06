import java.util.Scanner;

public class Person {

    // ******* Instance Variables *******
    private String name;
    private int age;


    // ******* Constructor *******
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // ******* Getters *******
    public String getName() {return name;}
    public int getAge() {return age;}


    // ******* Setters *******
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}


    // ******* toString *******
    @Override
    public String toString() {
        return "Name:\t" + name + "\nAge:\t" + age + "\n";
    }

    // ******* Other Methods *******
    public void getGen() {
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

    private String getAgeGen(int age) {
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
