import java.util.Scanner;

public class ShoppingCart {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String item;
    double price;
    int quantity;
    char currency = '$';
    double total;

    System.out.println("What item do you want to buy?");
    item = scanner.nextLine();

    System.out.println("What is the price of " + item + "?");
    price = scanner.nextDouble();

    System.out.println("How many " + item + " do you want to buy?");
    quantity = scanner.nextInt();

    total = price * quantity;

    System.out.println("The total price of " + quantity + " " + item + " is " + currency + total + ".");

    scanner.close();
  }

}
