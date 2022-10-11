package week6hwharshitpatel;
//15. Write a Java program to swap two variables.

import java.util.Scanner;

public class OSwap15 {
    static int x, y, z;

    public static void Swap() {

        Scanner S = new Scanner(System.in);
        System.out.print("Please enter value of X: ");
        x = S.nextShort();
        System.out.print("Please enter value of Y: ");
        y = S.nextShort();
        System.out.println("Your entered values");
        System.out.println("Value of X = " + x);
        System.out.println("Value of Y = " + y);
        int z = x;
        int x = y;
        int y = z;

        System.out.println("After Swapping");
        System.out.println("Value of X = " + x);
        System.out.println("Value of Y = " + y);
    }

    public static void main(String[] args) {
        Swap();

    }
}
