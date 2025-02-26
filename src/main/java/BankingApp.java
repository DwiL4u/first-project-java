import java.util.Scanner;

class BankAccount {
  private final String accountHolderName;
  private double balance;

  public BankAccount(String accountHolderName, double balance) {
    this.accountHolderName = accountHolderName;
    this.balance = balance;
  }

  //method to display the account details
  public void displayAccountDetails() {
    System.out.println("Account Holder Name: " + accountHolderName);
    System.out.println("Balance: $" + balance);
  }

  //method to deposit money
  public void deposit(double amount) {
    balance += amount;
    System.out.println("Successfully deposited $" + amount + " into the account.");
  }

  //method to withdraw money
  public void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
      System.out.println("Successfully withdrew $" + amount + " from the account.");
    } else {
      System.out.println(
          "Insufficient balance! Cannot withdraw $" + amount + " from the account.");
    }
  }

  //method to transfer money
  public void transfer(BankAccount receiver, double amount) {
    if (balance >= amount) {
      balance -= amount;
      receiver.deposit(amount);
      System.out.println("Successfully transferred $" + amount + " to " + receiver.accountHolderName + ".");
    } else {
      System.out.println(
          "Insufficient balance! Cannot transfer $" + amount + " to " + receiver.accountHolderName
              + ".");
    }
  }

  //method to check balance
  public double getBalance() {
    return balance;
  }
}


public class BankingApp {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //create a new bank account
        System.out.println("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();
        System.out.println("Enter initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();
        BankAccount account = new BankAccount(accountHolderName, initialDeposit);

        int choice;
        do {
          //menu options
          System.out.println("1. Display Account Details");
          System.out.println("2. Deposit Money");
          System.out.println("3. Withdraw Money");
          System.out.println("4. Transfer Money");
          System.out.println("5. Check Balance");
          System.out.println("6. Exit");
          System.out.println("Choose an option: ");
          choice = scanner.nextInt();

        switch (choice) {
          case 1:
            account.displayAccountDetails();
            break;
          case 2:
            System.out.println("Enter the amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);
            break;
          case 3:
            System.out.println("Enter the amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);
            break;
          case 4:
            System.out.println("Enter the account holder name of the receiver: ");
            scanner.nextLine();
            String receiverName = scanner.nextLine();
            System.out.println("Enter the amount to transfer: ");
            double transferAmount = scanner.nextDouble();
            BankAccount receiver = new BankAccount(receiverName, 0);
            account.transfer(receiver, transferAmount);
            break;
          case 5:
            System.out.println("Balance: $" + account.getBalance());
            break;
          case 6:
            System.out.println("Exiting the application...");
            break;
          default:
            System.out.println("Invalid choice! Please choose a valid option.");
            break;
        }
      } while(choice !=6);

      scanner.close();
    }
}
