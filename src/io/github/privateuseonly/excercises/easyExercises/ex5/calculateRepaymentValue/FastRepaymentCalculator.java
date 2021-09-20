package io.github.privateuseonly.excercises.easyExercises.ex5.calculateRepaymentValue;

public class FastRepaymentCalculator {
// -- Exercise description:
// -- get price (100 - 10_000),
// -- get number of installments (6 - 48).
// -- calculate monthly payment rate
// -- percentage depends on the number of installments:
// -- 6-12 = 2.5%
// -- 13-24 = 5%
// -- 24-48 = 10%

    public static void main(String[] args){
        startCalculation();
        }

    public static void startCalculation() {
        Logic.getWantedLoanValue();
        Logic.getNumberOfInstallments();
        Logic.evaluation();
        Logic.calculateCompleteLoanValue();
        Logic.divideCompleteLoanValue_By_NumberOfInstallments();
        Logic.printResult();
    }
}
