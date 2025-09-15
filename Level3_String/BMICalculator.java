//1 An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in a team of 10 members. 
//For this create a program to find the BMI and display the height, weight, BMI, and status of each individual

package Level3PracticePrograms;
import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi < 18.4) status = "Underweight";
        else if (bmi < 24.9) status = "Normal";
        else if (bmi < 39.9) status = "Overweight";
        else status = "Obese";

        return new String[] {
            String.valueOf(weight),
            String.valueOf(heightCm),
            String.format("%.2f", bmi),
            status
        };
    }

    public static String[][] processData(double[][] data) {
        String[][] results = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            results[i] = calculateBMI(data[i][0], data[i][1]);
        }
        return results;
    }

    public static void displayResults(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight", "Height", "BMI", "Status");
        for (String[] row : results) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }

        String[][] results = processData(persons);
        displayResults(results);
        sc.close();
    }
}
