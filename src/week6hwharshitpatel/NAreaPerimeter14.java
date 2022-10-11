package week6hwharshitpatel;
/*14. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/

import java.text.DecimalFormat;

public class NAreaPerimeter14 {
    static float width = 5.6f;
    static float height = 8.5f;
    static float area = (width * height);
    static float perimeter = 2f * (5.6f + 8.5f);


    public static void area() {
        DecimalFormat dec = new DecimalFormat("##.00");

        System.out.println("Area of : 5.6 * 8.5 =  " + dec.format(area));
    }

    public static void perimeter() {
        DecimalFormat dec = new DecimalFormat("##.00");
        System.out.print("Perimeter of : 2 * (5.6 + 8.5) = " + dec.format(perimeter));


    }

    public static void main(String[] args) {

        area();
        perimeter();
    }
}
