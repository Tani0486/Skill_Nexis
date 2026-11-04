/*Bank Management Console App (Basic Version)
● Menu-driven program: Deposit, Withdraw, Check Balance
● Use Scanner, Loops, and Conditional Statements*/

import java.util.Scanner;

public class Bank_ManagementConsole {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000;
        double amount;
        int choice;

        while (true) {

            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextDouble();

                    if (amount > 0) {
                        balance = balance + amount;
                        System.out.println("Money deposited successfully!");
                        System.out.println("Current Balance: Rs. " + balance);
                    }
                    else {
                        System.out.println("Invalid amount!");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextDouble();

                    if (amount <= 0) {
                        System.out.println("Invalid amount!");
                    }
                    else if (amount <= balance) {
                        balance = balance - amount;
                        System.out.println("Money withdrawn successfully!");
                        System.out.println("Remaining Balance: Rs. " + balance);
                    }
                    else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 3:
                    System.out.println("Your Current Balance: Rs. " + balance);
                    break;

                case 4:
                    System.out.println("Thank you for using our Bank!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}


