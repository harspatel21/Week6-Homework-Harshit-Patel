package week6hwharshitpatel;
/*7. Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

import java.util.Scanner;

public class GTemperature7 {
    static double f;

    public static void temperature(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter value in Fahrenheit: ");
        f = scanner.nextDouble();
        System.out.println("Celsius = " + ((f-32)*(5.0/9.0)));
        scanner.close();
    }
public static void main (String [] args){
        temperature();
}


}
