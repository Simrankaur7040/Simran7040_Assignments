//3 Write a program to find the first non-repeating character in a string and show the result

package Level3PracticePrograms;
import java.util.Scanner;

public class FirstNonRepeating {

    public static char findFirstNonRepeating(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // return null character if no non-repeating found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeating(input);

        if (result == '\0')
            System.out.println("No non-repeating character found.");
        else
            System.out.println("First non-repeating character: " + result);

        sc.close();
    }
}
