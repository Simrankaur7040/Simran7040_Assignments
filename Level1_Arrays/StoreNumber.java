//4 Write a program to store multiple values in an array up to a maximum of 10 or until the user enters a 0 or a negative number. Show all the numbers as well as the sum of all numbers 

import java.util.Scanner;

public class StoreNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (0 or negative to stop):");
        while (true) {
            double input = sc.nextDouble();
            if (input <= 0 || index == 10) {
                break;
            }
            values[index++] = input;
        }

        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(values[i]);
            total += values[i];
        }

        System.out.println("Sum of all numbers: " + total);
        sc.close();
    }
}