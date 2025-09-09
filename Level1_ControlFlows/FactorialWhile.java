//14 Write a Program to find the factorial of an integer entered by the user.

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int fact = 1, i = 1;
            while (i <= n) {
                fact *= i;
                i++;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        }
    }
}
