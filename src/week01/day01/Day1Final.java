package week01.day01;

import java.util.Scanner;

public class Day1Final {
    public static void main(String[] args) {

        Scanner dataA = new Scanner(System.in);

        System.out.println("Enter your name:");
        String nameA = dataA.nextLine();

        System.out.println("Enter current year:");
        int currentA = dataA.nextInt();

        System.out.println("Enter your birth year:");
        int birthA = dataA.nextInt();

        System.out.println("Enter first number:");
        int firstA = dataA.nextInt();

        System.out.println("Enter second number:");
        int secondA = dataA.nextInt();

        System.out.println("Hello, " + nameA + "!");
        System.out.println("Your age: " + (currentA - birthA));
        System.out.println("Adult: " + ((currentA - birthA) >= 18));
        System.out.println("First number: " + firstA);
        System.out.println("Second number: " + secondA);
        System.out.println("Sum: " + (firstA + secondA));
        System.out.println("Difference: " + (firstA - secondA));
        System.out.println("Product: " + (firstA * secondA));
        System.out.println("Integer division: " + (firstA / secondA));
        System.out.println("Precise division: " + ((double) firstA / secondA));
        System.out.println("Remainder: " + (firstA % secondA));
        System.out.println("First number is greater: " + (firstA > secondA));
        System.out.println("Numbers are equal: " + (firstA == secondA));

    }
}
