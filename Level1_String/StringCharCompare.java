// 3 Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
package Level1PracticePrograms;
import java.util.Scanner;

public class StringCharCompare {

    public static char[] getChars(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    public static boolean compareArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] userDefinedArray = getChars(text);
        char[] builtInArray = text.toCharArray();

        boolean result = compareArrays(userDefinedArray, builtInArray);

        System.out.print("User-defined char array: ");
        for (char c : userDefinedArray) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in char array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both arrays equal? " + result);
        sc.close();
    }
}

