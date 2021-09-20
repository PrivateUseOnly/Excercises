package io.github.privateuseonly.excercises.easyExercises.ex1.convertCelsiustoFahrenheit;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Logic {
    private static float celsiusInput;

    public static void ConvertAll() {
        AskForCentigradeValue();
        GetUserInput();
        PrintResult();
    }

    private static void PrintResult()
    {
        System.out.print(celsiusInput+" C is = "+ Convert_C_To_F()+" F");
    }

    private static float Convert_C_To_F() {
        // F = 1.8 * Celsius Degrees + 32
        return (float) ((1.8 * celsiusInput) + 32);
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
