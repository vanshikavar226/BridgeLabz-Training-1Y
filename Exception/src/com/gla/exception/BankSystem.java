package com.gla.exception;

import java.util.Scanner;

// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

// Main Class
public class BankSystem {

    double balance = 10000; // initial balance

    // Withdraw method
    public void withdraw(double amount) throws InsufficientBalanceException {

        // Check negative amount (unchecked)
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        // Check insufficient balance (checked custom)
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }

        // Successful withdrawal
        balance = balance - amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankSystem account = new BankSystem();

        try {
            System.out.print("Enter amount to withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            sc.close();
        }
    }
}
