
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first = input.nextDouble();

        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        System.out.println("Sum: " + (first + second));
        System.out.println("Difference: " + (first - second));
        System.out.println("Product: " + (first * second));

        if (second != 0) {
            System.out.println("Quotient: " + (first / second));
        } else {
            System.out.println("Cannot divide by zero.");
        }

        input.close();
    }
}
