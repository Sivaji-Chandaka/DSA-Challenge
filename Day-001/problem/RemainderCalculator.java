
import java.util.Scanner;

public class RemainderCalculator {

    public static int remainderOfTwoNumbers(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Remainder of Two Numbers ===");

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Error: Cannot find the remainder when dividing by zero.");
        } else {
            int result = remainderOfTwoNumbers(a, b);
            System.out.println("Remainder of two numbers: " + result);
        }

        sc.close();
    }
}