// 8 Write a program to check if two texts are anagrams and display the result

package Level3PracticePrograms;
import java.util.Scanner;

public class AnagramCheck {

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            freq1[str1.charAt(i)]++;
            freq2[str2.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        boolean result = isAnagram(text1, text2);
        System.out.println("Are the two texts anagrams? " + result);

        sc.close();
    }
}
