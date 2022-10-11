package week6hwharshitpatel;
/* 17. Write a Java program to convert a decimal number to binary number.
Input Data:
 Input a Decimal Number : 5
Expected Output
Binary number is: 101 */

import java.util.Scanner;

public class QDecToBin17 {
    static int x;

    public static void dectobin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter value of X: ");
        x = scanner.nextShort();
        String binary = Integer.toBinaryString(x);
        System.out.println("Binary of " + x + "is :" + binary);
        scanner.close();
    }

    public static void main(String[] args) {
        dectobin();
    }
}
