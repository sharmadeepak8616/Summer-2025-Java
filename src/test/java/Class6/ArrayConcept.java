package Class6;

import java.util.Arrays;

public class ArrayConcept {
    public static void main(String[] args) {
        /**
         * At any point of time, there is only one value can be stored: int, String, double, boolean, char
         *
         * At any point of time, there can be one or more values present in an array.
         *
         * 5 String-variables to store company names
         * 1 array to store 5 company names (5 String-datatype values)
         * 1 array to store 5 bill-amounts (5 double-datatype values)
         *
         */
        /**
         * Array:
         *      is a non-primitive datatype
         *      can store multiple values of SAME datatypes
         */
        /**
         * Information to know before writing code to create an Array:
         * 1. what will be datatype of values that you want to store in the array.
         * 2. a) what are the values which you want to store in the array.
         *      OR
         * 2. b) how many values you want to store in the array
         *
         * if 1 and 2a:
         *      ans1[] arrayName = {ans2a by comma-separated};
         *      datatype[] arrayName = {value1, value2, value3};
         *      // creates an array of given datatype with the given values stored in it.
         *
         * if 1 and 2b:
         *      ans1[] arrayName = new ans1[ans2b];
         *      datatype[] arrayName = new datatype[totalNumberOfValues];
         *      // creates an EMPTY-array which can store totalNumberOfValues-values of given datatype
         */
        /**
         * store top 5-company names of 2030 -> an array which can store 5-string values
         * 1. what will be datatype of values that you want to store in the array. -> String
         * 2. a) what are the values which you want to store in the array. -> No
         *      OR
         * 2. b) how many values you want to store in the array -> 5
         * 1 and 2b
         */
        String[] top5Companies2030 = new String[5]; // top5Companies2030 = [ , , , , ]

        /**
         * store your family-members names in an array
         * 1. what will be datatype of values that you want to store in the array. -> String
         * 2. a) what are the values which you want to store in the array. -> John,Lia,King,Queen
         *      OR
         * 2. b) how many values you want to store in the array -> 4
         * 1 and 2a
         */
        String[] familyMembers = {"John","Lia","King","Queen"}; // familyMembers = [John, Lia, King, Queen]

        /**
         * To print the entire array
         */
        System.out.println("top5Companies2030 -> "+ Arrays.toString(top5Companies2030));
        System.out.println("familyMembers -> "+ Arrays.toString(familyMembers));

        /**
         * Index concept in array:
         * Array Length = Total number of values that can be stored in the array
         *
         * top5Companies2030 = [ , , , , ] = total values that can be stored = 5 (Array length = 5)
         *                      0 1 2 3 4
         *
         * familyMembers = [John, Lia, King, Queen] = total values that can be stored = 4 (Array length = 4)
         *                    0    1    2      3
         *
         * Relation between lastIndex and Length:
         *      lastIndex = length-1
         *
         */
        /**
         * Fill or replace values in Array using index-numbers
         *
         * arrayName[indexNumber] = value;
         *
         */
        System.out.println("\nFill or replace values in Array using index-numbers");
        top5Companies2030[2] = "AppLe";         // top5Companies2030 = [ , ,"AppLe", , ]
        top5Companies2030[1] = "FaceBoOk";      // top5Companies2030 = [ ,"FaceBoOk","AppLe", , ]
        top5Companies2030[4] = "GooGLe";        // top5Companies2030 = [ ,"FaceBoOk","AppLe", ,"GooGLe"]
        top5Companies2030[0] = "AmAzOn";        // top5Companies2030 = ["AmAzOn","FaceBoOk","AppLe", ,"GooGLe"]
        top5Companies2030[3] = "XYZ";           // top5Companies2030 = ["AmAzOn","FaceBoOk","AppLe","XYZ","GooGLe"]

        familyMembers[0] = "Money";

        System.out.println("top5Companies2030 -> "+ Arrays.toString(top5Companies2030));
        System.out.println("familyMembers -> "+ Arrays.toString(familyMembers));

        /**
         * To get the value stored at a specific index in the array
         * arrayName[indexNumber]
         */
        System.out.println("\nTo get the value stored at a specific index in the array");
        String companyNameIndex2 = top5Companies2030[2];    // top5Companies2030[2] code represent the value present at index-2 in top5Companies2030-Array
        System.out.println("Company name at index-2 -> " + companyNameIndex2);

        String nameIndex0 = familyMembers[0]; // familyMembers[0] code represent the value present at index-0 in familyMembers-Array
        System.out.println("Family member name at index-0 -> "+nameIndex0);

        /**
         * To find the length of Array
         *  OR
         * To find the total number of values that can be stored in Array
         * property: length
         */
        System.out.println("\nArray Length");
        int top5Companies2030Length = top5Companies2030.length;
        System.out.println("top5Companies2030 length -> " + top5Companies2030Length);
        System.out.println("top5Companies2030 lastIndex -> " + (top5Companies2030Length-1));

        int familyMembersLength = familyMembers.length;
        System.out.println("familyMembers length -> " + familyMembersLength);
        System.out.println("familyMembers lastIndex -> " + (familyMembersLength-1));










    }
}
