import java.util.Scanner;

// Define the custom exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Define the BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal. Current balance: " + balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

// Main application class
public class BankingApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a BankAccount with an initial balance
        System.out.println("Enter initial balance:");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        // Perform transactions
        try {
            System.out.println("Enter amount to deposit:");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            System.out.println("Enter amount to withdraw:");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Final Balance: " + account.getBalance());
        }

        scanner.close();
    }
}

