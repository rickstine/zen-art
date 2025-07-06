// BankAccount class with deposit and withdrawal methods
public class BankAccount {
    private double balance; // stores the account balance

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // add amount to balance
        }
    }

    // Method to withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // subtract amount from balance
            return true;
        }
        return false; // insufficient funds or invalid amount
    }

    // Method to check current balance
    public double getBalance() {
        return balance;
    }
}
