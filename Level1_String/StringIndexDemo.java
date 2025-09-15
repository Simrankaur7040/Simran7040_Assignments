// 5 Write a program to demonstrate StringIndexOutOfBoundsException
package Level1PracticePrograms;
import java.util.Scanner;
public class StringIndexDemo {

    public static void generateException(String text) {
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        handleException(input);
        sc.close();
    }
}
