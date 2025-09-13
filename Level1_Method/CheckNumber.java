// 5 Write a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;
public class CheckNumber {
    public static int checkNum(int num) {
        if (num > 0) {
            return 1;  
        } else if (num < 0) {
            return -1; 
        } else {
            return 0; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result = checkNum(number);
        if (result == 1) {
            System.out.println("The number " + number + " is Positive.");
        } else if (result == -1) {
            System.out.println("The number " + number + " is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}
