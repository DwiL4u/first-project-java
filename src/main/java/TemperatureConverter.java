import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Choose an option(1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the temperature in Celsius: ");
                double temperatureInCelsius = scanner.nextDouble();
                double temperatureInFahrenheit = convertCelsiusToFahrenheit(temperatureInCelsius);
                System.out.printf("The temperature in Fahrenheit is: %.2f\n", temperatureInFahrenheit);
                break;
            case 2:
                System.out.println("Enter the temperature in Fahrenheit: ");
                double temperatureInFahrenheit2 = scanner.nextDouble();
                double temperatureInCelsius2 = convertFahrenheitToCelsius(temperatureInFahrenheit2);
                System.out.printf("The temperature in Celsius is: %.2f\n", temperatureInCelsius2);
                break;
            default:
                System.out.println("Invalid choice! Please choose 1 or 2.");
                break;

        }
        scanner.close();


    }
    //Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double temperatureInCelsius) {
        return (temperatureInCelsius * 9 / 5) + 32;
    }
    //Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double temperatureInFahrenheit) {
        return (temperatureInFahrenheit - 32) * 5 / 9;
    }

}
