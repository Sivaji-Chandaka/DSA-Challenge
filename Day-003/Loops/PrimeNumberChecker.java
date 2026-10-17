
import java.util.Scanner;

public class PrimeNumberChecker {

    public static boolean primeNumberCheck(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Prime Number Checker ===");

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        boolean result = primeNumberCheck(n);

        System.out.println("Number = " + n);

        if (result) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }

        sc.close();
    }
}
