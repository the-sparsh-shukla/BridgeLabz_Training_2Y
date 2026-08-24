package Methods;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void run(Scanner scanner) {
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }

    public static boolean isArmstrong(long number) {
        if (number < 0) {
            return false;
        }

        long temp = number;
        int digits = 0;

        do {
            digits++;
            temp /= 10;
        } while (temp != 0);

        temp = number;
        long sum = 0;

        while (temp != 0) {
            long digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == number;
    }
}