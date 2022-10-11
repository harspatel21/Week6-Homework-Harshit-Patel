package week6hwharshitpatel;
/*11. Write a Java program to display the following pattern.
Sample Pattern :
 J a v v a
 J a a v v a a
J J aaaaa V V aaaaa
J J a a V a a
*/

public class KJavaPattern11 {
    public void pattern() {
        System.out.println("   J   a   v      v  a");
        System.out.println("   J  a a   v   v   a a");
        System.out.println("J  J aaaaa   V V   aaaaa");
        System.out.println(" JJ a     a   V   a     a");
    }

    public static void main(String[] args) {
        KJavaPattern11 obj = new KJavaPattern11();
        obj.pattern();
    }
}

