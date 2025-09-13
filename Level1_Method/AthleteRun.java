// 4 An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete

import java.util.Scanner;

public class AthleteRun {
    public static int calculateRounds(double side1, double side2, double side3, double distance) {
        double perimeter = side1 + side2 + side3; 
        return (int) Math.ceil(distance / perimeter); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1 of the triangular park (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2 of the triangular park (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3 of the triangular park (in meters): ");
        double side3 = sc.nextDouble();
        double totalDistance = 5000; 
        int rounds = calculateRounds(side1, side2, side3, totalDistance);
        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km.");

        sc.close();
    }
}
