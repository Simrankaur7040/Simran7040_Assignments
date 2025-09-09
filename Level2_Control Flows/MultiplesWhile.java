//13 Rewrite the program to find all the multiples of a number below 100 using while loop
import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input. Enter a positive number less than 100.");
        } else {
            int counter = 100;
            System.out.println("Multiples of " + number + " below 100 are:");
            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }

        sc.close();
    }
}
