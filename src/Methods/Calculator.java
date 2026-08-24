package Methods;

import java.util.Scanner;

public class Calculator {
    public static void run(Scanner scanner) {
        System.out.print("Enter first number: ");
        double first = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double second = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+' -> result = first + second;
            case '-' -> result = first - second;
            case '*' -> result = first * second;
            case '/' -> {
                if (second == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                result = first / second;
            }
            default -> {
                System.out.println("Invalid operator");
                return;
            }
        }

        System.out.println("Result: " + result);
    }
}