//5 Problem Statement: Create a MobilePhone class with attributes brand, model, and price. Add a method to display all the details of the phone.
// The MobilePhone class uses attributes to store the phone's characteristics. The method is used to retrieve and display this information for each object.

class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : ₹" + price);
       
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone();
        phone1.brand = "Samsung";
        phone1.model = "Galaxy S23";
        phone1.price = 74999.99;

        MobilePhone phone2 = new MobilePhone();
        phone2.brand = "Apple";
        phone2.model = "iPhone 15";
        phone2.price = 129999.00;

        phone1.displayDetails();
        phone2.displayDetails();
    }
}