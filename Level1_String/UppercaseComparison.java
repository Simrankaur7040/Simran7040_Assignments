// 9 Write a program to convert the complete text to uppercase and compare the results

package Level1PracticePrograms;
import java.util.Scanner;

public class UppercaseComparison {

    static String toUpperCaseManual(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String manualResult = toUpperCaseManual(input);
        String builtInResult = input.toUpperCase();

        System.out.println("Manual conversion: " + manualResult);
        System.out.println("Built-in conversion: " + builtInResult);

        if (manualResult.equals(builtInResult)) {
            System.out.println("Both results are the same.");
        } else {
            System.out.println("Results are different.");
        }

        sc.close();
    }
}
