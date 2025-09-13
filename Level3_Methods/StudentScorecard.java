// 12 Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the total, average, and the percentage score 

import java.util.Scanner;

public class StudentScorecard {

    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; 
        for (int i = 0; i < n; i++) {
            scores[i][0] = 10 + (int)(Math.random() * 90); // Physics
            scores[i][1] = 10 + (int)(Math.random() * 90); // Chemistry
            scores[i][2] = 10 + (int)(Math.random() * 90); // Maths
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return results;
    }

    public static String getGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            String grade = getGrade(results[i][2]);
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + scores[i][2]
                               + "\t" + (int)results[i][0] + "\t" + results[i][1] + "\t\t" 
                               + results[i][2] + "%\t\t" + grade);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);

        displayScorecard(scores, results);
    }
}
