package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        double a = 1; // Represents the variable a
        double b = 2; // Represents the variable b


        // Calculate the formula
        double result = (9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);

        // Print the result
        System.out.println("The result is: " + result);
    }
}
