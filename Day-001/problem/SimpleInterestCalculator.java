
import java.util.Scanner;

public class SimpleInterestCalculator {

    public static double simpleInterest(int principal, int rate, int time) {
        return (principal * rate * time) / 100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Simple Interest Calculator ===");

        System.out.print("Enter the principal amount: ");
        int principal = sc.nextInt();

        System.out.print("Enter the rate of interest (%): ");
        int rate = sc.nextInt();

        System.out.print("Enter the time (in years): ");
        int time = sc.nextInt();

        double interest = simpleInterest(principal, rate, time);

        System.out.println("\nPrincipal Amount: " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest: " + interest);

        sc.close();
    }
}