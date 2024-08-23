package sandeep1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiNumberCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Multi-Number Calculator");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the number of values: ");
        int count = scanner.nextInt();

        List<Double> numbers = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            numbers.add(scanner.nextDouble());
        }

        double result = 0;

        switch (choice) {
            case 1:
                result = numbers.stream().mapToDouble(Double::doubleValue).sum();
                break;
            case 2:
                result = numbers.stream().mapToDouble(Double::doubleValue).reduce((a, b) -> a - b).orElse(0);
                break;
            case 3:
                result = numbers.stream().mapToDouble(Double::doubleValue).reduce(1, (a, b) -> a * b);
                break;
            case 4:
                if (!numbers.contains(0.0)) {
                    result = numbers.stream().mapToDouble(Double::doubleValue).reduce((a, b) -> a / b).orElse(0);
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }
}

