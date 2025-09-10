// 9 Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade

import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = 10;
        final int SUBJECTS = 3; 

        double[][] marks = new double[N][SUBJECTS]; 
        double[] percentage = new double[N];
        char[] grade = new char[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");

            for (int j = 0; j < SUBJECTS; j++) {
                double m = sc.nextDouble();
                if (m < 0 || m > 100) {
                    System.out.println("Invalid marks! Please enter again.");
                    j--; 
                    continue;
                }
                marks[i][j] = m;
            }
        }
        for (int i = 0; i < N; i++) {
            double total = 0;
            for (int j = 0; j < SUBJECTS; j++) {
                total += marks[i][j];
            }

            percentage[i] = total / SUBJECTS;

            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 75) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 40) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        // Output
        System.out.println("\nStudent Results:");
        for (int i = 0; i < N; i++) {
            System.out.print("Student " + (i + 1) + " Marks: ");
            for (int j = 0; j < SUBJECTS; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println("| Percentage: " + percentage[i] + "% | Grade: " + grade[i]);
        }

        sc.close();
    }
}
