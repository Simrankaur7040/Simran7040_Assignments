// 13 Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
import java.util.Scanner;

public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
        
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }   
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println(" Both computations are correct and equal.");
            } else {
                System.out.println(" The results do not match.");
            }
        }
        sc.close();
    }
}
