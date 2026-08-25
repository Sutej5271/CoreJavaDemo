import java.util.Scanner;

class Bank {

    private int accountNo;
    private String name;
    private double balance;

    private static String bankName = "ABC Bank";
    private static double totalBalance = 0;
    private static int noOfAccounts = 0;

    Bank(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;

        totalBalance = totalBalance + balance;
        noOfAccounts++;
    }

    void Deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            totalBalance = totalBalance + amount;

            System.out.println("Amount deposited successfully.");
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void Display() {
        System.out.println("Account No : " + accountNo);
        System.out.println("Name       : " + name);
        System.out.println("Balance    : " + balance);
    }

    void Withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } 
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } 
        else {
            balance -= amount;
            totalBalance -= amount;

            System.out.println("Amount withdrawn successfully.");
            System.out.println("Current Balance: " + balance);
        }
    }

    static void Bankdetails() {
        System.out.println("Bank Name      : " + bankName);
        System.out.println("Total Balance  : " + totalBalance);
        System.out.println("No. of Accounts: " + noOfAccounts);
    }
}

public class BankSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank account1 = new Bank(101, "Manu", 5000);
        Bank account2 = new Bank(102, "Rahul", 10000);

        account1.Display();
        account2.Display();

        System.out.print("\nEnter deposit amount for Manu: ");
        double deposit = sc.nextDouble();
        account1.Deposit(deposit);

        System.out.print("\nEnter withdrawal amount for Rahul: ");
        double withdraw = sc.nextDouble();
        account2.Withdraw(withdraw);

        account1.Display();
        account2.Display();

        Bank.Bankdetails();

        sc.close();
    }
}