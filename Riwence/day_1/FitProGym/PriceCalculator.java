package Riwence.day_1.FitProGym;

public class PriceCalculator {
    private static final double BASIC_PRICE = 80.0;
    private static final double PLUS_PRICE = 120.0;
    private static final double PREMIUM_PRICE = 180.0;

    private static final double FIRST_TIME_DISCOUNT = 0.10;
    private static final double YOUNG_DISCOUNT = 0.10;
    private static final double MAX_DISCOUNT = 0.20;

    public static double getPlanPrice(String plan) {
        return switch (plan) {
            case "BASIC" -> BASIC_PRICE;
            case "PLUS" -> PLUS_PRICE;
            case "PREMIUM" -> PREMIUM_PRICE;
            default -> -1;
        };
    }

    public static double calculateDiscount(Member member) {
        double discount = 0.0;

        if (member.firstTime()) {
            discount += FIRST_TIME_DISCOUNT;
        }

        if (member.age() >= 16 && member.age() <= 25) {
            discount += YOUNG_DISCOUNT;
        }

        // Apply maximum discount limit
        if (discount > MAX_DISCOUNT) {
            discount = MAX_DISCOUNT;
        }

        return discount;
    }

    public static double calculateFinalPrice(Member member) {
        double basePrice = getPlanPrice(member.plan());
        if (basePrice == -1) {
            return -1; // Invalid plan
        }

        double discount = calculateDiscount(member);
        return basePrice * (1 - discount);
    }
}
