package io.github.privateuseonly.excercises.ex3.calculateBMI;

// -- Calculate BMI and show results: Norm = 18,5 - 24,9 -- \\
// -- overweight > Norm,  underweight < Norm  -- \\
// -- weight/height^2 metric! -- \\

import java.util.Scanner;

public class bmiCalculator {

    private static double weight;
    private static double height;
    private static double result;

    public static void main(String[] arg) {

        getUserWeight();
        getUserHeight();
        calculate();
        showResult();

    }

    private static void showResult() {
        double lowerBorder = 18.5;
        double highestBorder = 24.9;
        if(lowerBorder<result &&result<highestBorder)
        {
            System.out.println("Your BMI is: " + result + " that's in Norm");
        }if(lowerBorder >result)
        {
            System.out.println("Your BMI is: " + result + " that's in underweight");
        }
        if(result>highestBorder)
        {
            System.out.println("Your BMI is: " + result + " that's in overweight");
        }
    }

    private static void calculate() {
        double heightInMeters = height / 100;
        double powerOfHeight = Math.pow(heightInMeters, heightInMeters);
        result = ((weight) / powerOfHeight);

    }

    private static void getUserHeight() {
        System.out.println("Type your height, in centimeters!: ");
        Scanner userHeightInput = new Scanner(System.in);
        height =userHeightInput.nextDouble();
    }

    private static void getUserWeight() {
        System.out.println("Type your weight in kilograms: ");
        Scanner userMassInput = new Scanner(System.in);
        weight =userMassInput.nextDouble();
    }
}