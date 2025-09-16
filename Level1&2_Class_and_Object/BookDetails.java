//3 Problem Statement: Write a program to create a Book class with attributes title, author, and price. Add a method to display the book details.

class Book {
    String title;
    String author;
    double price;

    void displayDetails() {
        System.out.println("Book Title : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : ₹" + price);
        System.out.println("-----------------------------");
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "The Alchemist";
        b1.author = "Paulo Coelho";
        b1.price = 399.50;

        Book b2 = new Book();
        b2.title = "Wings of Fire";
        b2.author = "A.P.J. Abdul Kalam";
        b2.price = 299.99;

        b1.displayDetails();
        b2.displayDetails();
    }
}
