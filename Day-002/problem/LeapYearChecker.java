
import java.util.Scanner;

class LeapYearChecker {

    public static boolean leapYearCheck(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean result = leapYearCheck(year);

        if (result) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}
