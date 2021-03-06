package io.github.privateuseonly.excercises.easyExercises.ex6.simpleCalculator;

import java.io.IOException;
import java.util.Scanner;

public class Logic {

    private static double input1;
    private static String action;
    private static double input2;
    private static int actionToInt;
    private static double result;

    public static void startCounting() throws IOException {
        getInput1();
        getAction();
        getInput2();
        evaluate();
        assignAction_ActionToInt();
        calculate();
        showResult();
        waitForEnter();

    }

    private static void waitForEnter() throws IOException {
        System.out.println("Press enter key to continue...");
        System.in.read();
        }


    private static void showResult() {
        System.out.println("The result of "+input1+action+input2+" is "+result);
    }


    private static void calculate(){
        switch (actionToInt){
            case 1: result = input1+input2;
                break;
            case 2: result = input1-input2;
                break;
            case 3: result = input1*input2;
                break;
            case 4: result = input1/input2;
                break;
        }
    }

    private static void assignAction_ActionToInt() {
        if (action.equals("+")) {
            actionToInt = 1;
        }
        if (action.equals("-")) {
            actionToInt = 2;
        }
        if (action.equals("*")) {
            actionToInt = 3;
        }
        if (action.equals("/")) {
            actionToInt = 4;
        }
    }

    public static void evaluate() throws IOException {
        if (input2 == 0) {
            System.out.println("Don't divide by 0!");
            startCounting();
        }
        if (!action.equals("+") && !action.equals("-") && !action.equals("/") && !action.equals("*")) {
            System.out.println("Signs allowed are: + - * / ");
            startCounting();
        }
    }
    public static double getInput2() {
        Scanner secondUserInput = new Scanner(System.in);
        input2 = secondUserInput.nextDouble();
        return input2;
    }

    public static String getAction() {
        Scanner userAction = new Scanner(System.in);
        action = userAction.next();
        System.out.println("type second number");
        return action;
    }

    public static double getInput1() {
        Scanner firstUserInput = new Scanner(System.in);
        input1 = firstUserInput.nextDouble();
        System.out.println("what you want to do, with it? (+, -, *, /");
        return input1;
    }
}
