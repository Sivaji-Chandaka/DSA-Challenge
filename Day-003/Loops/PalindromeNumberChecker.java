
import java.util.Scanner;

public class PalindromeNumberChecker {

    public static boolean palindromeNumberCheck(int n) {
        if (n < 0) {
            return false;
        }

        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Palindrome Number Checker ===");

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        boolean result = palindromeNumberCheck(n);

        System.out.println("Original number = " + n);

        if (result) {
            System.out.println(n + " is a palindrome number.");
        } else {
            System.out.println(n + " is not a palindrome number.");
        }

        sc.close();
    }
}
