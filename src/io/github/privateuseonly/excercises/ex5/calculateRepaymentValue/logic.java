package io.github.privateuseonly.excercises.ex5.calculateRepaymentValue;

import java.util.Scanner;

public class logic {

    private static double loan;
    private static double installmentsNumber;
    private static final double LOW_BORDER = 100;
    private static final double HIGH_BORDER = 10_000;
    private static boolean isLowOk;
    private static boolean isHighOk;
    private static final double PERCENTAGE_FOR_6_TO_12_INSTALLMENTS = 0.025;
    private static final double PERCENTAGE_FOR_13_TO_24_INSTALLMENTS = 0.05;
    private static final double PERCENTAGE_FOR_25_TO_48_INSTALLMENTS = 0.1;
    private static double totalLoanValue;
    private static double installmentValue;

    public static void getWantedLoanValue() {
        System.out.println("Type wished value of loan: ");
        Scanner loanInput = new Scanner(System.in);
        loan = loanInput.nextDouble();
    }

    public static void getNumberOfInstallments() {
        System.out.println("Type number of installments: ");
        Scanner installmentsInput = new Scanner(System.in);
        installmentsNumber = installmentsInput.nextDouble();
    }

    public static void evaluation() {
       isLowOk =  (loan >= LOW_BORDER) && (installmentsNumber >= 6);
       isHighOk = (loan <= HIGH_BORDER) && (installmentsNumber <= 48);

       if (isLowOk==false||isHighOk==false){
           System.out.println("Inputs are false, please correct!");
           fastRepaymentCalculator.startCalculation();
       }

    }

    public static void calculateCompleteLoanValue() {
        if (installmentsNumber<=12){
            double correctPercentagePerInstallment = PERCENTAGE_FOR_6_TO_12_INSTALLMENTS/12;
            totalLoanValue = loan+correctPercentagePerInstallment*installmentsNumber*loan;
        }
        if (installmentsNumber>=12&&installmentsNumber<=24){
            double correctPercentagePerInstallment = PERCENTAGE_FOR_13_TO_24_INSTALLMENTS/12;
            totalLoanValue = loan+correctPercentagePerInstallment*installmentsNumber*loan;
        }
        if (installmentsNumber>24){
            double correctPercentagePerInstallment = PERCENTAGE_FOR_25_TO_48_INSTALLMENTS/12;
            totalLoanValue = loan+correctPercentagePerInstallment*installmentsNumber*loan;
        }
    }

    public static void divideCompleteLoanValue_By_NumberOfInstallments() {
           installmentValue = totalLoanValue / installmentsNumber;
    }

    public static void printResult() {
        System.out.println("Your monthly payment should be: "+ installmentValue);
    }
}
