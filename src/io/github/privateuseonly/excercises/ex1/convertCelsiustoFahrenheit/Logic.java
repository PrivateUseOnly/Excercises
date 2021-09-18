package io.github.privateuseonly.excercises.ex1.convertCelsiustoFahrenheit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Logic {
    private static float celsiusInput;
    private static float fahrenheit;

    public static void ConvertAll() {
        AskForCentigradeValue();
        GetUserInput();
        Convert_C_To_F();
        PrintResult();
    }

    private static void PrintResult() {
        System.out.print(celsiusInput+" C is = "+ fahrenheit+" F");
    }

    private static float Convert_C_To_F() {
        // F = 1.8 * Celsius Degrees + 32
        return fahrenheit = (float) ((1.8*celsiusInput)+32);
    }


    private static void GetUserInput() {
        celsiusInput = 0;
        Scanner input = new Scanner(System.in);
        try {
            celsiusInput = input.nextFloat();
            input.close();
        }catch (InputMismatchException e){
            AskForCentigradeValue();
            GetUserInput();
        }
    }

    private static void AskForCentigradeValue() {
        System.out.print("Type the number of Celsius degrees to convert: ");
    }
}
