
import java.util.Scanner;

public class PythagoreanTripletChecker {

    public static boolean pythagoreanTripletCheck(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        int max = Math.max(a, Math.max(b, c));

        if (max == a) {
            return (long) b * b + (long) c * c == (long) a * a;
        } else if (max == b) {
            return (long) a * a + (long) c * c == (long) b * b;
        } else {
            return (long) a * a + (long) b * b == (long) c * c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Pythagorean Triplet Checker ===");

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        boolean result = pythagoreanTripletCheck(a, b, c);

        System.out.println("\nFirst number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Third number: " + c);

        if (result) {
            System.out.println("The numbers form a Pythagorean triplet.");
        } else {
            System.out.println("The numbers do not form a Pythagorean triplet.");
        }

        sc.close();
    }
}
