

public class SavingAccount extends BankAccount {

    //inherited attributes and methods
    //attribute
    private double interestrate;

    //constructor
    public SavingAccount(int accountno, double balance, double interest) {
        //super
        super(accountno, balance);
        this.interestrate = interest;
    }

    //method-->calculate interest
    @Override
    public void calinterest() {
        double interest = getBalance() * interestrate;
        deposit_amount(interest);
        System.out.println("The interest added is " + interest);
    }

}
