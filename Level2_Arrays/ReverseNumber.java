// 5 Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        
        if (number == 0) {
            System.out.println("Reversed number digits: 0");
            sc.close();
            return;
        }

        int count = 0;
        long temp = number;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp /= 10;
        }

        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed number digits: ");
        for (int digit : reversed) {
            System.out.print(digit);
        }
        System.out.println();

        sc.close();
    }
}