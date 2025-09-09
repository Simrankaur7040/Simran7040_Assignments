//12 Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
import java.util.Scanner;

public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 1) {
            int formulaSum = n * (n + 1) / 2;
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + sum);
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}
