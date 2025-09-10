//8 Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3];  
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                int mark;
                do {
                    System.out.print(subject + " marks: ");
                    mark = sc.nextInt();
                    if (mark < 0) {
                        System.out.println("Marks must be positive. Please enter again.");
                    }
                } while (mark < 0);
                marks[i][j] = mark;
            }

            
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300.0) * 100;

   
            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } else if (percentage[i] >= 70) {
                grade[i] = 'B';
            } else if (percentage[i] >= 60) {
                grade[i] = 'C';
            } else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } else if (percentage[i] >= 40) {
                grade[i] = 'E';
            } else {
                grade[i] = 'R';  
            }
        }

        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s %-10s\n",
                          "Physics", "Chemistry", "Maths", "Percentage", "Grade", "Status");

        for (int i = 0; i < n; i++) {
            String status = switch (grade[i]) {
                case 'A' -> "Above standards";
                case 'B' -> "At standards";
                case 'C' -> "Approaching standards";
                case 'D' -> "Below standards";
                case 'E' -> "Too below standards";
                default -> "Remedial";
            };
            System.out.printf("%-10d %-10d %-10d %-12.2f %-10c %-20s\n",
                              marks[i][0], marks[i][1], marks[i][2],
                              percentage[i], grade[i], status);
        }

        sc.close();
    }
}
