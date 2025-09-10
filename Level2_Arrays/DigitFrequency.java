//10 Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

       
        if (number < 0) {
            number = -number;
        }

    
        String numStr = Long.toString(number);
        int length = numStr.length();

     
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

   
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }

        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " -> " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
