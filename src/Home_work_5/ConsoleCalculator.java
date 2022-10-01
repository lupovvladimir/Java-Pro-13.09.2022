package Home_work_5;

import java.util.Scanner;

public class ConsoleCalculator {

    static Scanner scanner;
    static double operandOne;
    static double operandTwo;

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
        operandOne = scanner.nextDouble();

        System.out.println("Select arithmetic operations (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        System.out.println("Enter second number:");
        scanner = new Scanner(System.in);
        operandTwo = scanner.nextDouble();

        switch (operation) {
            case '+' -> System.out.println("Result: " + add(operandOne, operandTwo));
            case '-' -> System.out.println("Result: " + subtract(operandOne, operandTwo));
            case '*' -> System.out.println("Result: " + multiply(operandOne, operandTwo));
            case '/' -> System.out.println("Result: " + divide(operandOne, operandTwo));
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

    private static double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    private static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    private static double divide(double firstNumber, double secondNumber) {

        if (secondNumber == 0) {
            System.out.println("division by '0' is not possible");
        } else {
            return firstNumber / secondNumber;
        }
        return firstNumber / secondNumber;
    }
}