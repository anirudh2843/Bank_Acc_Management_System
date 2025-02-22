import java.util.Scanner;

public class BankAccountApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Creating Saving Account
            SavingAccount sa1 = new SavingAccount(101, 100000, 0.07);  // 7% interest
            System.out.println("***** WELCOME TO SBI BANK *****");
            System.out.println("Account Number: " + sa1.getAccountNumber());
            System.out.println("Account Balance: " + sa1.getBalance());

            String endSession;
            do {
                System.out.println("\n--- Saving Account Menu ---");
                System.out.println("1. Deposit Amount");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Calculate Interest");
                System.out.println("4. Check Balance");
                System.out.print("Choose an operation (1-4): ");

                try {
                    int operation = sc.nextInt();

                    switch (operation) {
                        case 1:
                            System.out.print("Enter the Amount to Deposit: ");
                            double dAmount = sc.nextDouble();
                            sa1.depositAmount(dAmount);
                            break;

                        case 2:
                            System.out.print("Enter the Amount to Withdraw: ");
                            double wAmount = sc.nextDouble();
                            sa1.withdrawAmount(wAmount);
                            break;

                        case 3:
                            sa1.calculateInterest();
                            break;

                        case 4:
                            sa1.checkBalance();
                            break;

                        default:
                            System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter numbers only.");
                    sc.nextLine(); 
                }

                System.out.print("\nDo you want to exit? (yes/no): ");
                endSession = sc.next();
            } while (!endSession.equalsIgnoreCase("yes"));

            System.out.println("Thank you for banking with us!");
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
