
import java.util.Scanner;

public class MedianOfThreeNumbers {

    public static int medianOfThreeNumbers(int a, int b, int c) {
        if ((a >= b && a <= c) || (a >= c && a <= b)) {
            return a;
        } else if ((b >= a && b <= c) || (b >= c && b <= a)) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Median of Three Numbers ===");

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        int median = medianOfThreeNumbers(a, b, c);

        System.out.println("\nFirst number: " + a);
        System.out.println("Second number: " + b);
        System.out.println("Third number: " + c);
        System.out.println("Median: " + median);

        sc.close();
    }
}
