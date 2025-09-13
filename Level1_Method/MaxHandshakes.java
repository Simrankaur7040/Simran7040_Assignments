// 3 Create a program to find the maximum number of handshakes among N number of students.
import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of possible handshakes among "
                + numberOfStudents + " students is " + handshakes);

        sc.close();
    }
}
