

public class BankAccount {

    //attributes
    private int accountNumber;
    private double balance;

    //constructors
    public BankAccount(int accountnumber, double balance) {
        this.accountNumber = accountnumber;
        this.balance = balance;
    }

    //getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    //Setters
    public void setaccountnumber(int accnumber) {
        this.accountNumber = accnumber;
    }

    public void setbalance(double accbalance) {
        this.balance = accbalance;
    }

    //methods
    public void deposit_amount(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount Deposited, new balance :" + balance);
        } else {
            System.out.println("Invalid Amount.");
        }
    }

    public void withdraw_amount(double amount) {
        if (amount > 0 && amount < balance) {
            balance = balance - amount;
            System.out.println("Withdraw done. balance :" + balance);
        } else {
            System.out.println("Insufficient fund or invalid amount");
        }
    }

    public void check_balance() {
        System.out.println("Balance is :" + balance);
    }

    public void calinterest() {
        double interest = 0.05;
        double interestadded = getBalance() * interest;
        deposit_amount(interestadded);
        System.out.println("The interest added is " + interestadded);
    }

}
