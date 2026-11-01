
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double first = input.nextDouble();

        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        System.out.print("Enter the third number: ");
        double third = input.nextDouble();

        double average = (first + second + third) / 3;

        System.out.println("The average is: " + average);

        input.close();
    }
}
