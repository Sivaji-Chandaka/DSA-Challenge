
import java.util.Scanner;

public class  TotalSecondsFromHoursAndMinutes{

    public static int totalSecondsFromHoursAndMinutes(int hours, int minutes) {
        return (hours * 3600) + (minutes * 60);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Hours and Minutes to Seconds Converter ===");

        System.out.print("Enter the number of hours: ");
        int hours = sc.nextInt();

        System.out.print("Enter the number of minutes: ");
        int minutes = sc.nextInt();

        int totalSeconds = totalSecondsFromHoursAndMinutes(hours, minutes);

        System.out.println("\nHours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Total seconds: " + totalSeconds);

        sc.close();
    }
}