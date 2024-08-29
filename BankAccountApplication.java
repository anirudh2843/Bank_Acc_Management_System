
public class BankAccountApplication {

    public static void main(String[] args) {
        SavingAccount sa1 = new SavingAccount(101, 10000.0, 0.07);
        System.out.println(sa1.getBalance());
        System.out.println(sa1.getAccountNumber());
        sa1.deposit_amount(5000);
        sa1.withdraw_amount(1000);
        sa1.calinterest();
        sa1.check_balance();
    }
}
