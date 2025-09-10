// 1 Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = 10; 
        double[] salary = new double[N];
        double[] yearsOfService = new double[N];
        double[] bonus = new double[N];
        double[] newSalary = new double[N];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("Enter Salary: ");
            double sal = sc.nextDouble();
            if (sal <= 0) {
                System.out.println("Invalid salary! Please enter again.");

                continue;
            }

            System.out.print("Enter Years of Service: ");
            double yrs = sc.nextDouble();
            if (yrs < 0) {
                System.out.println("Invalid years of service! Please enter again.");
                i--;
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = yrs;
        }

        for (int i = 0; i < N; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nEmployee-wise details:");
        for (int i = 0; i < N; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] +
                    ", Bonus = " + bonus[i] +
                    ", New Salary = " + newSalary[i]);
        }

        System.out.println("\n--- Summary ---");
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);

        sc.close();
    }
}
