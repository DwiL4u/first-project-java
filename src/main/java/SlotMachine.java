import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
  public static void main(String[] args) {

    //java slot machine
    Scanner scanner = new Scanner(System.in);
    int balance = 100;
    int bet;
    int payout;
    String[] row;
    String playAgain;

    System.out.println("********************************");
    System.out.println("Welcome to the Slot Machine!");
    System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");
    System.out.println("********************************");

    while(balance > 0) {
      System.out.println("Balance: $" + balance);
      System.out.println("Enter your bet: ");
      bet = scanner.nextInt();

      if (bet > balance) {
        System.out.println(
            "Insufficient balance! Please enter a bet less than or equal to your balance.");
        continue;
      } else if (bet <= 0) {
        System.out.println("Please enter a bet greater than 0.");
        continue;
      } else {
        balance -= bet;
      }
      scanner.nextLine();
      System.out.println("Spinning the slot machine...");
      scanner.nextLine();
      row = spinRow();
      printRow(row);
      payout = getPayOut(row, bet);

      if (payout > 0) {
        balance += payout;
        System.out.println("Congratulations! You won $" + payout + "!");
      } else {
        System.out.println("Sorry! You lost.");
      }

      // If balance is zero, exit loop and end game
      if (balance == 0) {
        System.out.println("You have run out of balance! GAME OVER!");
      }
      System.out.println("Do you want to play again? (Y/N)");
      playAgain = scanner.nextLine().toUpperCase();

      if (playAgain.equals("N")) {
        System.out.println("Thank you for playing! Your final balance is: $" + balance);
        break;
      } else if (playAgain.equals("Y")) {
        System.out.println("You have no balance! Exiting the game.");
        break;
      }
    }

    scanner.close();
  }
  private static String[] spinRow() {
    String[] row = new String[3];
    Random random = new Random();
    String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};

    for (int i = 0; i < 3; i++) {
      row[i] = symbols[random.nextInt(symbols.length)];
    }
    return row;
  }
  private static void printRow(String[] row) {
    System.out.println("***********");
    System.out.println("| " + row[0] + " | " + row[1] + " | " + row[2] + " |");
    System.out.println("***********");
  }

  private static int getPayOut(String[] row, int bet) {
    if(row[0].equals(row[1]) && row[1].equals(row[2])) {
      return switch (row[0]) {
        case "🍒" -> bet * 3;
        case "🍉" -> bet * 5;
        case "🍋" -> bet * 10;
        case "🔔" -> bet * 20;
        case "⭐" -> bet * 50;
        default -> 0;
      };
      } else if (row [0].equals(row[1]))  {
        return switch (row[0]) {
          case "🍒" -> bet * 2;
          case "🍉" -> bet * 3;
          case "🍋" -> bet * 5;
          case "🔔" -> bet * 10;
          case "⭐" -> bet * 20;
          default -> 0;
        };
      } else if(row[1].equals(row[2])) {
        return switch (row[1]) {
          case "🍒" -> bet * 2;
          case "🍉" -> bet * 3;
          case "🍋" -> bet * 5;
          case "🔔" -> bet * 10;
          case "⭐" -> bet * 20;
          default -> 0;
        };
      }
        return 0;
    }

  }





