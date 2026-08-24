package Methods;

import java.util.Scanner;

public class SumOfDigits {
    public static void run(Scanner scanner) {
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        System.out.println("Sum of digits: " + sum(number));
    }

    public static long sum(long number) {
        number = Math.abs(number);
        long total = 0;

        while (number != 0) {
            total += number % 10;
            number /= 10;
        }

        return total;
    }
}