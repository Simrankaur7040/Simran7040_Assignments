// 9  Write a program to take 2 numbers and print their quotient and reminder
import java.util.Scanner;

public class RemainderAndQuotient {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  
        int remainder = number % divisor;  
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("The Quotient is " + result[0] + 
                           " and the Remainder is " + result[1] +
                           " of two numbers " + number + " and " + divisor);

        sc.close();
    }
}
