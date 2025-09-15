// 4 Write a program to split the text into words and find the shortest and longest strings in a given text

import java.util.Scanner;

public class ShortestLongestWord {

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

    public static String[] splitText(String str) {
        int length = findLength(str);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int[] spaces = new int[spaceCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                spaces[index++] = i;
            }
        }
        String[] words = new String[spaceCount + 1];
        int start = 0;
        for (int i = 0; i < spaceCount; i++) {
            words[i] = str.substring(start, spaces[i]);
            start = spaces[i] + 1;
        }
        words[spaceCount] = str.substring(start, length);
        return words;
    }

    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static int[] findShortestAndLongest(String[][] wordsWithLengths) {
        int minIndex = 0, maxIndex = 0;
        int minLen = Integer.parseInt(wordsWithLengths[0][1]);
        int maxLen = minLen;
        for (int i = 1; i < wordsWithLengths.length; i++) {
            int len = Integer.parseInt(wordsWithLengths[i][1]);
            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        String[] words = splitText(input);
        String[][] wordsWithLengths = getWordsAndLengths(words);
        int[] result = findShortestAndLongest(wordsWithLengths);

        System.out.println("Word\tLength");
        for (int i = 0; i < wordsWithLengths.length; i++) {
            System.out.println(wordsWithLengths[i][0] + "\t" + Integer.parseInt(wordsWithLengths[i][1]));
        }

        System.out.println("Shortest word: " + wordsWithLengths[result[0]][0] + " (Length: " + wordsWithLengths[result[0]][1] + ")");
        System.out.println("Longest word: " + wordsWithLengths[result[1]][0] + " (Length: " + wordsWithLengths[result[1]][1] + ")");

        sc.close();
    }
}
