import java.util.Scanner;

class VotingEligibility {

    public static boolean votingEligibility(int age) {
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        boolean result = votingEligibility(age);

        if (result) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        sc.close();
    }
}