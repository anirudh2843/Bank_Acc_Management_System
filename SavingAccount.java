class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate;
        depositAmount(interest);
        System.out.println("Interest of " + interest + " added.");
    }
}
