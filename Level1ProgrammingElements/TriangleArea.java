// 12 Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 

import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        double areaInCm2 = area * 6.4516; // 1 in² = 6.4516 cm²

        System.out.println("The area of the triangle is " + area + " square inches and " + areaInCm2 + " square centimeters");
        sc.close();
    }
}
