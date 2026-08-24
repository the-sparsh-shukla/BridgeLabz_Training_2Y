package Methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Basic Calculator");
            System.out.println("2. Armstrong Number");
            System.out.println("3. Prime Number");
            System.out.println("4. Palindrome Number");
            System.out.println("5. Fibonacci Series");
            System.out.println("6. Sum of Digits");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Goodbye");
                break;
            }

            switch (choice) {
                case 1 -> Calculator.run(scanner);
                case 2 -> ArmstrongNumber.run(scanner);
                case 3 -> PrimeNumber.run(scanner);
                case 4 -> PalindromeNumber.run(scanner);
                case 5 -> FibonacciSeries.run(scanner);
                case 6 -> SumOfDigits.run(scanner);
                default -> System.out.println("Invalid choice");
            }

            System.out.println();
        }

        scanner.close();
    }
}