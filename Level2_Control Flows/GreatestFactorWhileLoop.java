// 10  Rewrite the above program to print the greatest factor of a number beside itself using a 
import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1;   
        int counter = number - 1; 

        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;  
            }
            counter--;
        }

        System.out.println("Greatest factor of " + number + " (besides itself) is: " + greatestFactor);
        sc.close();
    }
}
