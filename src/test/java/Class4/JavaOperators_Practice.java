package Class4;

public class JavaOperators_Practice {
    public static void main(String[] args) {

        /**
         * Create a variable to store customer bank balance
         * Based on customer bank balance amount, Bank puts customer into different category (Basic, Premium)
         *
         * if customer bank balance is greater than 25000, Customer is Premium customer
         * otherwise, Customer is Basic customer
         */

        double customerBankBalance = 0.0;
        String customerCategory = "";

        /*
            for any customer, customerCategory will either be Basic or Premium
            out of Basic or Premium, depends on condition

            customerBankBalance > 25000 , category will be Premium
            otherwise, category will be Basic
         */

        // C1
        customerBankBalance = 24098.87;
        customerCategory = customerBankBalance > 25000 ? "Premium" : "Basic";
        System.out.println("Customer bank balance: $"+customerBankBalance);
        System.out.println("Customer category: "+customerCategory);

        // C2
        customerBankBalance = 27000.0;
        customerCategory = customerBankBalance > 25000 ? "Premium" : "Basic";
        System.out.println("\nCustomer bank balance: $"+customerBankBalance);
        System.out.println("Customer category: "+customerCategory);

        // C3
        customerBankBalance = 25000.0;
        customerCategory = customerBankBalance > 25000 ? "Premium" : "Basic";
        System.out.println("\nCustomer bank balance: $"+customerBankBalance);
        System.out.println("Customer category: "+customerCategory);


    }
}
