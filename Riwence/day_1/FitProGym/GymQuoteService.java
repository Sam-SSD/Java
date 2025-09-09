package Riwence.day_1.FitProGym;

import java.util.Scanner;

public class GymQuoteService {
    private final Scanner scanner;

    public GymQuoteService() {
        this.scanner = new Scanner(System.in);
    }

    public void processQuote() {
        // Input data
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();

        scanner.nextLine(); // Clear buffer
        System.out.print("Enter the plan (BASIC, PLUS, PREMIUM): ");
        String plan = scanner.nextLine().toUpperCase();

        System.out.print("Is this your first time? (true/false): ");
        boolean firstTime = scanner.nextBoolean();

        // Create member
        Member member = new Member(name, age, height, weight, plan, firstTime);

        // Age validation
        if (!member.isEligible()) {
            System.out.println("Not eligible - Minimum age requirement not met.");
            return;
        }

        if (member.requiresGuardianAuthorization()) {
            System.out.println("Requires guardian authorization.");
        }

        // Calculate prices
        double basePrice = PriceCalculator.getPlanPrice(member.plan());
        if (basePrice == -1) {
            System.out.println("Invalid plan selected.");
            return;
        }

        double discount = PriceCalculator.calculateDiscount(member);
        double finalPrice = PriceCalculator.calculateFinalPrice(member);

        // Display results
        displayResults(member, basePrice, discount, finalPrice);
    }

    private void displayResults(Member member, double basePrice,
                               double discount, double finalPrice) {
        System.out.println("\n=== FITPRO GYM QUOTE ===");
        System.out.println("Name: " + member.name());
        System.out.println("Selected plan: " + member.plan());
        System.out.println("Base price: $" + String.format("%.2f", basePrice));
        System.out.println("Discount applied: " + String.format("%.0f%%", discount * 100));
        System.out.println("Final price: $" + String.format("%.2f", finalPrice));
        System.out.println("BMI category: " + member.getBMICategory());
    }
}
