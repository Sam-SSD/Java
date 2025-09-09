package riwence.day_1.FitProGym;

public record Member(String name, int age, double height, double weight, String plan, boolean firstTime) {

    public double calculateBMI() {
        return weight / (height * height);
    }

    public String getBMICategory() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    public boolean isEligible() {
        return age >= 14;
    }

    public boolean requiresGuardianAuthorization() {
        return age >= 14 && age < 18;
    }
}
