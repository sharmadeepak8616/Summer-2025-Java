package Class3;

public class JavaOperators_Comparison {
    public static void main(String[] args) {
        /**
         * Java Operators:
         * 3. Comparison (>, <, >=, <=, ==, !=)
         *
         * >    :   is Greater than
         * <    :   is Less than
         * >=   :   is Greater than or equals to
         * <=   :   is Less than or equals to
         * ==   :   is Equals to
         * !=   :   is NOT equals to
         *
         * is 5 greater than 7? -   false (boolean)
         *
         * Result od every comparison operations is always going to be a boolean-value
         *
         */

        int num1 = 30, num2 = 50;
        String name1= "Tom", name2 = "jerry";
        boolean b1 = true, b2 = false;

        boolean num1GrNum2 = num1 > num2;
        System.out.println("is "+num1+" > "+num2+"? : "+num1GrNum2);        // false

        boolean num1LeNum2 = num1 < num2;
        System.out.println("is "+num1+" < "+num2+"? : "+num1LeNum2);        // true

        boolean num1GrEqNum2 = num1 >= num2;
        System.out.println("is "+num1+" >= "+num2+"? : "+num1GrEqNum2);     // false

        boolean num1LeEqNum2 = num1 <= num2;
        System.out.println("is "+num1+" <= "+num2+"? : "+num1LeEqNum2);     // true

        boolean num1EqNum2 = num1 == num2;
        System.out.println("is "+num1+" == "+num2+"? : "+num1EqNum2);       // false

        boolean num1NtEqNum2 = num1 != num2;
        System.out.println("is "+num1+" != "+num2+"? : "+num1NtEqNum2);     // true

        boolean name1EqName2 = name1 == name2;
        System.out.println("is "+name1+" == "+name2+"? : "+name1EqName2);     // false












    }
}
