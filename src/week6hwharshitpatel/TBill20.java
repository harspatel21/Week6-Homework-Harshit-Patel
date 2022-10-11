package week6hwharshitpatel;
/*
20. Write a Java Program to print as below.
"+------------------------+"
"|                        |"
"| CORNER STORE           |"
"|                        |"
"| 2015-03-29 04:38PM     |"
"|                        |"
"| Gallons: 10.870        |"
"| Price/gallon: $ 2.089  |"
"|                        |"
"| Fuel total: $ 22.71    |"
"|                        |"
"+------------------------+
*/


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TBill20 {
    public static void bill() {
        double Gallon, Price, total;
        String date, time;
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Gallons value: ");
        Gallon = scn.nextDouble();
        System.out.print("Enter Price/ Gallon: ");
        Price = scn.nextDouble();
        total = Gallon * Price;
        LocalDateTime dtobj = LocalDateTime.now();
        DateTimeFormatter forobj = DateTimeFormatter.ofPattern("dd/MM/yyyy   HH:mm");
        String formateDate = dtobj.format(forobj);


        System.out.println("\"+------------------------+\"");
        System.out.println("\"|                        |\"\n");
        System.out.println("\"|      CORNER STORE      |\"\n");
        System.out.println("\"|                        |\"\n");
        System.out.println("\"|   " + formateDate + "   |\"\n");
        System.out.println("\"|                        |\"\n");
        System.out.println("\"|  Gallons:       " + Gallon + "   |\"\n");
        System.out.println("\"|  Price/Gallons:$" + Price + "    |\"\n");
        System.out.println("\"|                        |\"\n");
        System.out.println("\"|  Fuel total:  $" + total + "    |\"\n");
        System.out.println("\"|                        |\"\n");
        System.out.println("\"+------------------------+\"");


    }

    public static void main(String[] args) {
        bill();
    }
}
