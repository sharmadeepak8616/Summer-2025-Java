package Class13;

public class Variables {
    /**
     * Type of variables (based on where the variable is created):
     *  1. Class Variables(Global Variables, Field Variables)
     *          any variable which is defined/created outside ALL methods but inside the class
     *          all field variables can be used in ALL the methods (written in the class)
     *  2. Method Variables (or just Variables)
     *          any variable which is defined/created inside a method
     *          a method-variable can be used ONLY in the method in which the variable is created
     *
     */

    static String username = "King";       // field-variable

    public static void main(String[] args) {
        int num=12;                 // method-variable
        String name = "John";       // method-variable
        /*
            name-variable created in main-method, therefore the scope of this variable is main-method.
            Or, the scope of name-variable is main-method.
            name-variable does NOT exist outside the main-method.
         */
        System.out.println("name = "+name);
        System.out.println("username = "+username);
        sayHelloUser();
    }

    public static void sayHelloUser() {
        double userHeight = 6.6;
        System.out.println("Hello User");
        System.out.println("Name of the user is -> "+username);
        System.out.println("User height -> "+userHeight);
    }


}
