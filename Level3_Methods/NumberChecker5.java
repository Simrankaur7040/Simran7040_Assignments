// 6 Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods

import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker5 {
    public static int[] findFactors(int number) {
    int count = 0;
    for (int i = 1; i <= number; i++) {
        if (number % i == 0) count++;
    }
    int[] factors = new int[count];
    int index = 0;
    for (int i = 1; i <= number; i++) {
        if (number % i == 0) factors[index++] = i;
    }
    return factors;
}

public static int greatestFactor(int[] factors) {
    return factors[factors.length - 1];
}

public static int sumOfFactors(int[] factors) {
    int sum = 0;
    for (int factor : factors) sum += factor;
    return sum;
}

public static long productOfFactors(int[] factors) {
    long product = 1;
    for (int factor : factors) product *= factor;
    return product;
}

public static long productOfCubeOfFactors(int[] factors) {
    long product = 1;
    for (int factor : factors) product *= Math.pow(factor, 3);
    return product;
}

public static boolean isPerfect(int number) {
    int sum = 0;
    for (int i = 1; i < number; i++) {
        if (number % i == 0) sum += i;
    }
    return sum == number;
}

public static boolean isAbundant(int number) {
    int sum = 0;
    for (int i = 1; i < number; i++) {
        if (number % i == 0) sum += i;
    }
    return sum > number;
}

public static boolean isDeficient(int number) {
    int sum = 0;
    for (int i = 1; i < number; i++) {
        if (number % i == 0) sum += i;
    }
    return sum < number;
}

public static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) fact *= i;
    return fact;
}

public static boolean isStrong(int number) {
    int sum = 0;
    int n = number;
    while (n > 0) {
        int digit = n % 10;
        sum += factorial(digit);
        n /= 10;
    }
    return sum == number;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    int[] factors = findFactors(number);
    System.out.println("Factors: " + Arrays.toString(factors));
    System.out.println("Greatest factor: " + greatestFactor(factors));
    System.out.println("Sum of factors: " + sumOfFactors(factors));
    System.out.println("Product of factors: " + productOfFactors(factors));
    System.out.println("Product of cubes of factors: " + productOfCubeOfFactors(factors));
    System.out.println("Is Perfect number: " + isPerfect(number));
    System.out.println("Is Abundant number: " + isAbundant(number));
    System.out.println("Is Deficient number: " + isDeficient(number));
    System.out.println("Is Strong number: " + isStrong(number));
}
}