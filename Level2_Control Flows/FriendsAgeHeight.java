//6 Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights


import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        int amarHeight = sc.nextInt();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = sc.nextInt();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = sc.nextInt();

        // Find youngest
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Amar is the youngest.");
        } else if (akbarAge < anthonyAge) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        // Find tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Amar is the tallest.");
        } else if (akbarHeight > anthonyHeight) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }

        sc.close();
    }
}

