import java.util.Scanner;

class BankAccount {
    private double balance = 1000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful.");
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        int choice;

        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    account.deposit(scanner.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    account.withdraw(scanner.nextDouble());
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
