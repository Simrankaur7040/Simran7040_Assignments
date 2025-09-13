//4 Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker3 {
    public static int countDigits(int number) {
    int n = Math.abs(number);
    int count = 0;
    while (n > 0) {
        n /= 10;
        count++;
    }
    return count == 0 ? 1 : count;
}

public static int[] getDigitsArray(int number) {
    int n = Math.abs(number);
    int count = countDigits(n);
    int[] digits = new int[count];
    for (int i = count - 1; i >= 0; i--) {
        digits[i] = n % 10;
        n /= 10;
    }
    return digits;
}

public static int[] reverseArray(int[] digits) {
    int[] reversed = new int[digits.length];
    for (int i = 0; i < digits.length; i++) {
        reversed[i] = digits[digits.length - 1 - i];
    }
    return reversed;
}

public static boolean compareArrays(int[] arr1, int[] arr2) {
    if (arr1.length != arr2.length) return false;
    for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] != arr2[i]) return false;
    }
    return true;
}

public static boolean isPalindrome(int[] digits) {
    int[] reversed = reverseArray(digits);
    return compareArrays(digits, reversed);
}

public static boolean isDuckNumber(int[] digits) {
    for (int digit : digits) {
        if (digit != 0) return true;
    }
    return false;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    int[] digits = getDigitsArray(number);
    System.out.println("Digits array: " + Arrays.toString(digits));
    System.out.println("Number of digits: " + countDigits(number));
    System.out.println("Reversed digits array: " + Arrays.toString(reverseArray(digits)));
    System.out.println("Is Palindrome: " + isPalindrome(digits));
    System.out.println("Is Duck number: " + isDuckNumber(digits));
}
}