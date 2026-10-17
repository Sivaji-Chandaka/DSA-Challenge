
import java.util.Scanner;

public class FactorialCalculator {

    public static int factorialOfANumber(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Factorial of a Number ===");

        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (n > 12) {
            System.out.println("Please enter a number between 0 and 12.");
            System.out.println("The factorial may overflow the int range for larger numbers.");
        } else {
            int result = factorialOfANumber(n);

            System.out.println("Number = " + n);
            System.out.println("Factorial of " + n + " = " + result);
        }

        sc.close();
    }
}
