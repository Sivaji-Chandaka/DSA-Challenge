
import java.util.Scanner;

class DaysInAMonth{

    public static int daysInAMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            case 2:
                if ((year % 400 == 0) ||
                    (year % 4 == 0 && year % 100 != 0)) {
                    return 29;
                } else {
                    return 28;
                }

            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month number (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        int result = daysInAMonth(month, year);

        if (result == -1) {
            System.out.println("Invalid month number!");
        } else {
            System.out.println("Number of days: " + result);
        }

        sc.close();
    }
}
