//2 Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators

import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid input! The Leap Year program works for year >= 1582.");
        } else {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
        sc.close();
    }
}
