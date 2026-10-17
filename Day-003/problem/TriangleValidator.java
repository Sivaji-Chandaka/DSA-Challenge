
import java.util.Scanner;

public class TriangleValidator {

    public static boolean validTriangleCheck(int a, int b, int c) {
        return a > 0 && b > 0 && c > 0
                && a + b > c
                && a + c > b
                && b + c > a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Valid Triangle Checker ===");

        System.out.print("Enter the first side: ");
        int a = sc.nextInt();

        System.out.print("Enter the second side: ");
        int b = sc.nextInt();

        System.out.print("Enter the third side: ");
        int c = sc.nextInt();

        boolean result = validTriangleCheck(a, b, c);

        System.out.println("\nFirst side: " + a);
        System.out.println("Second side: " + b);
        System.out.println("Third side: " + c);

        if (result) {
            System.out.println("The given sides form a valid triangle.");
        } else {
            System.out.println("The given sides do not form a valid triangle.");
        }

        sc.close();
    }
}
