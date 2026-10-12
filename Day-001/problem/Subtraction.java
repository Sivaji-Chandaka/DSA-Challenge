
import java.util.Scanner;

public class Subtraction     {

    public static int subtract_two_numbers(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Subtraction of Two Numbers ===");

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        int result = subtract_two_numbers(a, b);

        System.out.println("Difference of two numbers: " + result);

        sc.close();
    }
}