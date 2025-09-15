// 7  Write a program to to check if a text is palindrome and display the result

package Level3PracticePrograms;
import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeIterative(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static char[] reverseString(String str) {
        char[] rev = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            rev[i] = str.charAt(str.length() - 1 - i);
        }
        return rev;
    }

    public static boolean isPalindromeArray(String str) {
        char[] original = str.toCharArray();
        char[] reversed = reverseString(str);
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        boolean result1 = isPalindromeIterative(text);
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean result3 = isPalindromeArray(text);

        System.out.println("Palindrome check using Iterative Method: " + result1);
        System.out.println("Palindrome check using Recursive Method: " + result2);
        System.out.println("Palindrome check using Character Array Method: " + result3);

        sc.close();
    }
}

