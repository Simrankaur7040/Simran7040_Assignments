// 10 An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual

import java.util.Scanner;

public class BMICalculator {
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; 
            double heightCm = data[i][1]; 
            double heightM = heightCm / 100; 
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi; 
        }
    }
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                status[i] = "Normal";
            } else if (bmi >= 25 && bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][3]; 
        for (int i = 0; i < teamData.length; i++) {
            System.out.print("Enter weight (kg) of member " + (i + 1) + ": ");
            teamData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of member " + (i + 1) + ": ");
            teamData[i][1] = sc.nextDouble();
        }
        calculateBMI(teamData);
        String[] bmiStatus = determineBMIStatus(teamData);
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < teamData.length; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    teamData[i][0], teamData[i][1], teamData[i][2], bmiStatus[i]);
        }
    }
}
