import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the numerator: ");
        double numerator = scanner.nextDouble();

        System.out.print("Enter the denominator: ");
        double denominator = scanner.nextDouble();

        try {
            if (denominator == 0) {
                throw new ArithmeticException("CANNOT DIVIDE BY ZERO");
            }
            double result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch the ArithmeticException if the denominator is zero
            System.out.println(e.getMessage());
        } 
    }
}
