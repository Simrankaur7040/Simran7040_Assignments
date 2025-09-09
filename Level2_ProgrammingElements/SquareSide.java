// 3 Write a program to find the side of the square whose parameter you read from the user 
import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter perimeter of the square: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        sc.close();
    }
}
