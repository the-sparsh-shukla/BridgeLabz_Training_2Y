package Methods;

import java.util.Scanner;

public class FibonacciSeries {
    public static void run(Scanner scanner) {
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        if (terms <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        long first = 0;
        long second = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(first);
            if (i < terms) {
                System.out.print(" ");
            }

            long next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }
}