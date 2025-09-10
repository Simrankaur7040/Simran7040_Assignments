//3 Create a program to store the digits of the number in an array and find the largest and second largest element of the array.

import java.util.Scanner;
public class DigitsLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        
        while (number != 0) {
            if (index == maxDigit) {
                break; 
            }
            digits[index++] = (int)(number % 10);
            number /= 10;
        }

        if (index == 0) {
            System.out.println("No digits found.");
            sc.close();
            return;
        }

        
        int largest = digits[0];
        int secondLargest = -1;

        for (int i = 1; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        if (secondLargest == -1) {
            System.out.println("No second largest digit found.");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        sc.close();
    }
}