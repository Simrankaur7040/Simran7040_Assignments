// 16 Create a program to find the maximum number of handshakes among N number of students.

import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("Maximum number of handshakes is " + handshakes);
        sc.close();
    }
}
