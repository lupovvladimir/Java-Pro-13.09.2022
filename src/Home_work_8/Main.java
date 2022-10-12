package Home_work_8;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        System.out.println("Example 1:");
        int[] exampleOne = new int[]{1, 2, 3, 4};
        int[] showResultOne = runningSum(exampleOne);
        System.out.println(Arrays.toString(showResultOne));
        System.out.println("\n");

        System.out.println("Example 2:");
        int[] exampleTwo = new int[]{1, 1, 1, 1, 1};
        int[] showResultTwo = runningSum(exampleTwo);
        System.out.println(Arrays.toString(showResultTwo));
        System.out.println("\n");

        System.out.println("Example 3:");
        int[] exampleThree = new int[]{3, 1, 2, 10, 1};
        int[] showResultThree = runningSum(exampleThree);
        System.out.println(Arrays.toString(showResultThree));

    }

    public static int[] runningSum(int[] arrOfNums) {
        int[] result = new int[arrOfNums.length];

        for (int i = 0; i < arrOfNums.length; i++) {
            if(i == 0){
                result[0] = arrOfNums[0];
            } else {
                result[i] = result[i - 1] + arrOfNums[i];
            }
        }
        return result;
    }
}
