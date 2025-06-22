package Class12;

import java.util.Arrays;

public class Method_Concept_1 {

    /**
     * Note:
     *      No method can be created within another method.
     *      All method(or all code) must be written inside the curly-brackets of Class.
     *      We can use already created method, within another method.
     */

    public static void main(String[] args) {
        /**
         * Method: lines of code to perform a specific task.
         *
         * Benefit: No code repetition and faster coding.
         *
         * Good Practice: method name should reflect the task method is performing.
         */

        /**
         * Information we must gather/plan before writing code to create a method.
         *  1. where are you going to use this method? (This answer helps to decide the access-modifier)
         *      in the same class ONLY where method is created? - access-modifier to use: private
         *      in the same package ONLY where method is created? - access-modifier to use: protected
         *      anywhere in the project? - access-modifier to use: public
         *  2. what is the specific task which for which you are planning to create the method?
         *      This information help us to provide a better method-name
         *  3. do we need to take any input-data from user (who is going to use the method)?
         *      If Yes, a) how many input-data we need from user?
         *              b) what are the datatypes of input-data that we need from user?
         *  4. should we return the final-result-data back to user?
         *      If Yes, what is the datatype of final-result-data (this helps to define the return-type of the method)
         *      If No, the return-type of the method will be void
         */
        /**
         * To create a method, use below template:
         *
         * <accessModifier> <static> <return-type-of-method> <method-name>(create-variables-to-store-user-input) {
         *      // code block for the method
         *      // code to complete the specific task method
         *      return statement <-- Last line in the method IF we decide to return final-result-data back to user
         * }
         *
         * <accessModifier> : defines from where we can access the method.
         *                      (mostly, we use public access-modifier)
         *
         * <static> : keyword which decide, how can we access the method?
         *          if static-keyword is present which creating the method, we call is static-method.
         *          if static-keyword is NOT present which creating the method, we call is method.
         *          * for now, we make every-method as static method,
         *              once static-topic is cover then we will decide whether to create static-method or not?
         *
         */
        System.out.println("using printHelloWorld-method");
        printHelloWorld();
        System.out.println("After using printHelloWorld-method\n\n");

        System.out.println("using addTwoIntValues-method");
        int ans1 = addTwoIntValues(8, 9);
        System.out.println("8 + 9 = "+ans1);

        int ans2 = addTwoIntValues(2, 2);
        System.out.println("2 + 2 = "+ans2);

        int ans3 = addTwoIntValues(-2, 9);
        System.out.println("-2 + 9 = "+ans3);
        System.out.println("After using addTwoIntValues-method\n\n");

        System.out.println("using toTitleCase-method");
        String titlecase1 = toTitleCase("heLLO wORlD");
        System.out.println("input1 -> heLLO wORlD");
        System.out.println("titlecase1 -> "+titlecase1);

        String input2 = "maY gOD BE wITh yOU alWAys";
        String titlecase2 = toTitleCase(input2);
        System.out.println("input2 -> "+input2);
        System.out.println("titlecase2 -> "+titlecase2);
        System.out.println("After using toTitleCase-method\n\n");

        System.out.println("using getArrayTotal-method");
        int[] inputArray1 = {1, 2, 3, 4, 5};
        int result1 = getArrayTotal(inputArray1);
        System.out.println("Given Array -> "+ Arrays.toString(inputArray1));
        System.out.println("result1 -> "+ result1);

        int[] inputArray2 = {23, 78, -37, -14, 8};
        int result2 = getArrayTotal(inputArray2);
        System.out.println("Given Array -> "+ Arrays.toString(inputArray2));
        System.out.println("result2 -> "+ result2);
        System.out.println("After using getArrayTotal-method\n\n");
    }

    /**
     * Create a method which total the number present in int-array
     */
    /**
     *  1. where are you going to use this method? (This answer helps to decide the access-modifier)
     *      anywhere in the project? - access-modifier to use: public
     *  2. what is the specific task which for which you are planning to create the method?
     *      addIntArray, totalIntArray, getArrayTotal
     *  3. do we need to take any input-data from user (who is going to use the method)? - Yes
     *      If Yes, a) how many input-data we need from user? - 1
     *              b) what are the datatypes of input-data that we need from user? - int[]
     *  4. should we return the final-result-data back to user? - Yes
     *      If Yes, what is the datatype of final-result-data (this helps to define the return-type of the method)
     *          int
     */
    public static int getArrayTotal(int[] userArray) {
        int resultValue = 0;
        for (int value : userArray) {
            resultValue += value;
        }
        return resultValue;
    }

    /**
     * Create a method to convert a String into Titlecase
     */
    /**
     *  1. where are you going to use this method? (This answer helps to decide the access-modifier)
     *      anywhere in the project? - access-modifier to use: public
     *  2. what is the specific task which for which you are planning to create the method?
     *      toTitleCase
     *  3. do we need to take any input-data from user (who is going to use the method)? - Yes
     *      If Yes, a) how many input-data we need from user? - 1
     *              b) what are the datatypes of input-data that we need from user? - String
     *  4. should we return the final-result-data back to user? - Yes
     *      If Yes, what is the datatype of final-result-data (this helps to define the return-type of the method)
     *          String
     */
    public static String toTitleCase(String userInput) {
        String result = "";
        String[] sentenceWords = userInput.split(" ");
        for (String word : sentenceWords) {
            result = result + word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        return result;
    }

    /**
     * Create a method which can add 2-int values
     */
    /**
     *  1. where are you going to use this method? (This answer helps to decide the access-modifier)
     *      anywhere in the project? - access-modifier to use: public
     *  2. what is the specific task which for which you are planning to create the method?
     *      addIntValues, addTwoIntValues
     *  3. do we need to take any input-data from user (who is going to use the method)? - Yes
     *      If Yes, a) how many input-data we need from user? - 2
     *              b) what are the datatypes of input-data that we need from user? - both values will be of int-datatype
     *  4. should we return the final-result-data back to user? - Yes
     *      If Yes, what is the datatype of final-result-data (this helps to define the return-type of the method)
     *          int
     *
     */
    public static int addTwoIntValues(int num1, int num2) {
        int result = num1 + num2;
        return result;  // return statement
    }

    /**
     * Create a method to print "Hello World"
     */
    /**
     *  1. where are you going to use this method? (This answer helps to decide the access-modifier)
     *      YES -> anywhere in the project? - access-modifier to use: public
     *  2. what is the specific task which for which you are planning to create the method?
     *      print hello world -> printHelloWorld
     *  3. do we need to take any input-data from user (who is going to use the method)? - NO
     *  4. should we return the final-result-data back to user? - NO
     *      If No, the return-type of the method will be void
     */
    public static void printHelloWorld() {
        System.out.println("Hello World");
    }


}
