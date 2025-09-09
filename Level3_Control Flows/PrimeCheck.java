// 4 Write a Program to check if the given number is a prime number or not

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true;

        // Prime number check (only for numbers greater than 1)
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // exit loop since we found a divisor
                }
            }
        }

        // Output
        if (isPrime) {
            System.out.println("The number " + number + " is a Prime Number.");
        } else {
            System.out.println("The number " + number + " is NOT a Prime Number.");
        }

        sc.close();
    }
}
