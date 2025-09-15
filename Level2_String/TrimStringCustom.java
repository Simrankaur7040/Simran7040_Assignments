// 7 Write a program to trim the leading and trailing spaces from a string using the charAt() method 


import java.util.Scanner;

public class TrimStringCustom {

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static int[] trimSpaces(String str) {
        int length = findLength(str);
        int start = 0, end = length - 1;

        while (start < length && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        int len1 = findLength(s1);
        int len2 = findLength(s2);
        if (len1 != len2) return false;
        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        int[] positions = trimSpaces(input);
        String customTrimmed = customSubstring(input, positions[0], positions[1]);
        String builtinTrimmed = input.trim();

        System.out.println("Custom trimmed string: '" + customTrimmed + "'");
        System.out.println("Built-in trimmed string: '" + builtinTrimmed + "'");
        System.out.println("Are both equal? " + compareStrings(customTrimmed, builtinTrimmed));

        sc.close();
    }
}
