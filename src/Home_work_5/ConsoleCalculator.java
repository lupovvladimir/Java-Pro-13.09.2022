package Home_work_5;

import java.util.Scanner;

public class ConsoleCalculator {

    static Scanner scanner;
    static double operandFirst;
    static double operandSecond;

    public static void main(String[] args) {

        System.out.println("Task one:");
        String sentence = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";

        flipEachWordInStr(sentence);
        calculator();

    }

    private static void flipEachWordInStr(String sentence) {

        String[] words = sentence.split("Z");

        for (String word : words) {
            System.out.print(new StringBuilder(word).reverse() + " ");
        }
    }

    private static void calculator() {
        System.out.println("\n");
        System.out.println("Task two:");
        System.out.println("Console calculator with basic functionality greets you !");
        System.out.println("Enter first number:");
        scanner = new Scanner(System.in);
        operandFirst = scanner.nextDouble();

        System.out.println("Select arithmetic operations (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        System.out.println("Enter second number:");
        scanner = new Scanner(System.in);
        operandSecond = scanner.nextDouble();

        switch (operation) {
            case '+' -> System.out.println("Result: " + add(operandFirst, operandSecond));
            case '-' -> System.out.println("Result: " + subtract(operandFirst, operandSecond));
            case '*' -> System.out.println("Result: " + multiply(operandFirst, operandSecond));
            case '/' -> System.out.println("Result: " + divide(operandFirst, operandSecond));
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