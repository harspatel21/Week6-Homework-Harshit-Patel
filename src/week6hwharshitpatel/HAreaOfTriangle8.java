package week6hwharshitpatel;
/* 8. Write a program to calculate the area of a triangle.*/

import java.util.Scanner;

public class HAreaOfTriangle8 {
    double b;
    double h;

    public void area() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Base Value: ");
        b = scanner.nextDouble();
        System.out.print("Enter Height Value: ");
        h = scanner.nextDouble();
        System.out.println("Area of Triangle is: " + ((b * h) / 2.0));
        scanner.close();
    }

    public static void main(String[] args) {
        HAreaOfTriangle8 obj = new HAreaOfTriangle8();
        obj.area();
    }
}
