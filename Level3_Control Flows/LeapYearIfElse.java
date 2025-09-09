//1 Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 

import java.util.Scanner;

public class LeapYearIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid input! The Leap Year program works for year >= 1582.");
        } else {
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is NOT a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
        sc.close();
    }
}
