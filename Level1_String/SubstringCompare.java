// 2 Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method
// substring() to find the substring of the text. Finally Compare the the two strings and display the results.
package Level1PracticePrograms;
import java.util.Scanner;

public class SubstringCompare {

    public static String substringUsingCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String substringCharAt = substringUsingCharAt(text, start, end);
        String substringBuiltIn = text.substring(start, end);

        System.out.println("\nSubstring using charAt(): " + substringCharAt);
        System.out.println("Substring using built-in substring(): " + substringBuiltIn);

        boolean areEqual = compareUsingCharAt(substringCharAt, substringBuiltIn);
        System.out.println("Comparison result: " + areEqual);

        sc.close();
    }
}
