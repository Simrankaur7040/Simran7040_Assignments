//Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number 
import java.util.Scanner;
import java.util.Arrays;

public class DigitsLargestDynamic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        
        while (number != 0) {
            if (index == maxDigit) {
        
                maxDigit += 10;
                
                digits = Arrays.copyOf(digits, maxDigit);
            }
            digits[index++] = (int)(number % 10);
            number /= 10;
        }

        if (index == 0) {
            System.out.println("No digits found.");
            sc.close();
            return;
        }

        // Initialize largest and second largest
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