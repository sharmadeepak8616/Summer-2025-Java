package Class2;

public class Datatypes_Practical {
    public static void main(String[] args) {
        /**
         *
         * Type of variable/Datatype and type of value MUST BE SAME!!
         * Syntax to create a variable:
         *      datatype varName;      <- creates a variable(name=varName) of type(datatype)
         *      varName = myData;      <- using already created variable(varName) to store value=myData
         *
         *
         *      datatype varName = myData;  <- creates a variable(name=varName) of type(datatype); and storing value=myData in it.
         *
         */

        // Create a variable to store mike's age (20)
        int mikeAge = 20;

        // Write code to print Mike's age in console
        // System.out.println("mikeAge");
        System.out.println(mikeAge);    // this way it will print the value inside the variable
        System.out.println("Mike is "+mikeAge+" years old");    // Mike is 20 years old

        // Create a variable to store world's population (1000000000000000)
        long worldPopulation = 1000000000000000L;

        // create a variable to store mortgage rate
        double mortgageRate = 3.2;

        // code
        // code
        System.out.println("Current mortgage rate is "+mortgageRate);
        // change the value in mortgageRate-variable
        mortgageRate = 5.0;
        System.out.println("Current mortgage rate is "+mortgageRate);

        float distance = 101.9f;

        char hashSymbol = '#';
        char firstNumber = '1';
        /*
            '1' : is it int or char?
            bcz 1 is within single-quotes so it's not an int, it is a char
         */

        boolean isItRaining = false;



        String mySchoolName = "SAM";
        System.out.println("My school name is "+mySchoolName);
        // My school name is SAM




    }
}
