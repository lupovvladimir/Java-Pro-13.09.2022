package Home_work_5;

import java.util.Scanner;

public class ConsoleCalculator {

    static Scanner scanner;
    static double firstNumber;
    static double secondNumber;

    public static void main(String[] args) {

        System.out.println("Task one:");
        String str = "юукяД ібот ,ежоб ощ я ен !ьлаксом";

        flipString(str);
        calculator();

    }

    private static void flipString(String str) {
        String[] strArray = str.split(" ");
        for (int i = 0; i < 7; i++) {
            char[] s1 = strArray[i].toCharArray();
            for (int j = s1.length - 1; j >= 0; j--) {
                System.out.print(s1[j]);
            }
            System.out.print(" ");
        }

    }

    private static void calculator() {
        System.out.println("\n");
        System.out.println("Task two:");
        System.out.println("Console calculator with basic functionality greets you !");
        System.out.println("Enter first number:");
        scanner = new Scanner(System.in);
        firstNumber = scanner.nextDouble();

        System.out.println("Select arithmetic operations (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        System.out.println("Enter second number:");
        scanner = new Scanner(System.in);
        secondNumber = scanner.nextDouble();

        switch (operation) {
            case '+' -> System.out.println("Result: " + add(firstNumber, secondNumber));
            case '-' -> System.out.println("Result: " + subtraction(firstNumber, secondNumber));
            case '*' -> System.out.println("Result: " + multiplication(firstNumber, secondNumber));
            case '/' -> System.out.println("Result: " + division(firstNumber, secondNumber));
            default -> System.out.println("Not a correct character");
        }

        System.out.println("Want to continue? \n" + "Enter 'e' to exit / Enter 'y' to repeat: ");
        scanner = new Scanner(System.in);
        char exit = scanner.next().charAt(0);


        switch (exit) {
            case 'e' -> scanner.close();
            case 'y' -> calculator();
        }

    }

    private static double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;

    }

    private static double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    private static double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    private static double division(double firstNumber, double secondNumber) {

        if (secondNumber == 0) {
            System.out.println("division by '0' is not possible");
        } else {
            return firstNumber / secondNumber;
        }
        return firstNumber / secondNumber;
    }
}