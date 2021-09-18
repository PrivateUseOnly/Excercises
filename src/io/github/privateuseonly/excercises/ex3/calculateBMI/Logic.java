package io.github.privateuseonly.excercises.ex3.calculateBMI;

import java.util.Scanner;

public class Logic {

    private static double weight;
    private static double height;
    private static double result;

    protected static void calculate_BMI(){
        getUserWeight();
        getUserHeight();
        calculate(weight,height);
        showResult();

    }

    private static void showResult() {
        double lowerBorder = 18.5;
        double highestBorder = 24.9;
        if(lowerBorder<result &&result<highestBorder)
        {
            System.out.println("Your BMI is: " + result + " that's in Norm");
        }
        if(lowerBorder >result)
        {
            System.out.println("Your BMI is: " + result + " that's in underweight");
        }
        if(result>highestBorder)
        {
            System.out.println("Your BMI is: " + result + " that's in overweight");
        }
    }

    private static double calculate(double weight, double height) {
        double heightInMeters = height / 100;
        double powerOfHeight = Math.pow(heightInMeters, 2);
        return result =((weight) / powerOfHeight);
    }

    private static double getUserHeight() {
        System.out.println("Type your height, in centimeters!: ");
        Scanner userHeightInput = new Scanner(System.in);
        return height =userHeightInput.nextDouble();
    }

    private static double getUserWeight() {
        System.out.println("Type your weight in kilograms: ");
        Scanner userMassInput = new Scanner(System.in);
        return weight =userMassInput.nextDouble();
    }
}