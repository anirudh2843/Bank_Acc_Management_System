import java.util.Scanner;

public class BankAccountApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Creating Saving Account
            BankAccount sa1 = new SavingAccount(101, 100000, 0.07);
            System.out.println("\n***** WELCOME TO SBI BANK *****");
            System.out.println("Account Number: " + sa1.getAccountNumber());
            System.out.printf("Account Balance: ", sa1.getBalance());

            String endSession;
            do {
                System.out.println("\n--- Saving Account Menu ---");
                System.out.println("1. Deposit Amount");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Calculate Interest");
                System.out.println("4. Check Balance");
                System.out.print("Choose an operation (1-4): ");

                if (sc.hasNextInt()) {
                    int operation = sc.nextInt();

                    switch (operation) {
                        case 1:
                            System.out.print("Enter the Amount to Deposit: ");
                            if (sc.hasNextDouble()) {
                                double dAmount = sc.nextDouble();
                                sa1.depositAmount(dAmount);
                            } else {
                                System.out.println("Invalid amount! Please enter a valid number.");
                                sc.next();
                            }
                            break;

                        case 2:
                            System.out.print("Enter the Amount to Withdraw: ");
                            if (sc.hasNextDouble()) {
                                double wAmount = sc.nextDouble();
                                sa1.withdrawAmount(wAmount);
                            } else {
                                System.out.println("Invalid amount! Please enter a valid number.");
                                sc.next();
                            }
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
                } else {
                    System.out.println("Invalid input! Please enter numbers only.");
                    sc.next();
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
