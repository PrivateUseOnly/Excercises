package io.github.privateuseonly.excercises.calculateMinMaxValuesFrom3ThatUserGives;

import java.util.Arrays;
import java.util.Scanner;

public class calculations {

    private static int[] intArray;
    private static int lowestNumberInArray;
    private static int highestNumberInArray;

    static void showResult() {
    askForIntegers();
    getIntegers();
    calculateLow();
    calculateHigh();
    printResults();
    }

    private static void askForIntegers() {
        System.out.print("Type 3 integers, separate them with Enter: ");
    }

    private static void getIntegers() {
        intArray = new int[3];
            for (int i=0; i<3; i++){
                Scanner input = new Scanner(System.in);
                int integerInput = input.nextInt();
                intArray[i] = integerInput;
            }
        }

    private static void calculateLow() {
        lowestNumberInArray = Arrays.stream(intArray).min().getAsInt();
    }

    private static void calculateHigh() {
        highestNumberInArray = Arrays.stream(intArray).max().getAsInt();

    }
    private static void printResults() {
        System.out.println("The lowest number is: " + lowestNumberInArray);
        System.out.println("The highest number is: " + highestNumberInArray + "\n");
    }

}
