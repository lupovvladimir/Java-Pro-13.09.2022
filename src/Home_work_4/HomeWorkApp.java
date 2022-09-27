package Home_work_4;

public class HomeWorkApp {

    public static void main(String[] args) {

        int numOne = 5;
        int numTwo = 10;
        String strTest = "String Test";
        int year = 2004;


        System.out.println("Task №2:");
        printThreeWords();
        System.out.println("\n");

        System.out.println("Task №3:");
        checkSumSign();
        System.out.println("\n");

        System.out.println("Task №4:");
        printColor();
        System.out.println("\n");

        System.out.println("Task №5:");
        compareNumbers();
        System.out.println("\n");

        System.out.println("Task №6:");
        boolean isFromTenToTwenty = checkTheSum(numOne, numTwo);
        System.out.println(isFromTenToTwenty);
        System.out.println("\n");

        System.out.println("Task №7:");
        printAPositiveOrNegativeNumber(numOne);
        System.out.println("\n");

        System.out.println("Task №8:");
        boolean isNegative = checkWhetherTheNumberIsPositiveOrNegative(numOne);
        System.out.println(isNegative);
        System.out.println("\n");

        System.out.println("Task №9:");
        printStringNTimes(numOne, strTest);
        System.out.println("\n");

        System.out.println("Task №10:");
        System.out.println(whatYearIsIt(year));


    }

    private static void printThreeWords() {
        System.out.println("""
                Orange
                Banana
                Apple""");
    }

    private static void checkSumSign() {
        int a = 0;
        int b = 1;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("The amount is positive");
        } else System.out.println("The amount is negative");

    }

    private static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");

        }
    }

    private static void compareNumbers() {
        int a = 22;
        int b = 23;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    private static boolean checkTheSum(int valueOne, int valueTwo) {

        int sum = valueOne + valueTwo;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void printAPositiveOrNegativeNumber(int valueOne) {
        if (valueOne >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");

        }
    }


    private static boolean checkWhetherTheNumberIsPositiveOrNegative(int value) {
        if (value >= 0) {
            return false;
        } else {
            return true;
        }
    }

    private static void printStringNTimes(int value, String sTest) {

        for (int i = 0; i < value; i++) {
            System.out.println(sTest);
        }
    }

    private static boolean whatYearIsIt(int value) {
        if ((value % 400 == 0 || value % 4 == 0) && value % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }
}





