
// 5 Write a program to find the frequency of characters in a string using unique characters and display the result

package Level3PracticePrograms;
import java.util.Scanner;
public class CharFrequencyUnique {

    public static char[] uniqueCharacters(String str) {
        int len = str.length();
        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char current = str.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count] = current;
                count++;
            }
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static String[][] findFrequency(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(str);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
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
