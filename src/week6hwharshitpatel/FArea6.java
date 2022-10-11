package week6hwharshitpatel;
/* 6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).*/

import java.util.Scanner;

public class FArea6 {

    static double r;
    static double pi = 3.1416;

    public static void areaMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any radius value: ");
        r = scanner.nextDouble();
        System.out.print("Area A =  ");
        System.out.println(pi * r * r);
        scanner.close();
    }

    public static void main(String[] args) {
        areaMethod();
    }
}
