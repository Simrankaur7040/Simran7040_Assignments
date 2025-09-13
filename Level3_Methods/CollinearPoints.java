//10 Write a program to find the 3 points that are collinear using the slope formulae and area of triangle formulae. check  A (2, 4), B (4, 6) and C (6, 8) are Collinear for sampling. 

import java.util.Scanner;

public class CollinearPoints {

    public static boolean checkCollinearSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAB == slopeAC;
    }

    public static boolean checkCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.print("Enter x3 y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        if (x1 == x2 && x2 == x3) {
            System.out.println("All points lie on the same vertical line → Collinear");
        } else {
            boolean slopeCheck = checkCollinearSlope(x1, y1, x2, y2, x3, y3);
            boolean areaCheck = checkCollinearArea(x1, y1, x2, y2, x3, y3);

            System.out.println("Collinear (Slope Method): " + slopeCheck);
            System.out.println("Collinear (Area Method): " + areaCheck);
        }
    }
}
