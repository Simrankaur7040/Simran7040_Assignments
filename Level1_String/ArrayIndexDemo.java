// 8 Write a program to demonstrate ArrayIndexOutOfBoundsException

package Level1PracticePrograms;
import java.util.Scanner;

public class ArrayIndexDemo {
    public static void generateException(String[] names) {
        System.out.println("Accessing invalid index: " + names[names.length]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        handleException(names);
        sc.close();
    }
}
