package riwence.day_1.ATM;

public class ATMachine {
    private final BankAccount account;
    private final UserInterface ui;

    public ATMachine() {
        this.account = new BankAccount(1000000.0); // Initial balance $1,000,000 COP
        this.ui = new UserInterface();
    }

    public void run() {
        ui.showWelcome();

        boolean continueRunning = true;
        while (continueRunning) {
            ui.showMenu();
            int option = ui.readOption();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney();
                    break;
                case 3:
                    withdrawMoney();
                    break;
                case 4:
                    continueRunning = false;
                    showFarewell();
                    break;
                case 5:
                    cashAdvance();
                    break;
                default:
                    ui.showMessage("Invalid option. Please select an option from 1 to 5.");
            }

            checkDebtorStatus();
            ui.showBlankLine();
        }

        ui.close();
    }

    private void checkBalance() {
        ui.showTitle("BALANCE INQUIRY");
        ui.showMessage("Your current balance is: " + account.getFormattedBalance());
    }

    private void depositMoney() {
        ui.showTitle("MONEY DEPOSIT");
        double amount = ui.readAmount("Enter the amount to deposit: $");

        if (amount == -1) {
            ui.showMessage("Invalid amount. Please enter a valid number.");
            return;
        }

        if (account.deposit(amount)) {
            ui.showMessage("Deposit successful.");
            ui.showMessage("Amount deposited: " + account.formatAmount(amount));
            ui.showMessage("Your new balance is: " + account.getFormattedBalance());
        } else {
            ui.showMessage("The amount must be greater than zero.");
        }
    }

    private void withdrawMoney() {
        ui.showTitle("MONEY WITHDRAWAL");
        double amount = ui.readAmount("Enter the amount to withdraw: $");

        if (amount == -1) {
            ui.showMessage("Invalid amount. Please enter a valid number.");
            return;
        }

        if (account.withdraw(amount)) {
            ui.showMessage("Withdrawal successful.");
            ui.showMessage("Amount withdrawn: " + account.formatAmount(amount));
            ui.showMessage("Your new balance is: " + account.getFormattedBalance());
        } else {
            if (amount <= 0) {
                ui.showMessage("The amount must be greater than zero.");
            } else {
                ui.showMessage("Insufficient funds. Your current balance is: " + account.getFormattedBalance());
            }
        }
    }

    private void cashAdvance() {
        ui.showTitle("CASH ADVANCE");
        ui.showMessage("WARNING: This operation may leave your balance negative.");
        double amount = ui.readAmount("Enter the advance amount: $");

        if (amount == -1) {
            ui.showMessage("Invalid amount. Please enter a valid number.");
            return;
        }

        if (account.cashAdvance(amount)) {
            ui.showMessage("Cash advance processed successfully.");
            ui.showMessage("Advance amount: " + account.formatAmount(amount));
            ui.showMessage("Your new balance is: " + account.getFormattedBalance());

            if (account.hasDebt()) {
                ui.showMessage("NOTE: Your account now has a negative balance.");
            }
        } else {
            ui.showMessage("The amount must be greater than zero.");
        }
    }

    private void checkDebtorStatus() {
        if (account.hasDebt()) {
            ui.showMessage("⚠️  Negative balance, remember to pay the previously made advance");
        }
    }

    private void showFarewell() {
        ui.showFarewell(account.getFormattedBalance());
    }
}

