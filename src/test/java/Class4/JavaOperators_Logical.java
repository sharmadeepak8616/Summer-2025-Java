package Class4;

public class JavaOperators_Logical {
    public static void main(String[] args) {
        /**
         * Java Operators:
         * 4. Logical (&&, ||, !)
         *
         * we use Logical operators to join two or more conditions/comparisons
         *
         * && (and-operator)
         *  if left-and-right sides of comparison results to true, &&-operator results into true
         *  if any one of comparisons results to false, &&-operator results into false
         *
         * || (or-operator)
         *  if any side of comparisons results to true, ||-operator results into true
         *  if left-and-right sides of comparison results to false, ||-operator results into false
         *
         * ! (not-operator)
         *  makes true into false and vice-versa
         *
         */

        /**
         * Bank says if customer is above 18 years of age or lives in New York state
         *      then we give lower mortgage-rate
         *
         *
         * C1
         *      age = 20
         *      lives in = new jersey
         *      should we give lower mortgage-rate -> customer does not satisfy BOTH conditions, so, YES
         *
         * C2
         *      age = 17
         *      lives in = PA
         *      should we give lower mortgage-rate -> customer does not satisfy ANY conditions, so, NO
         *
         * C3
         *      age = 27
         *      lives in = NY
         *      should we give lower mortgage-rate -> customer does satisfy BOTH conditions, so, YES
         */

        int customerAge = 18;
        String customerState = "";
        boolean shouldGiveLowerRates = false;

        // C1
        customerAge = 20;
        customerState = "NJ";
        shouldGiveLowerRates = customerAge > 18 || customerState == "NY";
        System.out.println("\nCustomer Data:\nAge: "+customerAge+"\nState: "+customerState+"\nshould provide lower mortgage rate: "+shouldGiveLowerRates);

        shouldGiveLowerRates = customerAge > 18 && customerState == "NY";
        System.out.println("\nCustomer Data:\nAge: "+customerAge+"\nState: "+customerState+"\nshould provide lower mortgage rate: "+shouldGiveLowerRates);

        boolean result = 10 > 30;
        System.out.println("\n\n10 > 30 -> " + result);

        result = !(10 > 30);
        /*
            !(10 > 30)
            !(false)
            true
         */
        System.out.println("\n!(10 > 30) -> " + result);





    }
}
