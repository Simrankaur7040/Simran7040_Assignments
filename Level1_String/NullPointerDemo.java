// 4 Write a program to demonstrate NullPointerException. 
package Level1PracticePrograms;
public class NullPointerDemo {

    public static void generateException() {
        String text = null;
        System.out.println("Length of text: " + text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {
        // generateException();
        handleException();
    }
}
