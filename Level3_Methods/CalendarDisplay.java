// 8 Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. E.g. for 07 2005 user input, the program should display the calendar as shown below

import java.util.Scanner;

public class CalendarDisplay {

    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    static int[] days = {
        0, 31, 28, 31, 30, 31, 30, 31,
        31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getFirstDay(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (month == 2 && isLeapYear(year)) {
            days[2] = 29;
        } else {
            days[2] = 28;
        }

        System.out.println("\n" + months[month] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(1, month, year);

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        for (int d = 1; d <= days[month]; d++) {
            System.out.printf("%3d ", d);
            if ((d + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
