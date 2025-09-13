// 9 Write a program Euclidean distance between two points as well as the equation of the line using those two points. Use Math functions Math.pow() and Math.sqrt()

import java.util.Scanner;

public class LineAndDistance {

    public static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];
        double m = (y2 - y1) / (x2 - x1);   // slope
        double b = y1 - m * x1;             // intercept
        result[0] = m;
        result[1] = b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = euclideanDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.4f%n", distance);

        if (x1 == x2) {
            System.out.println("Equation of line: x = " + x1 + " (Vertical line, slope undefined)");
        } else {
            double[] line = lineEquation(x1, y1, x2, y2);
            System.out.printf("Equation of line: y = %.4fx + %.4f%n", line[0], line[1]);
        }
    }
}
