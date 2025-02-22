
abstract class BankAccount {

    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void depositAmount(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\nDeposit Successful! New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdrawAmount(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("\nWithdrawal Successful! New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println("\nCurrent Balance: " + balance);
    }

    // Abstract method - Must be implemented by subclasses
    public abstract void calculateInterest();
}
