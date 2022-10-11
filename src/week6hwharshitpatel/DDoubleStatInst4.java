package week6hwharshitpatel;

/*4. Write a Java programme using the following steps.
  4.1 Declare two instance and two static variables.
  4.2 Declare one instance method.
  4.3 Declare one static method.
  4.4 Call all four instance and static variables into both instance and static methods inside the
      print statement.
  4.5 Declare the Main method.
  4.6 Call both instance and static methods into the Main method and run the programme.*/

public class DDoubleStatInst4 {
    int x = 50;
    int y = 100;
    static String name = "Har Har";
    static String name1 = "Mahadev";

    public void instMethod() {
        System.out.print(x + " to ");
        System.out.println(y + " times every day.");
    }

    public static void statMethod() {
        System.out.print("'" + name + " ");
        System.out.println(name1 + "'");
    }

    public static void main(String[] args) {
        System.out.print("Bolo ");
        statMethod();
        DDoubleStatInst4 obj = new DDoubleStatInst4();
        obj.instMethod();
    }

}
