package riwence.day_1.ATM;

import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
    }

    public void showWelcome() {
        System.out.println("=== WELCOME TO THE ATM ===");
    }

    public void showMenu() {
        System.out.println("=== MAIN MENU ===");
        System.out.println("1. Check balance");
        System.out.println("2. Deposit money");
        System.out.println("3. Withdraw money");
        System.out.println("4. Exit");
        System.out.println("5. Cash advance");
        System.out.print("Select an option: ");
    }

    public int readOption() {
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            scanner.nextLine(); // Clear buffer
            return -1; // Invalid option
        }
    }

    public double readAmount(String message) {
        System.out.print(message);
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            scanner.nextLine(); // Clear buffer
            return -1; // Invalid amount
        }
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showTitle(String title) {
        System.out.println("=== " + title + " ===");
    }

    public void showBlankLine() {
        System.out.println();
    }

    public void showFarewell(String finalBalance) {
        System.out.println("=== THANK YOU FOR USING OUR ATM ===");
        System.out.println("Your final balance is: " + finalBalance);
        System.out.println("Have an excellent day!");
    }

    public void close() {
        scanner.close();
    }
}
