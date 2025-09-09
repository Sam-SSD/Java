package riwence.day_1.FitProGym;

public class BMITester {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DE CATEGORÍAS BMI ===\n");

        // Caso 1: Underweight (BMI < 18.5)
        System.out.println("CASO 1: UNDERWEIGHT");
        Member member1 = new Member("Ana García", 20, 1.70, 50, "BASIC", true);
        testBMI(member1, "Ana García", 1.70, 50);

        // Caso 2: Normal (BMI 18.5 - 24.9)
        System.out.println("\nCASO 2: NORMAL");
        Member member2 = new Member("Carlos López", 25, 1.75, 70, "PLUS", false);
        testBMI(member2, "Carlos López", 1.75, 70);

        // Caso 3: Overweight (BMI 25.0 - 29.9)
        System.out.println("\nCASO 3: OVERWEIGHT");
        Member member3 = new Member("María Rodriguez", 30, 1.65, 75, "PREMIUM", true);
        testBMI(member3, "María Rodriguez", 1.65, 75);

        // Caso 4: Obesity (BMI >= 30)
        System.out.println("\nCASO 4: OBESITY");
        Member member4 = new Member("Juan Pérez", 35, 1.70, 90, "PLUS", false);
        testBMI(member4, "Juan Pérez", 1.70, 90);

        // Casos límite
        System.out.println("\n=== CASOS LÍMITE ===");

        // Límite exacto Normal (18.5)
        System.out.println("\nLÍMITE: Normal exacto (BMI = 18.5)");
        Member limitNormal = new Member("Test Normal", 25, 1.70, 53.5, "BASIC", false);
        testBMI(limitNormal, "Test Normal", 1.70, 53.5);

        // Límite exacto Overweight (25.0)
        System.out.println("\nLÍMITE: Overweight exacto (BMI = 25.0)");
        Member limitOverweight = new Member("Test Overweight", 25, 1.75, 76.6, "BASIC", false);
        testBMI(limitOverweight, "Test Overweight", 1.75, 76.6);

        // Límite exacto Obesity (30.0)
        System.out.println("\nLÍMITE: Obesity exacto (BMI = 30.0)");
        Member limitObesity = new Member("Test Obesity", 25, 1.65, 81.7, "BASIC", false);
        testBMI(limitObesity, "Test Obesity", 1.65, 81.7);
    }

    private static void testBMI(Member member, String name, double height, double weight) {
        double bmi = member.calculateBMI();
        String category = member.getBMICategory();

        System.out.println("Nombre: " + name);
        System.out.println("Altura: " + height + " m");
        System.out.println("Peso: " + weight + " kg");
        System.out.println("BMI calculado: " + String.format("%.2f", bmi));
        System.out.println("Categoría: " + category);
        System.out.println("Cálculo manual: " + weight + " / (" + height + ")² = " +
                          String.format("%.2f", weight / (height * height)));
    }
}
