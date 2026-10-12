
import java.util.Scanner;

public class PercentageCalculator {

    public static double percentageCalculation(int obtainedMarks, int totalMarks) {
        return (obtainedMarks * 100.0) / totalMarks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Percentage Calculator ===");

        System.out.print("Enter your obtained marks: ");
        int obtainedMarks = sc.nextInt();

        System.out.print("Enter the total marks: ");
        int totalMarks = sc.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Error: Total marks must be greater than zero.");
        } else if (obtainedMarks < 0 || obtainedMarks > totalMarks) {
            System.out.println("Error: Obtained marks must be between 0 and total marks.");
        } else {
            double percentage = percentageCalculation(obtainedMarks, totalMarks);

            System.out.println("\nObtained Marks: " + obtainedMarks);
            System.out.println("Total Marks: " + totalMarks);
            System.out.printf("Percentage: %.2f%%%n", percentage);
        }

        sc.close();
    }
}