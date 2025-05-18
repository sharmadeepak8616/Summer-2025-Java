package Class4;

public class JavaOperators_Ternary {
    public static void main(String[] args) {
        /**
         * Java Operators:
         * 6. Ternary (?:)
         *   used in a situation,
         *      when we have TWO values (not more, not less) and one of these values should be assigned to a variable;
         *      but which to be assigned to the variables that depends on result of condition(s)
         *
         * Syntax:
         * variable = condition(s) ? valueToAssignIfConditionTrue : valueToAssignIfConditionFalse
         *
         */

        /**
         * Bank says if customer credit score is 700 or more than mortgage rate will be 5% otherwise 7%
         */
        int customerCreditScore = 0;
        double customerMortgageRate = 0.0;
        // customerMortgageRate = depends on customerCreditScore >= 700; if true 5% otherwise 7%

        // C1
        customerCreditScore = 690;
        customerMortgageRate = customerCreditScore >= 700 ? 5 : 7;

        System.out.println("Customer credit score : " + customerCreditScore);
        System.out.println("Customer mortgage rate : " + customerMortgageRate + "%");

        // C2
        customerCreditScore = 700;
        customerMortgageRate = customerCreditScore >= 700 ? 5 : 7;

        System.out.println("Customer credit score : " + customerCreditScore);
        System.out.println("Customer mortgage rate : " + customerMortgageRate + "%");

        /**
         * Bank says if customer credit score is 700 or more than and age is less than 25
         *      mortgage rate will be 3% otherwise 7%
         */

        /*
            mortgageRate-value depends on conditions(creditScore>=700 AND age<25)
                if conditions result intro true, mortgageRate = 3
                otherwise, mortgageRate = 7
         */
        int customerAge = 0;

        // C3
        customerCreditScore = 710;
        customerAge = 25;

        customerMortgageRate = customerCreditScore >=700 && customerAge<25 ? 3 : 7;
        System.out.println("\nCustomer age : " + customerAge);
        System.out.println("Customer credit score : " + customerCreditScore);
        System.out.println("Customer mortgage rate : " + customerMortgageRate + "%");

        // C4
        customerCreditScore = 744;
        customerAge = 22;

        customerMortgageRate = customerCreditScore >=700 && customerAge<25 ? 3 : 7;
        System.out.println("\nCustomer age : " + customerAge);
        System.out.println("Customer credit score : " + customerCreditScore);
        System.out.println("Customer mortgage rate : " + customerMortgageRate + "%");

























    }
}
