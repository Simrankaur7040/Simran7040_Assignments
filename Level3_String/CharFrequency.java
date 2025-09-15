// 4 Write a program to find the frequency of characters in a string using the charAt() method and display the result
package Level3PracticePrograms;
import java.util.Scanner;
public class CharFrequency {

    public static String[][] findFrequency(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        int uniqueCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > 0) {
                uniqueCount++;
                freq[str.charAt(i)] = -freq[str.charAt(i)];
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] < 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(-freq[ch]);
                index++;
                freq[ch] = 0;
            }
        }

        return result;
    }

    public static void displayResult(String[][] result) {
        System.out.printf("%-10s %-10s\n", "Character", "Frequency");
        for (String[] row : result) {
            System.out.printf("%-10s %-10s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] result = findFrequency(input);
        displayResult(result);

        sc.close();
    }
}
