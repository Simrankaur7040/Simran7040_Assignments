//4 Problem Statement: Create a MovieTicket class with attributes movieName, seatNumber, and price. Add methods to:
// Book a ticket (assign seat and update price).
// Display ticket details.
 

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movie, int seat, double ticketPrice) {
        movieName = movie;
        seatNumber = seat;
        price = ticketPrice;
        System.out.println("Ticket booked successfully!");
    }

    void displayTicket() {
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price      : ₹" + price);
        System.out.println("-----------------------------");
    }
}

public class MovieBooking {
    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket();
        ticket1.bookTicket("Avengers: Endgame", 12, 250.00);
        ticket1.displayTicket();

        MovieTicket ticket2 = new MovieTicket();
        ticket2.bookTicket("jungle book", 25, 300.00);
        ticket2.displayTicket();
    }
}
