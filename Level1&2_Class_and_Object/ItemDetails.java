// 4 Problem Statement: Create an Item class with attributes itemCode, itemName, and price. Add a method to display item details and calculate the total cost for a given quantity.

class Item {
    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code  : " + itemCode);
        System.out.println("Item Name  : " + itemName);
        System.out.println("Price      : ₹" + price);
        
    }

    double calculateTotal(int quantity) {
        return price * quantity;
    }
}

public class ItemDetails {
    public static void main(String[] args) {
        Item item1 = new Item();
        item1.itemCode = 101;
        item1.itemName = "Laptop";
        item1.price = 55000.75;

        item1.displayDetails();

        int quantity = 2;
        double totalCost = item1.calculateTotal(quantity);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : ₹" + totalCost);
    }
}
