package Class6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_Concept_3 {
    public static void main(String[] args) {

        /**
         * Methods in Class4/String_Concept_1.java:
         *      length()
         *
         * Methods in Class5/String_Concept_2.java:
         *      toLowerCase()
         *      toUpperCase()
         *      startsWith()
         *      endsWith()
         *      contains()
         *      equals()
         *      equalsIgnoreCase()
         *      charAt()
         *      indexOf()
         *      lastIndexOf()
         *      trim()
         *
         * Methods:
         *      substring()
         *      split()
         */

        String countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        System.out.println("countryName -> " + countryName);

        /**
         * To extract a portion from a String using index-numbers
         * method: substring()
         * input: startIndex, endIndex(optional)
         * return-type: String
         *
         * if input is startIndex and endIndex, and both are valid
         *      method returns the String starting from startIndex upto endIndex (excluding endIndex)
         *          OR
         *      method returns the String starting from startIndex upto endIndex-1
         * otherwise
         *      method throws Exception (StringIndexOutOfBoundsException)
         *
         * if input is startIndex, and it's valid
         *      method returns the String starting from startIndex upto end of the string
         * otherwise
         *      method throws Exception (StringIndexOutOfBoundsException)
         *
         *
         * countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         * extract starting from index-5 to index-7(excluding index-7) -> index5,6 -> "D "
         *
         * extract starting from index-5 -> "D KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *
         * using substring()-method, extract the first character of the string.
         *      what index-numbers should I use in the method?
         *
         * extract starting from index-0 to index-1(excluding index-1) -> index0 -> "U"
         *
         */
        System.out.println("\nmethod - substring()");

        String countryNameIndex5To8 = countryName.substring(5,8); // 5,6,7
        System.out.println("countryName from index-5 to index-8(excluding index-8) -> " + countryNameIndex5To8);

        String countryNameIndex5 = countryName.substring(5); // 5,6,7,8,9.....,lastIndex
        System.out.println("countryName from index-5 -> " + countryNameIndex5);

        String countryNameIndex0To1 = countryName.substring(0,1); // 0
        System.out.println("countryName from index-0 to index-1(excluding index-1) -> " + countryNameIndex0To1);

        /**
         * Find the char present at lastIndex in the countryName-String
         *
         * countryName = Finland (0,1,2,3,4,5,6)
         * starting from index-6(lastIndex) -> "d"
         *
         * countryName = Japan (0,1,2,3,4)
         * starting from index-4(lastIndex) -> "n"
         *
         * countryName = Australia (0,1,2,3,4,5,6,7,8)
         * starting from index-8(lastIndex) -> "a"
         *
         * length
         * length-1 (lastIndex)
         * use it in the substring
         */
        System.out.println("\nFind the char present at lastIndex in the countryName-String");
        countryName = "South Korea";
        System.out.println("countryName -> "+countryName);
        int countryNameLength = countryName.length();
        int countryNameLastIndex = countryNameLength - 1;
        String lastCharacter = countryName.substring(countryNameLastIndex);
        System.out.println("Using substring()-method: Last character in the countryName -> "+lastCharacter);

        /**
         * Another solution using charAt()-method
         *
         * give me the character present at lastIndex in the countryName
         * result datatype: char
         */
        char lastChar = countryName.charAt(countryNameLastIndex);
        System.out.println("Using char()-method: Last character in the countryName -> "+lastChar);

        countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        System.out.println("countryName -> " + countryName);

        /**
         * To cut/divide a String from a specific pattern into multiple String
         * method: split()
         * input: String (pattern at which we want to make a cut)
         * return-type: String[]
         *
         * if the given pattern is EXACTLY present in the String
         *      method cuts the String wherever the EXACT pattern is present, and
         *          returns the multiple String values into a String-Array
         * otherwise
         *      method returns a String-Array with entire String present at index-0
         *
         * Examples:
         *      "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *      split -> "R"
         *      ["UNiTeD KInGDom OF G" , "eAt B" , "iTaIn And NorTHerN irElaND"]
         *
         *      "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *      split -> "Xe"
         *      ["UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"]
         *
         *      "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *      split -> "In"
         *      ["UNiTeD K" , "GDom OF GReAt BRiTa" , " And NorTHerN irElaND"]
         *
         *      "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *      split -> " "    (this will cute the string into words)
         *      ["UNiTeD" , "KInGDom" , "OF" , "GReAt" , "BRiTaIn" , "And" , "NorTHerN" , "irElaND"]
         *
         *      "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *      split -> ""
         *      ["U", "N", "i", "T", "e", "D", " ", "K", "I", "n", "G", "D", "o", "m", " ", "O", "F", " ", "G", "R",.....]
         *
         */
        System.out.println("\nmethod - split()");

        String[] splitBy_R = countryName.split("R");
        int splitBy_R_Length = splitBy_R.length;
        System.out.println("Length of splitBy_R -> " + splitBy_R_Length);
        System.out.println("splitBy_R -> " + Arrays.toString(splitBy_R));

        String[] splitBy_Xe = countryName.split("Xe");
        int splitBy_Xe_Length = splitBy_Xe.length;
        System.out.println("Length of splitBy_Xe -> " + splitBy_Xe_Length);
        System.out.println("splitBy_Xe -> " + Arrays.toString(splitBy_Xe));

        String[] splitBy_In = countryName.split("In");
        int splitBy_In_Length = splitBy_In.length;
        System.out.println("Length of splitBy_In -> " + splitBy_In_Length);
        System.out.println("splitBy_In -> " + Arrays.toString(splitBy_In));

        String[] splitBy_Space = countryName.split(" ");
        int splitBy_Space_Length = splitBy_Space.length;
        System.out.println("Length of splitBy_Space -> " + splitBy_Space_Length);
        System.out.println("splitBy_Space -> " + Arrays.toString(splitBy_Space));

        String[] splitBy_Nothing = countryName.split("");
        int splitBy_Nothing_Length = splitBy_Nothing.length;
        System.out.println("Length of splitBy_Nothing -> " + splitBy_Nothing_Length);
        System.out.println("splitBy_Nothing -> " + Arrays.toString(splitBy_Nothing));

        /**
         * Find the number of words in the given sentence
         */
        String sentence = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        /*
            "Good morning"
            split by " " -> ["Good" , "morning"]
            calculate length of the array -> 2

            "How are you doing"
            split by " " -> ["How", "are", "you", "doing"]
            calculate length of the array -> 4
         */
        System.out.println("\nFind the number of words in the given sentence");
        System.out.println("sentence -> " + sentence);
        String[] words = sentence.split(" ");
        int numberOfWords = words.length;
        System.out.println("Number of words in the sentence -> " + numberOfWords);









    }
}
