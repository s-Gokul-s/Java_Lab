import java.util.Scanner;

public class p9_Bank {
    String accountNumber;
    String accountHolder;
    double balance;

    // Constructor
    p9_Bank(String accNum, String accHolder, double bal) {
        accountNumber = accNum;
        accountHolder = accHolder;
        balance = bal;
    }

    // Deposit method
    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Display account info
    void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accHolder = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double bal = scanner.nextDouble();

        p9_Bank myAccount = new p9_Bank(accNum, accHolder, bal);
        myAccount.displayAccountInfo();

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        myAccount.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        myAccount.withdraw(withdrawAmount);

        myAccount.displayAccountInfo();
        scanner.close();
    }
}
