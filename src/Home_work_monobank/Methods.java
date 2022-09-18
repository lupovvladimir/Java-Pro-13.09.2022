package Home_work_monobank;

import java.util.Scanner;

public class Methods {

    static Scanner scanner;
    static String firstName;
    static String secondName;
    static double contributionAmount;
    static double rateOfInterest;
    static int term;
    static double depositAmount;
    static String depositAmountRounded;


    static void doInputs() {

        System.out.println("Enter your first name:");
        scanner = new Scanner(System.in);
        firstName = scanner.nextLine();

        System.out.println("Enter your second name:");
        scanner = new Scanner(System.in);
        secondName = scanner.nextLine();

        System.out.println("Enter the amount you want to put on deposit:");
        scanner = new Scanner(System.in);
        contributionAmount = scanner.nextDouble();
    }
}