package io.github.privateuseonly.excercises.ex5.calculateRepaymentValue;

public class fastRepaymentCalculator {
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
        logic.getWantedLoanValue();
        logic.getNumberOfInstallments();
        logic.evaluation();
        logic.calculateCompleteLoanValue();
        logic.divideCompleteLoanValue_By_NumberOfInstallments();
        logic.printResult();
    }
}
