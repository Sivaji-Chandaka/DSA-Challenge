
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FibonacciSeriesGenerator {

    public static List<Integer> fibonacciSeriesUpToNTerms(int n) {
        List<Integer> result = new ArrayList<>();

        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            result.add(a);

            int c = a + b;
            a = b;
            b = c;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Fibonacci Series Generator ===");

        System.out.print("Enter the number of terms (N): ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else if (n > 47) {
            System.out.println("Please enter 47 or fewer terms to avoid integer overflow.");
        } else {
            List<Integer> result = fibonacciSeriesUpToNTerms(n);

            System.out.println("Number of terms = " + n);
            System.out.println("Fibonacci series: " + result);
        }

        sc.close();
    }
}
