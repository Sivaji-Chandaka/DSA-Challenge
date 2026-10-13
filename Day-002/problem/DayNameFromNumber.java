
import java.util.Scanner;

class DayNameFromNumber {

    public static String dayNameFromNumber(int dayNumber) {
        switch (dayNumber) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day number (1-7): ");
        int dayNumber = sc.nextInt();

        String result = dayNameFromNumber(dayNumber);

        if (result.equals("Invalid")) {
            System.out.println("Invalid day number!");
        } else {
            System.out.println("Day name: " + result);
        }

        sc.close();
    }
}
