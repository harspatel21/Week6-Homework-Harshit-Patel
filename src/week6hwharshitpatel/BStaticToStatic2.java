package week6hwharshitpatel;
/* 2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme*/

public class BStaticToStatic2 {

    static String name1 = "Sweet";
    static String name2 = "Home";

    public static void main(String[] args) {
        statMethod();
    }

    public static void statMethod() {
        System.out.print(name1);
        System.out.println(" " + name2);
    }
}
