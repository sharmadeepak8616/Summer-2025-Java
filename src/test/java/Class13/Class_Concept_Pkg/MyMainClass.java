package Class13.Class_Concept_Pkg;

import java.util.Arrays;

public class MyMainClass {
    /**
     * if we want to use a method which is present in another class
     * 1. check if the method (which you want to use) is static or not
     * 2. if static
     *      use ClassName (in which method is present) to access the method.
     *      like: ClassName.methodName()
     *    if NOT static
     *      use classObject (of Class in which method is present) to access the method.
     *      like: classObjectName.methodName()
     */
    /**
     * How to create a Class-object
     *      ClassName classObjectName = new ClassName();
     */
    public static void main(String[] args) {
        // use printHelloWorld()-method from MyMiscMethods-Class
        System.out.println("use printHelloWorld()-method from MyMiscMethods-Class");
        MyMiscMethods.printHelloWorld();

        // find the total of an int-array
        System.out.println("\nfind the total of an int-array");
        int[] numbers = {45, 23, 76, 90, 34, 65, 11};
        int arrayTotal = MyArrayMethods.getArrayTotal(numbers);
        System.out.println("Total of '"+Arrays.toString(numbers)+"' is "+arrayTotal);

        // add two double-values
        System.out.println("\nfind the total of two double-values");
        double value1 = 3.4 , value2 = 7.9;
        MyMathMethods myMathObject = new MyMathMethods();
        double total = myMathObject.addTwoDoubleValues(value1, value2);
        System.out.println(value1+" + "+value2+" = "+total);

    }
}
