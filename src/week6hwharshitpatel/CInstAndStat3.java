package week6hwharshitpatel;
/*3. Write a Java programme using the following steps.
  3.1 Declare one instance and one static variable.
  3.2 Declare one instance method.
  3.3 Declare one static method.
  3.4 Call both instance and static variables into both instance and static methods inside the
      print statement.
  3.5 Declare the Main method.
  3.6 Call both instance and static methods into the Main method and run the programme.*/

public class CInstAndStat3 {
    int a = 7;
    static String name = "James Bond";

    public static void main(String[] args) {

        CInstAndStat3 obj = new CInstAndStat3();
        obj.instMethod();
        statMethod();
    }

    public void instMethod() {
        System.out.print("I am 00" + a);
    }

    public static void statMethod() {
        System.out.println(" " + name);
    }

}
