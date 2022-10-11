package week6hwharshitpatel;
/* 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/

import java.util.Scanner;

public class Remainder18 {
    static int a, b;

    public static void main(String[] args) {

        Remainder18 obj = new Remainder18();
        obj.add();
        obj.sub();
        multi();
        div();
        mod();
    }

    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first value: ");
        a = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please enter Second value: ");
        b = scanner.nextInt();
        System.out.print("Addition of " + a + " + " + b + " = ");
        System.out.println((a + b));
        scanner.close();

    }

    public void sub() {
        System.out.print("Subtraction  of " + a + " - " + b + " = ");
        System.out.println(a - b);
    }

    public static void multi() {
        System.out.print("Multiplication of " + a + " * " + b + " = ");
        System.out.println(a * b);
    }

    public static void div() {
        System.out.print("Division of " + a + " / " + b + " = ");
        System.out.println(a / b);
    }

    public static void mod() {
        System.out.print("Reminder of " + a + " mod " + b + " = ");
        System.out.println(a % b);
    }

}
