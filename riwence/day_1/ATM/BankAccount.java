package riwence.day_1.ATM;

import java.text.NumberFormat;
import java.util.Locale;

public class BankAccount {
    private double balance;
    private final NumberFormat currencyFormat;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.currencyFormat = NumberFormat.getCurrencyInstance(Locale.of("es", "CO"));
    }

    public String getFormattedBalance() {
        return currencyFormat.format(balance);
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean cashAdvance(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance -= amount; // Subtract amount to simulate withdrawal with advance
        return true;
    }

    public boolean hasDebt() {
        return balance < 0;
    }

    public String formatAmount(double amount) {
        return currencyFormat.format(amount);
    }
}
