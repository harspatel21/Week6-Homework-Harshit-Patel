package week6hwharshitpatel;
/* 9. Write a program to convert the upper case to lower case.*/

import java.util.Scanner;

public class IUpperToLower9 {
    static String a;

    public static void upper() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("PLEASE ENTER A SENTENCE IN UPPER CASE:");
        a = scanner.nextLine();
        String b = a.toLowerCase();
        System.out.println(b);
        scanner.close();

    }

    public static void main(String[] args) {
        upper();
    }
}


