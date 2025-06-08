package Class8;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {

        /**
         * 1. Create abbreviation for given string-data
         */
        /*
            Good morning    ->  GM
            wOrk HaRD paRTy HArdEr  ->  WHPH
         */
        System.out.println("\nCreate abbreviation for given string-data");
        String sentence1 = "Good morning";
        String result1 = "";
        // code
        System.out.println("sentence1 -> "+sentence1);
        System.out.println("result1 -> "+result1);

        /**
         * 2. Reverse the given String (by words)
         */
        /*
            Good morning    ->  morning Good
            wOrk HaRD paRTy HArdEr  ->  HArdEr paRTy HaRD wOrk
            have A greAt DaY    ->  DaY greAt A have
         */
        System.out.println("\nReverse the given String (by words)");
        String sentence2 = "have A greAt DaY";
        String result2 = "";
        // code
        System.out.println("sentence1 -> "+sentence2);
        System.out.println("result1 -> "+result2);

        /**
         * 3. Calculate the total of all numbers present in the int-array
         */
        System.out.println("\nCalculate the total of all numbers present in the int-array");
        int[] numbers = {43, 54, -12, 87, -198, 65};
        int total = 0;
        // code
        System.out.println("numbers -> "+ Arrays.toString(numbers));
        System.out.println("total -> "+ total);

    }
}
