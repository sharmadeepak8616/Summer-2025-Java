package Class4;

public class String_Concept_1 {
    public static void main(String[] args) {

        /**
         * String
         *      is a user-defined class
         *      is a non-primitive datatype
         *      value MUST BE within double-quotes
         *      can store one or more characters
         */

        /**
         * Methods:
         *      length()
         */

        String str1 = "Hello";
        String str2 = "GoOd evEnINg";

        System.out.println(str1);
        System.out.println(str2);

        /**
         * Index: position of every character in the string
         *        index-value starts from 0
         *
         * -> 1st-character of every string gets stored at index-0
         * -> 2nd-character of every string gets stored at index-1
         * -> 3rd-character of every string gets stored at index-2
         *  and so on...
         */

        /**
         * Length of a String (number of characters in a String):
         *      can be measured by number of memory locations getting used to store all characters of the string.
         */
        /*
            Hello
            length = 5
            last index = 4

            GoOd evEnINg
            length = 12
            last index = 11
         */

        /**
         * Relation between length and last-index
         *
         * lastIndex = length - 1
         *
         */

        String exampleString = "Read full articles, watch videos, browse thousands of titles and more on the Home page topic with Google News.";

        /**
         * To find the length of a String (or number of characters in a String)
         * method: length()
         * return-type: int
         */
        int exampleStringLength = exampleString.length();
        System.out.println("\nmethod length()");
        System.out.println("String -> "+exampleString);
        System.out.println("length -> "+exampleStringLength);
        System.out.println("last-index number -> "+(exampleStringLength-1));


    }
}
