
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SwapTwoNumbers {

    public static List<Integer> swapTwoNumbers(int a, int b) {
        List<Integer> result = new ArrayList<>();

        result.add(b);
        result.add(a);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Swap Two Numbers ===");

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("\nBefore swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);

        List<Integer> result = swapTwoNumbers(a, b);

        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + result.get(0));
        System.out.println("Second number: " + result.get(1));

        sc.close();
    }
}