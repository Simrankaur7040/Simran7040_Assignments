//2 Write a program that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 

import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq cm is " + areaCm + " and in sq in is " + areaInch);

        sc.close();
    }
}
