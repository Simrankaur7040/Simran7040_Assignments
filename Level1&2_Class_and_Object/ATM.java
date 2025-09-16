// 2 Problem Statement: Create a BankAccount class with attributes accountHolder, accountNumber, and balance. Add methods for:
// Depositing money.
// Withdrawing money (only if sufficient balance exists).
// Displaying the current balance.

class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println("-----------------------------");
    }
}

public class ATM {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.accountHolder = "Simran Kaur";
        account1.accountNumber = 1234567890L;
        account1.balance = 10000.00;

        account1.displayBalance();
        account1.deposit(5000);
        account1.withdraw(3000);
        account1.withdraw(15000);
        account1.displayBalance();
    }
}
