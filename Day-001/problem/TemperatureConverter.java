
import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(int celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Celsius to Fahrenheit Converter ===");

        System.out.print("Enter temperature in Celsius: ");
        int celsius = sc.nextInt();

        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println("Temperature in Celsius: " + celsius + "°C");
        System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");

        sc.close();
    }
}