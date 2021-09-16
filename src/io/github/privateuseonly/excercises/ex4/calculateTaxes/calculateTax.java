package io.github.privateuseonly.excercises.ex4.calculateTaxes;

// --  Get users income and print result --\\
// -- (income<= 85,528) TAX = 18% -- \\
// -- (income >85,528) Tax is 14_839.02 +
// 32% from everything above 85_528,00 --\\

import java.util.Scanner;

public class calculateTax {

    private static double lowTax;
    private static double highTax;
    private static final double border = 85_528;
    private static double income;

    public static void main(String[] arg) {

        getUserIncome();
        calculate();
        showResult();
    }

    private static void showResult() {
        if (isLowTax()){
            System.out.println("Your Tax to pay is: "+lowTax);
        }else
            System.out.println("Your Tax to pay is: "+highTax);
    }

    private static void calculate() {
        if (isLowTax()){
            lowTax = income * 0.18;
        }else {
            highTax = ((income-border)*0.32)+14_839.00;
        }
    }

    private static boolean isLowTax() {
        return income <= 85_528;
    }


    private static void getUserIncome() {
        System.out.println("Put your income here: ");
    Scanner userIncome = new Scanner(System.in);
    income = userIncome.nextDouble();
        System.out.println("your value: "+income);
    }
}