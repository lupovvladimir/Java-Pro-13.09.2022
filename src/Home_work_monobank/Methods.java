package Home_work_monobank;

import java.text.DecimalFormat;
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

    static void showResult() {
        doInputs();
        rateOfInterest = 4.7;
        DepositForOneYear();
        DepositForFiveYears();
        DepositForTenYears();
    }

    private static void DepositForOneYear() {
        term = 365;
        depositAmount = countDeposit(contributionAmount, rateOfInterest, term);
        depositAmountRounded = roundValue(depositAmount);
        System.out.println("If you open a deposit for one year, your deposit amount will be equal to - " + depositAmountRounded + "$ ");
    }

    private static void DepositForFiveYears() {
        term = 365 * 5;
        depositAmount = countDeposit(contributionAmount, rateOfInterest, term);
        depositAmountRounded = roundValue(depositAmount);
        System.out.println("If you open a deposit for five years, your deposit amount will be equal to - " + depositAmountRounded + "$ ");
    }

    private static void DepositForTenYears() {
        term = 365 * 10;
        depositAmount = countDeposit(contributionAmount, rateOfInterest, term);
        depositAmountRounded = roundValue(depositAmount);
        System.out.println("If you open a deposit for ten years, your deposit amount will be equal to - " + depositAmountRounded + "$ ");
    }

    static double countDeposit(double contributionAmount, double rateOfInterest, int term) {
        int amountDaysInYear = 365;
        int divideBy = 100;
        return contributionAmount + contributionAmount * rateOfInterest * term / amountDaysInYear / divideBy;
    }

    public static String roundValue(double value) {
        return new DecimalFormat("#.00").format(value);
    }
}