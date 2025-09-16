// 3 Problem Statement: 	Create a PalindromeChecker class with an attribute text. Add methods to:
// Check if the text is a palindrome.
// Display the result.


class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        return text.equalsIgnoreCase(reverse);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a Palindrome.");
        } else {
            System.out.println(text + " is NOT a Palindrome.");
        }
    }
}

public class PalindromeString {
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker();
        p1.text = "Madam";
        p1.displayResult();

        PalindromeChecker p2 = new PalindromeChecker();
        p2.text = "World";
        p2.displayResult();
    }
}
