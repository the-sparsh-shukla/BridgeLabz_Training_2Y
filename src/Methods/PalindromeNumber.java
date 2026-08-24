package Methods;

import java.util.Scanner;

public class PalindromeNumber {
    public static void run(Scanner scanner) {
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number");
        } else {
            System.out.println(number + " is not a palindrome number");
        }
    }

    public static boolean isPalindrome(long number) {
        if (number < 0) {
            return false;
        }

        long original = number;
        long reversed = 0;

        while (number != 0) {
            long digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;
    }
}