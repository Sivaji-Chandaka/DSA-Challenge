
import java.util.Scanner;

public class ProductOfDigits {

    public static int productOfDigitsOfANumber(int n) {
        long num = Math.abs((long) n);

        if (num == 0) {
            return 0;
        }

        int product = 1;

        while (num > 0) {
            int digit = (int) (num % 10);
            product *= digit;
            num /= 10;
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Product of Digits of a Number ===");

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int result = productOfDigitsOfANumber(n);

        System.out.println("Original number = " + n);
        System.out.println("Product of digits = " + result);

        sc.close();
    }
}
