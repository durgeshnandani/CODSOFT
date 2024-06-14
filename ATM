
import java.util.*;

interface Withdraw {
    void withdraw_amount(double withdrawal_amount);
}

interface Deposite {
    void deposite_amount(double deposited_amount);
}

interface BalanceCheck {
    void check_balance();
}

class ATM_Machine implements Withdraw, Deposite, BalanceCheck {
    private double current_balance = 0;

    public void withdraw_amount(double withdrawal_amount) {
        if (current_balance >= withdrawal_amount) {
            current_balance = current_balance - withdrawal_amount;
            System.out.println("Your withdrawal amount is: " + withdrawal_amount);
        } else {
            System.out.println("SORRY! You don't have enough balance to withdraw");
        }
    }

    public void deposite_amount(double deposited_amount) {
        current_balance = current_balance + deposited_amount;
        System.out.println("CONGRATULATIONS! The amount of " + deposited_amount + " has been deposited to your account");
    }

    public void check_balance() {
        System.out.println("Your current balance is: " + current_balance);
    }
}

public class ATM2 {
    public static void main(String[] args) {
        ATM_Machine a1 = new ATM_Machine();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("PLEASE ENTER YOUR CHOICE");
            System.out.println("1. WITHDRAW AMOUNT");
            System.out.println("2. DEPOSITE AMOUNT");
            System.out.println("3. CHECK BALANCE");
            System.out.println("4. EXIT");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter the amount you want to withdraw");
                double withdrawal_amount = sc.nextDouble();
                a1.withdraw_amount(withdrawal_amount);
            } else if (choice == 2) {
                System.out.println("Enter the amount you want to deposite");
                double deposited_amount = sc.nextDouble();
                a1.deposite_amount(deposited_amount);
            } else if (choice == 3) {
                a1.check_balance();
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}
