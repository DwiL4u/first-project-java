import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    String name = "Dwi Lenggani";
//    int age = 43;
//    double height = 154.5;
//    System.out.println("My name is " + name + ", I am " + age + " years old, and my height is " + height + " cm.");
        //if statement = perform different actions based on different conditions
   /*     Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isAStudent;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();


        System.out.println("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a student? (true/false)");
        isAStudent = scanner.nextBoolean();

        //group 1
        if(name.isEmpty()){
            System.out.println("You did not type your name!😤");
        }
        else {
            System.out.println("Hello, " + name + "!");
        }

        //group 2
        if(age >= 65) {
            System.out.println("You are a senior.👴");
        }
        else if (age >= 18) {
            System.out.println("You are an adult.");
        }
        else if(age < 0) {
            System.out.println("You are not born yet.");
        }
        else if (age == 0) {
            System.out.println("You are a baby.👶");
        }
        else {
            System.out.println("You are a child.🧒");
        }

        //group 3

        if(isAStudent) {
            System.out.println("You are a student.🏫");
        }
        else {
            System.out.print("You are not a student.");
        }

        scanner.close();
        */
  //while loop

//        int i = 0;
//        while(i < 5) {
//            System.out.println(i);
//            i++;
//        }
//        int countdown = 3;
//        while(countdown > 0) {
//            System.out.println(countdown);
//            countdown--;
//            }
//            System.out.println("Happy New Year!");
//
        //interest calculator
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the rate(in %): ");
        rate = scanner.nextDouble()/100;

        System.out.println("Enter the number of times the interest is compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.println("Enter the number of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded * years);

        System.out.println("The amount after " + years + " years is: $" + amount + ".");

        scanner.close();

}
}
