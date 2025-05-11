package Class3;

public class JavaOperators_Arithmetic {
    public static void main(String[] args) {
        /**
         * Java Operators:
         * 2. Arithmetic (+, -, *, /, %, ++, --)
         *
         * +    ->  Addition
         * -    ->  Subtraction
         * *    ->  Multiplication
         * /    ->  Division
         * %    ->  Modulus
         * ++   ->  Increment
         * --   ->  Decrement
         *
         */

        /**
         * Rule: Datatype of values/variables involved in the calculation, defines the datatype of result-value
         * 1. if ALL values/variables are int-datatype,
         *      final result will be int-datatype (means result-value will never have decimal-point values)
         * 2. if ANY one value/variable are double-datatype,
         *      final result will be double-datatype  (means result-value will have decimal-point values)
         *
         */

        int myCarsCount = 1;
        int myBroCarsCount = 2;
        System.out.println("Total number of my cars : "+myCarsCount);
        System.out.println("Total number of my brother's cars : "+myBroCarsCount);
        int totalCarsInFamily = myCarsCount + myBroCarsCount;
        /*
            int totalCarsInFamily = myCarsCount + myBroCarsCount;
            int totalCarsInFamily = 1 + 2;
            int totalCarsInFamily = 3;
            assign 3 into totalCarsInFamily-variable
         */
        System.out.println("Total number of cars in family : "+totalCarsInFamily);

        int num1 = 5, num2 = 7;
        double num3 = 9.3, num4 = 11.7;

        int num1PlusNum2 = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + num1PlusNum2);

        double num1MinusNum3 = num1 - num3;
        System.out.println(num1 + " - " + num3 + " = " + num1MinusNum3);

        double num3MultipleNum4 = num3 * num4;
        System.out.println(num3 + " * " + num4 + " = " + num3MultipleNum4);

        double num4DivideNum1 = num4 / num1;
        System.out.println(num4 + " / " + num1 + " = " + num4DivideNum1);

        /**
         * %    ->  Modulus
         *
         * Division (without going into decimal point)
         *  16/4    ->  4 (remaining value = 0)
         *  17/4    ->  4 (remaining value = 1)
         *  7/4     ->  1 (remaining value = 3)
         *  5/9     ->  0 (remaining value = 5)
         *
         *
         * Modulus operators (returns the remaining-value after the division)
         * 16%4     ->  0
         * 17%4     ->  1
         * 7%4      ->  3
         * 5%9      ->  5
         *
         */

        /**
         * we have 53 apples, and we would like to distribute it among 3 children (without cutting apples).
         * how many apples will each children get and how many will remain to you.
         */
        int totalApples = 53, childrenCount = 3;

        int appleToEachChild = totalApples/childrenCount;
        int remainingApplesToMe = totalApples%childrenCount;

        System.out.println("\nModulus - operator");
        System.out.println("Total apples : " + totalApples);
        System.out.println("Total children : " + childrenCount);
        System.out.println("Apples to each child : " + appleToEachChild);
        System.out.println("Remaining Apples : " + remainingApplesToMe);

        /**
         * ++   ->  Increment
         *
         * Increment operator increments the current-value in the variable by 1
         */
        System.out.println("\nIncrement - operator");
        int incVar = 15;
        System.out.println("incVar = "+incVar);    // incVar = 15
        incVar++;       //  Java will increase the value of incVar by 1; incVar has currentValue=15, so this operation incVar will be 16
        System.out.println("incVar = "+incVar);    // incVar = 16
        incVar++;
        incVar++;
        System.out.println("incVar = "+incVar);    // incVar = 18

        /**
         * --   ->  Decrement
         *
         * Decrement operator decrements the current-value in the variable by 1
         */
        System.out.println("\nDecrement - operator");
        incVar--;
        incVar--;
        System.out.println("incVar = "+incVar);    // incVar = 16

        int arVar1 = 10, arVar2=20, arVar3=30;
        double arVar4=4.4, arVar5=5.5;

        double result = arVar1 + arVar2 - arVar5 * arVar3 + arVar4;
        /*
            double result = arVar1 + arVar2 - arVar5 * arVar3 + arVar4;
            double result = 10 + 20 - 5.5 * 30 + 4.4;
            double result = 10 + 20 - 165 + 4.4;
            double result = 30 - 165 + 4.4;
            double result = 30 - 160.6;
            double result = -130.6;
         */
        System.out.println("result = " + result);

    }
}
