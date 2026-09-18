package week01.day01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        int age = 20;
        System.out.println(age);
        age = 21;
        System.out.println(age);
        int year = 2026;
        System.out.println(year);
        int money = 1000;
        System.out.println(money);
        int score = 50;
        money = 1500;
        System.out.println(money);
        System.out.println(score);


        byte level = 25;
        short yearBorn = 2006;
        int balance = 100000;
        long worldPopulation = 8_000_000_000L;

        float temperature = 22.5F;
        double height = 175.5;

        char grade = 'A';

        boolean isStudent = true;

        System.out.println(level);
        System.out.println(yearBorn);
        System.out.println(balance);
        System.out.println(worldPopulation);
        System.out.println(temperature);
        System.out.println(height);
        System.out.println(grade);
        System.out.println(isStudent);

        double test = 0.1 + 0.2;
                System.out.println(test);

        int a = 11;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    double x = 11;
    double y = 10;
        System.out.println(x / y);

    int scoreA = 100;
    int scoreResult = scoreA += 50;
        System.out.println(scoreResult);
    int number = 17;
    int numberResult = number % 2;
        System.out.println(numberResult);

        int d = 7;
        int f = 2;
        System.out.println(d / f);
        System.out.println((double) d / f);

        double price = 99.99;
        int wholePrice = (int) price;
        System.out.println(wholePrice);

        int scoreB = 50;
        double scoreDouble = scoreB;
        System.out.println(scoreDouble);

        int ageA = 20;
        int moneyA = 1000;

        System.out.println(ageA > 18);
        System.out.println(ageA < 18);
        System.out.println(ageA >= 18);
        System.out.println(ageA <= 19);
        System.out.println(ageA == 20);
        System.out.println(ageA != 20);
        System.out.println(moneyA == 1000);
        System.out.println(moneyA > 400);


        boolean isAdult = age >= 18;
        System.out.println(isAdult);

        int ageG = 20;
        boolean hasTicket = true;
        boolean isBanned = false;
        boolean isAdmin = false;

        boolean canEnter = ageG >= 18 && hasTicket;
        boolean allowed = ageG >= 18 && hasTicket && !isBanned;
        boolean specialAccess = isAdmin || allowed;

        System.out.println(canEnter);
        System.out.println(allowed);
        System.out.println(specialAccess);

        Scanner scanX = new Scanner(System.in);

        System.out.println("Enter your name:");
        String nameX = scanX.nextLine();

        System.out.println("Enter your age:");
        int ageX = scanX.nextInt();

        System.out.println("Hello, " + nameX + "!");
        System.out.println("You are " + ageX + " years old.");

        scanX.close();

    }
}

