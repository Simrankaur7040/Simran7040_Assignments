//1 Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.

import java.util.Scanner;
public class VotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
        
    }
}