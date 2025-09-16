// 5 Program to Simulate a Shopping Cart
// Problem Statement: Create a CartItem class with attributes itemName, price, and quantity. Add methods to:
// Add an item to the cart.
// Remove an item from the cart.
// Display the total cost.

class CartItem {
    String itemName;
    double price;
    int quantity;

    double getTotal() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println(itemName + " (" + quantity + " x ₹" + price + ") = ₹" + getTotal());
    }
}

public class ShoppingCartSimulation {
    CartItem item; 

    void addItem(String name, double price, int qty) {
        item = new CartItem();
        item.itemName = name;
        item.price = price;
        item.quantity = qty;
        System.out.println(qty + " x " + name + " added to cart.");
    }

    void removeItem() {
        if (item != null) {
            System.out.println(item.itemName + " removed from cart.");
            item = null;
        } else {
            System.out.println("Cart is empty. Nothing to remove.");
        }
    }

    void displayTotalCost() {
        if (item != null) {
            System.out.println("Cart Items:");
            item.displayItem();
            System.out.println("Total Cost: ₹" + item.getTotal());
        } else {
            System.out.println("Cart is empty.");
        }
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        ShoppingCartSimulation cart = new ShoppingCartSimulation();

        cart.addItem("Laptop", 55000.0, 1);
        cart.displayTotalCost();

        cart.removeItem();
        cart.displayTotalCost();
        cart.removeItem();
    }
}

