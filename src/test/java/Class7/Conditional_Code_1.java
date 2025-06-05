package Class7;

public class Conditional_Code_1 {
    public static void main(String[] args) {
        /**
         * Conditional Code (Conditional block, Conditional loops):
         * 1. if-else block
         * 2. switch block
         */

        /**
         * if-else block
         *      if-block (if you are free, we can catch up)
         *      if-else block (if you are free, we can catch up; else let me know suitable time)
         *      if-else if-else block (if you are free today, we can catch up;
         *                              else if you are free on any other day in this week, call me to plan our meet-up;
         *                              else let me know suitable time)
         */

        /**
         * if-block:
         *
         * if(condition(s)) {
         *      // if-block
         *      // code written in the if-block is going to execute when if-condition(s) result into true
         * }
         *
         * Java checks the given if-condition(s)
         *  if condition(s) result into true -> Java enters in the if-block, executes the code written in it and move ahead in the code file.
         *  if condition(s) result into false -> Java does NOT enter in the if-block and move ahead in the code file..
         *
         */
        System.out.println("\nif-block");
        int num = 10;
        if (num > 20) {
            System.out.println("Num is greater than 0");
        }
        System.out.println("Outside first if-block");

        String countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        System.out.println("countryName -> " + countryName);
        // print the country name in UPPERCASE,
        // if countryName starts with "n"
        if (countryName.startsWith("n")) {
            System.out.println(countryName.toUpperCase());
        }
        System.out.println("Outside second if-block");

        /**
         * if-else block:
         *
         * if(condition(s)) {
         *      // if-block
         *      // code written in the if-block is going to execute when if-condition(s) result into true
         * } else {
         *      // else-block
         *      // code written in the block i going ot execute when if-condition(s) result into false
         * }
         *
         * Java checks the given if-condition(s)
         *  if condition(s) result into true -> Java enters in the if-block,
         *                                      executes the code written in it and move ahead in the code file ignoring else-block.
         *  if condition(s) result into false -> Java enters in the else-block automatically
         *                                      executes the code written in it and move ahead in the code file.
         *
         */
        System.out.println("\nif-else block");
        num = 10;
        if (num > 0) {
            System.out.println("Num is greater than 0");
        } else {
            System.out.println("Num is NOT greater than 0");
        }
        System.out.println("Outside first if-else block");

        /**
         * if-else if-else block:
         *
         * if(condition(s)) {
         *      // if-block
         *      // code written in the if-block is going to execute when if-condition(s) result into true
         * } else if (condition(s)) {
         *      // else-if block
         *      // code written in the block is going to execute when else-if-condition(s) result into true
         * } else if (condition(s)) {
         *      // else-if block
         *      // code written in the block is going to execute when else-if-condition(s) result into true
         * } else if (condition(s)) {
         *      // else-if block
         *      // code written in the block is going to execute when else-if-condition(s) result into true
         * } else {
         *      // else-block
         *      // code written in the block is going ot execute when ALL above condition(s) result into false
         * }
         *
         * Java checks the given if-condition(s)
         *  if condition(s) result into true -> Java enters in the if-block,
         *                                      executes the code written in it and move ahead in the code file ignoring below else-if and else-block.
         *  if condition(s) result into false -> Java check the next else-if condition(s)
         *  if condition(s) result into true -> Java enters in the else-if-block,
         *                                      executes the code written in it and move ahead in the code file ignoring below else-if and else-block.
         *  if condition(s) result into false -> Java check the next else-if condition(s)
         *  if condition(s) result into true -> Java enters in the else-if-block,
         *                                      executes the code written in it and move ahead in the code file ignoring below else-if and else-block.
         *  if condition(s) result into false -> Java check the next else-if condition(s)
         *  and so on...
         *  when ALL condition(s) result into false -> Java enters in the else-block automatically
         *                                       executes the code written in it and move ahead in the code file.
         */

        System.out.println("\nif-else if-else block");
        num = 8;
        if (num > 20) {
            System.out.println("Num is greater than 20");
        } else if (num > 15) {
            System.out.println("Num is greater than 15");
        } else if (num > 10) {
            System.out.println("Num is greater than 10");
        } else if (num > 5) {
            System.out.println("Num is greater than 5");
        } else if (num > 0) {
            System.out.println("Num is greater than 0");
        } else {
            System.out.println("Num is 0 or less");
        }
        System.out.println("Outside first if-else if-else block");

        /**
         * Print the study plan based on day
         * if entered-day is Sunday or Wednesday -> Print "Join the class"
         * if entered-day is Thursday or Monday -> Print "Revise class topics and do homework"
         * if entered-day is Friday or Tuesday -> Print "Submit homework"
         * if entered-day is Saturday -> Print "Take a rest"
         * if entered-day is incorrect -> Print "Please enter correct day-name"
         */
        System.out.println("\nPrint the study plan based on day");
        System.out.println("using - if-else block");
        String day = "fRiDay";
        if (day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Wednesday")) {
            System.out.println("Join the class");
        } else if (day.equalsIgnoreCase("Thursday") || day.equalsIgnoreCase("Monday")) {
            System.out.println("Revise class topics and do homework");
        } else if (day.equalsIgnoreCase("Friday") || day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Submit homework");
        } else if (day.equalsIgnoreCase("Saturday")) {
            System.out.println("Take a rest");
        } else {
            System.out.println("Please enter correct day-name");
        }

        /**
         * switch block:
         *
         * If all below conditions are true in your scenario, then you can use switch-block as well.
         *  1. all conditions are related to ONLY one variable.
         *  2. all conditions are checking equals or equalsIgnoreCase
         *  3. every scenario is either has ONLY one condition, or if multiple conditions then combined with OR-operator
         */
        /**
         * switch-code block:
         *
         * switch(variable) {
         *      case value1:
         *          // case block
         *          // if variable-value is equals to value1, Java enters in this case vlock
         *          // executes the code written in it
         *          // and ignores ALL other case blocks
         *          break;  // defines the end of case block
         *      case value2:
         *          // case block
         *          // if variable-value is equals to value2, Java enters in this case vlock
         *          // executes the code written in it
         *          // and ignores ALL other case blocks
         *          break;  // defines the end of case block
         *      case value3:
         *          // case block
         *          // if variable-value is equals to value3, Java enters in this case vlock
         *          // executes the code written in it
         *          // and ignores ALL other case blocks
         *          break;  // defines the end of case block
         *      default:
         *          // default block
         *          // if variable-value is NOT equals to any above case-values, java enters in the default-block
         *          // executes the code written in it
         * }
         *
         *
         *
         *
         */
        System.out.println("using - switch block");
        switch (day.toLowerCase()) {
            case "sunday":
            case "wednesday":
                System.out.println("Join the class");
                break;
            case "monday":
            case "thursday":
                System.out.println("Revise class topics and do homework");
                break;
            case "tuesday":
            case "friday":
                System.out.println("Submit homework");
                break;
            case "saturday":
                System.out.println("Take a rest");
                break;
            default:
                System.out.println("Please enter correct day-name");
        }

        /**
         * Based on username, perform action and print the message
         *
         * if username equals to "Happy" (ignoring cases)
         *      print, "Good username"
         * if username equals to "John" (ignoring cases)
         *      print the username in lowercase format
         * if username is equals to "Queen" (ignoring cases)
         *      Print the username in UPPERCASE, it's length as well
         * if username is none of the above
         *      Print "You have a unique username"
         *
         */
        System.out.println("\nBased on username, perform action and print the message");
        String username = "haPpY";
        System.out.println("username -> "+username);
        System.out.println("using - if-else block");
        if(username.equalsIgnoreCase("Happy")) {
            System.out.println("Good username");
        } else if (username.equalsIgnoreCase("John")) {
            System.out.println("Username in lowercase format -> "+username.toLowerCase());
        } else if (username.equalsIgnoreCase("Queen")) {
            System.out.println("Username in uppercase format -> "+username.toUpperCase());
            System.out.println("Username length -> "+username.length());
        } else {
            System.out.println("You have a unique username");
        }

        /**
         * If all below conditions are true in your scenario, then you can use switch-block as well.
         *  1. all conditions are related to ONLY one variable. ->  Yes
         *  2. all conditions are checking equals or equalsIgnoreCase -> Yes
         *  3. every scenario is either has ONLY one condition, or if multiple conditions then combined with OR-operator -> Yes
         */
        System.out.println("using - switch block");
        switch (username.toLowerCase()) {
            case "happy":
                System.out.println("Good username");
                break;
            case "john":
                System.out.println("Username in lowercase format -> "+username.toLowerCase());
                break;
            case "queen":
                System.out.println("Username in uppercase format -> "+username.toUpperCase());
                System.out.println("Username length -> "+username.length());
            default:
                System.out.println("You have a unique username");
        }
    }
}
