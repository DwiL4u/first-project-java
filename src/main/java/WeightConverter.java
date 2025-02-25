import java.util.Scanner;

public class WeightConverter {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Welcome to the Weight Converter!");
      System.out.println("1. Kilograms to Pounds");
      System.out.println("2. Pounds to Kilograms");
      System.out.println("Choose an option(1 or 2): ");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.println("Enter the weight in kilograms: ");
          double weightInKilograms = scanner.nextDouble();
          double weightInPounds = weightInKilograms * 2.20462;
          System.out.println("The weight in pounds is: " + weightInPounds);
          break;
        case 2:
          System.out.println("Enter the weight in pounds: ");
          double weightInPounds2 = scanner.nextDouble();
          double weightInKilograms2 = weightInPounds2 / 2.20462;
          System.out.println("The weight in kilograms is: " + weightInKilograms2);
          break;
        default:
          System.out.println("Invalid choice! Please choose 1 or 2.");
          break;

      }
      scanner.close();
    }
    public static double convertKilogramsToPounds(double weightInKilograms) {
      return weightInKilograms * 2.20462;
    }
    public static double convertPoundsToKilograms(double weightInPounds) {
      return weightInPounds / 2.20462;
    }

}
