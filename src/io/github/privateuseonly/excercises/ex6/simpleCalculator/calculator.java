package io.github.privateuseonly.excercises.ex6.simpleCalculator;


// -- Exercise description -- \\
// -- Write a simple calculator which handles: adding, subtraction, multiplication, division
// -- of 2 numbers.
// -- The program should prevent dividing by 0, or inputting a bad sign.
// -- There should be used a switch command to perform the wanted action.
// -- Scenario:
// --   (a) The program shows the info about what he is made for and his abilities.
// --   (b) Reads the first number
// --   (c) Reads the arithmetic symbol
// --   (d) Reads the second number
// --   (e) Shows the result or - when needed - info that the operation could not be performed
// --   (f) Program ends his work, after the user push the Enter key. -- \\


public class calculator {

    public static void main(String[] args){

        printWelcomeMsg();
        logic.startCounting();
    }

    private static void printWelcomeMsg() {
        System.out.println("Hello, this is a simple calculator \n " +
                "It can add, subtract, divide and multiply\n" +
                "You can quit after doing some calculations " +
                "by pushing Enter key\n" +
                "TYPE A NUMBER HERE:");
    }


}
