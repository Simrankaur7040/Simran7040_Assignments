// 10 Write a program to convert the complete text to lowercase and compare the results


package Level1PracticePrograms;
import java.util.Scanner;

public class LowercaseComparison {

    static String toLowerCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String manualResult = toLowerCaseManual(input);
        String builtInResult = input.toLowerCase();

        System.out.println("Manual conversion: " + manualResult);
        System.out.println("Built-in conversion: " + builtInResult);

        if (compareStrings(manualResult, builtInResult)) {
            System.out.println("Both results are the same.");
        } else {
            System.out.println("Results are different.");
        }

        sc.close();
    }
}
