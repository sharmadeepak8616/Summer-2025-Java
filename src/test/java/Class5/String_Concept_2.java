package Class5;

public class String_Concept_2 {
    public static void main(String[] args) {

        /**
         * Methods in Class4/String_Concept_1.java:
         *      length()
         *
         * Methods:
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
         */

        String countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        System.out.println("countryName -> " + countryName);

        /**
         * To convert string-value into lowercase
         * method: toLowerCase()
         *
         * This method:
         *      creates a copy of the original-string-value
         *      converts the copied-string-value into lowercase
         *      returns the lowercased-string-value
         *
         * toLowerCase()-method does NOT change the original-string-value
         *
         */
        System.out.println("\nmethod - toLowerCase()");
        String countryNameLowercase = countryName.toLowerCase();
        System.out.println("countryName -> " + countryName);
        System.out.println("countryNameLowercase -> " + countryNameLowercase);

        /**
         * To convert string-value into UPPERCASE
         * method: toUpperCase()
         *
         * This method:
         *      creates a copy of the original-string-value
         *      converts the copied-string-value into UPPERCASE
         *      returns the UPPERCASED-string-value
         *
         * toUpperCase()-method does NOT change the original-string-value
         *
         */
        System.out.println("\nmethod - toUpperCase()");
        String countryNameUppercase = countryName.toUpperCase();
        System.out.println("countryName -> " + countryName);
        System.out.println("countryNameUppercase -> " + countryNameUppercase);

        /**
         * To check if string-value starts EXACTLY with the given pattern
         * method: startsWith()
         * input: String
         * return-type: boolean
         *
         * if the string-value EXACTLY starts with the given pattern
         *      method returns true
         * otherwise
         *      method returns false
         *
         * countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *
         * does countryName start with "u"?         ->      false
         * does countryName start with "Uni"?       ->      false
         * does countryName start with "UN"?        ->      true
         * does countryName start with "TeD"?       ->      false
         */
        System.out.println("\nmethod - startsWith()");
        System.out.println("countryName -> " + countryName);
        boolean isStartsWith_u = countryName.startsWith("u");
        System.out.println("does countryName start with \"u\"? -> "+isStartsWith_u);

        boolean isStartsWith_Uni = countryName.startsWith("Uni");
        System.out.println("does countryName start with \"Uni\"? -> "+isStartsWith_Uni);

        boolean isStartsWith_UN = countryName.startsWith("UN");
        System.out.println("does countryName start with \"UN\"? -> "+isStartsWith_UN);

        boolean isStartsWith_TeD = countryName.startsWith("TeD");
        System.out.println("does countryName start with \"TeD\"? -> "+isStartsWith_TeD);

        /**
         * To check if string-value ends EXACTLY with the given pattern
         * method: endsWith()
         * input: String
         * return-type: boolean
         *
         * if the string-value EXACTLY ends with the given pattern
         *      method returns true
         * otherwise
         *      method returns false
         *
         * countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *
         * does countryName end with "u"?               ->      false
         * does countryName end with "and"?             ->      false
         * does countryName end with "N irElaND"?       ->      true
         * does countryName end with "NorTH"?           ->      false
         */
        System.out.println("\nmethod - endsWith()");
        System.out.println("countryName -> " + countryName);
        boolean isEndsWith_u = countryName.endsWith("u");
        System.out.println("does countryName end with \"u\"? -> "+isEndsWith_u);

        boolean isStartsWith_and = countryName.endsWith("and");
        System.out.println("does countryName end with \"and\"? -> "+isStartsWith_and);

        boolean isStartsWith_N_irElaND = countryName.endsWith("N irElaND");
        System.out.println("does countryName end with \"N irElaND\"? -> "+isStartsWith_N_irElaND);

        boolean isStartsWith_NorTH = countryName.endsWith("NorTH");
        System.out.println("does countryName end with \"NorTH\"? -> "+isStartsWith_NorTH);

        /**
         * To check if string-value contains EXACTLY the given pattern
         * method: contains()
         * input: String
         * return-type: boolean
         *
         * if the string-value EXACTLY contains with the given pattern
         *      method returns true
         * otherwise
         *      method returns false
         *
         * countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *
         * does countryName contain "u"?               ->      false
         * does countryName contain "and"?             ->      false
         * does countryName contain "N irElaND"?       ->      true
         * does countryName contain "NorTH"?           ->      true
         */
        System.out.println("\nmethod - contains()");
        System.out.println("countryName -> " + countryName);
        boolean isContain_u = countryName.contains("u");
        System.out.println("does countryName contain \"u\"? -> "+isContain_u);

        boolean isContain_and = countryName.contains("and");
        System.out.println("does countryName contain \"and\"? -> "+isContain_and);

        boolean isContain_N_irElaND = countryName.contains("N irElaND");
        System.out.println("does countryName contain \"N irElaND\"? -> "+isContain_N_irElaND);

        boolean isContain_NorTH = countryName.contains("NorTH");
        System.out.println("does countryName contain \"NorTH\"? -> "+isContain_NorTH);

        /**
         * countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         *
         * Question: check if the countryName-string-value starts with "uN" (ignore cases)
         * United states
         * UNITES STATES
         * UniTED Kingdom
         * united kingdom
         */
        System.out.println("\nQuestion: check if the countryName-string-value starts with \"uN\" (ignore cases)");
        String pattern = "uN";
        System.out.println("countryName -> " + countryName);    // countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
        System.out.println("pattern -> " + pattern);
        /*
            "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"

            "united kingdom of great britain and northern ireland"
            "uN" -> "un"

            "united kingdom of great britain and northern ireland"
            apply startsWith("un") -> true

            1. convert countryName into lowercase
            2. convert pattern into lowercase
            3. apply startsWith() on lowercased-string-values

         */

        String countryName_Lowercase = countryName.toLowerCase();
        String pattern_Lowercase = pattern.toLowerCase();
        boolean isCountryNameStartWith_uN = countryName_Lowercase.startsWith(pattern_Lowercase);
        System.out.println("is CountryName starts with \""+pattern+"\" (ignoring cases) -> " + isCountryNameStartWith_uN);

        /**
         * To find if two string-values are IDENTICAL
         * method: equals()
         * return-type: boolean
         *
         * if the given two strings are IDENTICAL
         *      method returns true
         * otherwise
         *      method returns false
         *
         *
         * "Hello" equals "Hello"   ->  true
         * "Hello" equals "Hi"      ->  false
         * "Hello" equals "HelLo"   ->  false
         *
         */
        System.out.println("\nmethod - equals()");
        String countryName1 = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        String countryName2 = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        String countryName3 = "UNiTeD KInGDom OF GReAt BRiTaIn";
        String countryName4 = "UNiTeD Kingdom OF GReAt BRiTaIn And NorTHerN irElaND";
        String countryName5 = "UNiTeD States of America";

        System.out.println("countryName1 -> " + countryName1);
        System.out.println("countryName2 -> " + countryName2);
        System.out.println("countryName3 -> " + countryName3);
        System.out.println("countryName4 -> " + countryName4);
        System.out.println("countryName5 -> " + countryName5);

        boolean isCountryName1Equals_countryName2 = countryName1.equals(countryName2);      // true
        System.out.println("is countryName1 equal countryName2 -> " + isCountryName1Equals_countryName2);

        boolean isCountryName1Equals_countryName3 = countryName1.equals(countryName3);      // false
        System.out.println("is countryName1 equal countryName3 -> " + isCountryName1Equals_countryName3);

        boolean isCountryName1Equals_countryName4 = countryName1.equals(countryName4);      // false
        System.out.println("is countryName1 equal countryName4 -> " + isCountryName1Equals_countryName4);

        boolean isCountryName1Equals_countryName5 = countryName1.equals(countryName5);      // false
        System.out.println("is countryName1 equal countryName5 -> " + isCountryName1Equals_countryName5);

        /**
         * To find if two string-values are having same value(ignoring cases) and same length
         * method: equalsIgnoreCase()
         * return-type: boolean
         *
         * if the given two strings are have same value(ignoring cases) and having same length
         *      method returns true
         * otherwise
         *      method returns false
         *
         *
         * "Hello" equalsIgnoreCase "Hello"   ->  true
         * "Hello" equalsIgnoreCase "Hi"      ->  false
         * "Hello" equalsIgnoreCase "HelLo"   ->  true
         *
         */
        System.out.println("\nmethod - equalsIgnoreCase()");
        countryName1 = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        countryName2 = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        countryName3 = "UNiTeD KInGDom OF GReAt BRiTaIn";
        countryName4 = "UNiTeD Kingdom OF GReAt BRiTaIn And NorTHerN irElaND";
        countryName5 = "UNiTeD States of America";

        System.out.println("countryName1 -> " + countryName1);
        System.out.println("countryName2 -> " + countryName2);
        System.out.println("countryName3 -> " + countryName3);
        System.out.println("countryName4 -> " + countryName4);
        System.out.println("countryName5 -> " + countryName5);

        boolean isCountryName1EqualsIgnoreCase_countryName2 = countryName1.equalsIgnoreCase(countryName2);      // true
        System.out.println("is countryName1 equalsIgnoreCase countryName2 -> " + isCountryName1EqualsIgnoreCase_countryName2);

        boolean isCountryName1EqualsIgnoreCase_countryName3 = countryName1.equalsIgnoreCase(countryName3);      // false
        System.out.println("is countryName1 equalsIgnoreCase countryName3 -> " + isCountryName1EqualsIgnoreCase_countryName3);

        boolean isCountryName1EqualsIgnoreCase_countryName4 = countryName1.equalsIgnoreCase(countryName4);      // true
        System.out.println("is countryName1 equalsIgnoreCase countryName4 -> " + isCountryName1EqualsIgnoreCase_countryName4);

        boolean isCountryName1EqualsIgnoreCase_countryName5 = countryName1.equalsIgnoreCase(countryName5);      // false
        System.out.println("is countryName1 equalsIgnoreCase countryName5 -> " + isCountryName1EqualsIgnoreCase_countryName5);

        /**
         * To get the character present at any given index in the string
         * method: charAt()
         * input: int (indexNumber)
         * return-type: char
         *
         * if the given index is valid (0 to lastIndexNumber)
         *      method returns the character present at the given index
         * otherwise
         *      method throws Exception (StringIndexOutOfBoundsException)
         *
         * countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         * which char is present at index-1 in countryName-string -> 'N'
         * which char is present at index-4 in countryName-string -> 'e'
         * which char is present at index-400 in countryName-string -> Java crashes the code execution right away (Exception -> StringIndexOutOfBoundsException)
         */
        System.out.println("\nmethod - charAt()");
        System.out.println("countryName -> " + countryName);

        char charAt1 = countryName.charAt(1);
        System.out.println("character present at index-1 in countryName -> " + charAt1);

        char charAt4 = countryName.charAt(4);
        System.out.println("character present at index-4 in countryName -> " + charAt4);

//        char charAt_1 = countryName.charAt(-1);
//        System.out.println("character present at index-(-1) in countryName -> " + charAt_1);
//
//        char charAt400 = countryName.charAt(400);
//        System.out.println("character present at index-400 in countryName -> " + charAt400);

        /**
         * To find the index at which the FIRST OCCURRENCE of a given pattern EXACTLY starts in the string
         * method: indexOf()
         * input: String
         * return-type: int
         *
         * if the given pattern is EXACTLY present in the string
         *      method returns the index from which the FIRST OCCURRENCE of pattern starts
         * otherwise
         *      method returns -1
         *
         * countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         * at which index, first occurrence of "i" is present -> 2
         * at which index, first occurrence of "iT" is present -> 2
         * at which index, first occurrence of "King" is present -> -1
         * at which index, first occurrence of "n" is present -> 9
         * at which index, first occurrence of "KInG" is present -> 7
         */
        System.out.println("\nmethod - indexOf()");
        System.out.println("countryName -> " + countryName);

        int indexOf_i = countryName.indexOf("i");
        System.out.println("Index of 'i' is -> " + indexOf_i);

        int indexOf_iT = countryName.indexOf("iT");
        System.out.println("Index of 'iT' is -> " + indexOf_iT);

        int indexOf_King = countryName.indexOf("King");
        System.out.println("Index of 'King' is -> " + indexOf_King);

        int indexOf_n = countryName.indexOf("n");
        System.out.println("Index of 'n' is -> " + indexOf_n);

        int indexOf_KInG = countryName.indexOf("KInG");
        System.out.println("Index of 'KInG' is -> " + indexOf_KInG);

        /**
         * To find the index at which the LAST OCCURRENCE of a given pattern EXACTLY starts in the string
         * method: lastIndexOf()
         * input: String
         * return-type: int
         *
         * if the given pattern is EXACTLY present in the string
         *      method returns the index from which the LAST OCCURRENCE of pattern starts
         * otherwise
         *      method returns -1
         *
         * countryName = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND"
         * at which index, last occurrence of "i" is present -> 45
         * at which index, last occurrence of "iT" is present -> 26
         * at which index, last occurrence of "King" is present -> -1
         * at which index, last occurrence of "n" is present -> 33
         * at which index, last occurrence of "KInG" is present -> 7
         */
        System.out.println("\nmethod - lastIndexOf()");
        System.out.println("countryName -> " + countryName);

        int lastIndexOf_i = countryName.lastIndexOf("i");
        System.out.println("Last index of 'i' is -> " + lastIndexOf_i);

        int lastIndexOf_iT = countryName.lastIndexOf("iT");
        System.out.println("Last index of 'iT' is -> " + lastIndexOf_iT);

        int lastIndexOf_King = countryName.lastIndexOf("King");
        System.out.println("Last index of 'King' is -> " + lastIndexOf_King);

        int lastIndexOf_n = countryName.lastIndexOf("n");
        System.out.println("Last index of 'n' is -> " + lastIndexOf_n);

        int lastIndexOf_KInG = countryName.lastIndexOf("KInG");
        System.out.println("Last index of 'KInG' is -> " + lastIndexOf_KInG);

        /**
         * To remove the spaces before the first character in the string AND
         *  after the last character in the string
         * method: trim()
         * return-type: String
         *
         * This method:
         *      creates a copy of the original-string-value
         *      trims the extra spaces(if any) from the copied-value
         *      returns the trimmed-string-value
         *
         * trim()-method does NOT change the original-string-value
         */
        System.out.println("\nmethod - trim()");
        String statement = "   This  is    a warning    to all citizens   Of  UnIted StaTEs      ";

        String statement_Trim = statement.trim();

        System.out.println("$"+statement+"$");
        System.out.println("$"+statement_Trim+"$");

















    }
}
