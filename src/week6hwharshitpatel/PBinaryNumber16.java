package week6hwharshitpatel;
/* 16. Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101 */

public class PBinaryNumber16 {

    public static void Binary() {

        String s1 = "10";
        String s2 = "11";

        int decimal1 = Integer.parseInt(s1, 2);
        int decimal2 = Integer.parseInt(s2, 2);
        int decimal3 = decimal1 + decimal2;
        String binary = Integer.toBinaryString(decimal3);
        System.out.println(binary);
    }

    public static void main(String[] args) {
        Binary();
    }
}
