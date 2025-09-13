// 11 Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.

import java.util.Random;

public class EmployeeBonus {

    public static double[][] generateEmployeeData(int n) {
        Random rand = new Random();
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000);  // 5-digit salary
            int years = 1 + rand.nextInt(10);          // years of service (1–10)
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        int n = data.length;
        double[][] result = new double[n][3]; // old salary, new salary, bonus
        for (int i = 0; i < n; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = 0.05 * salary;
            } else {
                bonus = 0.02 * salary;
            }

            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = newSalary;
            result[i][2] = bonus;
        }
        return result;
    }

    public static void displayResult(double[][] data, double[][] result) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        System.out.printf("%-5s %-10s %-10s %-10s %-10s %-10s%n", 
                          "ID", "OldSal", "NewSal", "Bonus", "Years", "Service");

        for (int i = 0; i < data.length; i++) {
            totalOld += result[i][0];
            totalNew += result[i][1];
            totalBonus += result[i][2];

            System.out.printf("%-5d %-10.2f %-10.2f %-10.2f %-10.0f %-10s%n", 
                              (i + 1), result[i][0], result[i][1], result[i][2], 
                              data[i][1], (data[i][1] > 5 ? ">5 yrs" : "<=5 yrs"));
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("TOTAL %-10.2f %-10.2f %-10.2f%n", totalOld, totalNew, totalBonus);
    }

    public static void main(String[] args) {
        int n = 10;
        double[][] employeeData = generateEmployeeData(n);
        double[][] result = calculateBonus(employeeData);
        displayResult(employeeData, result);
    }
}
