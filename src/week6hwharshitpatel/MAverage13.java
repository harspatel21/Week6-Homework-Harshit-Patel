package week6hwharshitpatel;
/*13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.*/

import java.util.Scanner;

public class MAverage13 {
    float a, b, c;

    public void average() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter First value: ");
        a = scanner.nextFloat();
        System.out.print("Please enter Second value: ");
        b = scanner.nextFloat();
        System.out.print("Please enter Third value: ");
        c = scanner.nextFloat();
        System.out.println("Average of these value is: " + ((a + b + c) / 3f));

    }

    public static void main(String[] args) {
        MAverage13 obj = new MAverage13();
        obj.average();
    }
}
