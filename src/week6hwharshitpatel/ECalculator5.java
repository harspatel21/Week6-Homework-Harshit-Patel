package week6hwharshitpatel;

import java.util.Scanner;

/* Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.) */

public class ECalculator5 {
    static double x, y;

    public static void main(String[] args) {

        ECalculator5 obj = new ECalculator5();
        obj.addition();
        obj.subtraction();
        multiplication();
        division();
    }

    public void addition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first value: ");
        x = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please enter Second value: ");
        y = scanner.nextDouble();
        System.out.print("Addition = ");
        System.out.println((x + y));
        scanner.close();

    }

    public void subtraction() {
        System.out.print("Subtraction = ");
        System.out.println(x - y);
    }

    public static void multiplication() {
        System.out.print("Multiplication = ");
        System.out.println(x * y);
    }

    public static void division() {
        System.out.print("Division = ");
        System.out.println(x / y);
    }

}
