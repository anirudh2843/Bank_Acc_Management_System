public class BankAccount {
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
            System.out.println();
            System.out.println("Deposit Successful! New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdrawAmount(double amount) {
        if (amount > 0 && amount <= balance) { // Fixed condition
            balance -= amount;
            System.out.println();
            System.out.println("Withdrawal Successful!");
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void checkBalance() {
        System.out.println();
        System.out.println("Current Balance: " + balance);
    }

    public void calculateInterest() {
        double interestRate = 0.05;
        double interestAdded = getBalance() * interestRate;
        depositAmount(interestAdded);
        System.out.println("Interest of " + interestAdded + " added.");
    }
}
