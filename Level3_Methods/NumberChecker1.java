//2 Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker1 {
public static int countDigits(int number) {
    int count = 0;
    int n = Math.abs(number);
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

public static boolean isDuckNumber(int[] digits) {
    for (int digit : digits) {
        if (digit != 0) return true;
    }
    return false;
}

public static boolean isArmstrong(int[] digits) {
    int n = digits.length;
    int sum = 0;
    for (int digit : digits) {
        sum += Math.pow(digit, n);
    }
    int number = 0;
    for (int digit : digits) {
        number = number * 10 + digit;
    }
    return sum == number;
}

public static int[] largestAndSecondLargest(int[] digits) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    for (int digit : digits) {
        if (digit > largest) {
            secondLargest = largest;
            largest = digit;
        } else if (digit > secondLargest && digit != largest) {
            secondLargest = digit;
        }
    }
    return new int[]{largest, secondLargest};
}

public static int[] smallestAndSecondSmallest(int[] digits) {
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;
    for (int digit : digits) {
        if (digit < smallest) {
            secondSmallest = smallest;
            smallest = digit;
        } else if (digit < secondSmallest && digit != smallest) {
            secondSmallest = digit;
        }
    }
    return new int[]{smallest, secondSmallest};
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    int digitCount = countDigits(number);
    int[] digits = getDigitsArray(number);

    System.out.println("Digits array: " + Arrays.toString(digits));
    System.out.println("Number of digits: " + digitCount);
    System.out.println("Is Duck number: " + isDuckNumber(digits));
    System.out.println("Is Armstrong number: " + isArmstrong(digits));

    int[] largest = largestAndSecondLargest(digits);
    System.out.println("Largest digit: " + largest[0] + ", Second largest: " + largest[1]);

    int[] smallest = smallestAndSecondSmallest(digits);
    System.out.println("Smallest digit: " + smallest[0] + ", Second smallest: " + smallest[1]);
}
}