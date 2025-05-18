package Class4;

public class JavaOperators_AdvancedAssignment {
    public static void main(String[] args) {
        /**
         * 5. Advanced Assignment (+=, -=, *=, /=, %=)
         *
         */
        /**
         * int a = 5;
         *
         * Add 7 in value of variable-a, and store the final result into variable-a
         *
         * a+=7     <-->    a = a + 7
         * a = 5 + 7
         * a = 12
         *
         * a = 10000
         * Deposit 7000 in bank balance,
         * a+=7000      <-->    a = a + 7000
         * a = 10000 + 7000
         * a = 17000
         *
         */

        int num1 = 10;
        double num2 = 20.2;
        double num3 = 0.0;

        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
        System.out.println("num3 = "+num3);

        // num1+=3;
        num1+=3;    // num1 = num1 + 3
        System.out.println("after num1+=3, num1 = "+num1);     // 13

        num1-=4;    // num1 = num1 - 4
        System.out.println("after num1-=4, num1 = "+num1);     // 9

        num1*=4;    // num1 = num1 * 4
        System.out.println("after num1*=4, num1 = "+num1);     // 36

        num1/=5;    // num1 = num1 / 5
        System.out.println("after num1/=5, num1 = "+num1);     // 7

        num1%=4;    // num1 = num1 % 4
        System.out.println("after num1%=4, num1 = "+num1);     // 3


    }
}
