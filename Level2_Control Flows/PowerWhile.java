// 14 Rewrite the above program to find the power of a number using a while loop.

import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        if (number < 0 || power < 0) {
            System.out.println("Both number and power must be positive integers.");
        } else {
            int result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(number + " ^ " + power + " = " + result);
        }

        sc.close();
    }
}
