package week6hwharshitpatel;
/* 19. Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.*/

public class SLowercase19 {

    public static void lower() {
        System.out.println("Given String");
        System.out.println("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        String a = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String b = a.toLowerCase();
        System.out.println("******** converted in to lowercase ********");
        System.out.println(b);

    }

    public static void main(String[] args) {

        lower();
    }
}
