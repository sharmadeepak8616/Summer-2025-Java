package Class8;

import java.util.Arrays;

public class Loops_Concept_1 {
    public static void main(String[] args) {
        /**
         * Loops: when we need to execute lines of codes multiple times.
         *
         * 1. for-loop
         * 2. while-loop
         * 3. do-while-loop
         * 4. Enhanced-for-loop
         *
         */

        // Print "Hello" 3 times    - counter=0
        System.out.println("Hello");    // counter=1
        System.out.println("Hello");    // counter=2
        System.out.println("Hello");    // counter=3
        /*
            counter=0
            is counterValue less than 3
            if Yes, System.out.println("Hello"); otherwise stop

            initialization to count the number of times loop executed (counter=0)
            condition to decide to execute the loop (is counterValue less than 3)
            changeInValue (change in initializationVariable to count the number of loop-execution)
         */
        /**
         * for-loop
         *
         * for (initialization  ; condition ; changeInValue) {
         *      for-loop
         *      code block
         *      -> code will execute until the for-loop-condition becomes false
         * }
         */
        /**
         * for-loop execution steps:
         * 1. create the for-loop-variable mentioned in the initialization section with mentioned value.
         * 2. check for-loop-condition with current-value of for-loop-variable.
         * 3. if true
         *      Java enters the for-loop and executes the for-loop-code.
         *    if false
         *      Java does NOT enter the for-loop and more ahead in the code file.
         * 4. once all for-loop-code is executed, Java executes the changeInValue-code.
         * 5. check for-loop-condition with current-value of for-loop-variable.
         * 6. if true
         *      Java enters the for-loop and executes the for-loop-code.
         *    if false
         *      Java does NOT enter the for-loop and more ahead in the code file.
         * 7. once all for-loop-code is executed, Java executes the changeInValue-code.
         * 8. check for-loop-condition with current-value of for-loop-variable.
         * 9. if true
         *      Java enters the for-loop and executes the for-loop-code.
         *    if false
         *      Java does NOT enter the for-loop and more ahead in the code file.
         * 10. once all for-loop-code is executed, Java executes the changeInValue-code.
         * 11. and so-on....
         */
        System.out.println("for-loop");
        for (int counter=0 ; counter<3 ; counter++) {
            System.out.println("Hello");
        }

        String[] names = {"John", "Doe", "Liya", "Michael", "Angel", "Reena", "King", "Queen"};
        /*
            Print names which contains "e" in it
            Doe
            Michael
            Angel
            Reena
         */
        /*
            if(names[0].contains("e")) {
                sout(names[0])
            }
            if(names[1].contains("e")) {
                sout(names[1])
            }
            if(names[2].contains("e")) {
                sout(names[2])
            }



            if(names[X].contains("e")) {    X=0,1,2,3,...,arrayLength-1
                sout(names[X])
            }

            X=0 ; X <= arrayLength-1 ; X++

         */
        System.out.println("\nnames -> "+ Arrays.toString(names));
        System.out.println("for - Print names which contains \"e\" in it");
        for (int X=0 ; X<=names.length-1 ; X++) {
            if(names[X].contains("e")) {
                System.out.println(names[X]);
            }
        }

        System.out.println("\nnames -> "+ Arrays.toString(names));
        System.out.println("for - Print names which present at even-index-numbers");
        for (int X = 0; X < names.length; X += 2) {     // x=0,2,4,6
            System.out.println(names[X]);
        }

        /**
         * while-loop
         *
         * initialization
         * while (condition) {
         *      while-loop
         *      code block
         *      changeInValue; <-- LAST TIME inside the while-loop-code-block
         * }
         *
         */
        System.out.println("\n\nwhile-loop");
        int wCounter=0;
        while (wCounter<3) {
            System.out.println("Hello");
            wCounter++;
        }

        System.out.println("\nnames -> "+ Arrays.toString(names));
        System.out.println("while - Print names which contains \"e\" in it");
        int X=0 ;
        while ( X<=names.length-1) {
            if(names[X].contains("e")) {
                System.out.println(names[X]);
            }
            X++;
        }

        System.out.println("\nnames -> "+ Arrays.toString(names));
        System.out.println("while - Print names which present at even-index-numbers");
        int wX = 0;
        while (wX < names.length) {     // x=0,2,4,6
            System.out.println(names[wX]);
            wX += 2;
        }

        /**
         * do-while-loop
         *
         * initialization
         * do {
         *      do-while-loop
         *      code block
         *      changeInValue; <-- LAST TIME inside the do-while-loop-code-block
         * } while (condition);
         *
         */
        System.out.println("\nnames -> "+ Arrays.toString(names));
        System.out.println("do-while - Print names which present at even-index-numbers");
        int dwX = 0;
        do {     // x=0,2,4,6
            System.out.println(names[dwX]);
            dwX += 2;
        } while (dwX < names.length);

        System.out.println("\nnames -> "+ Arrays.toString(names));
        System.out.println("do-while - Print names which contains \"e\" in it");
        int dX=0 ;
        do {
            if(names[dX].contains("e")) {
                System.out.println(names[dX]);
            }
            dX++;
        } while ( dX<=names.length-1);

        /**
         * Enhanced-for-loop
         *
         * If all below conditions are true in your scenario, then you can use Enhanced-for-loop as well.
         *      1. we are applying loop on an Array or similar datatype (List, ArrayList, HashSet, Set, Collections etc)
         *      2. we want to traverse array from index0-value, index1-value, index2-value, index3-value and so on....
         *
         * for (datatype variable : arrayName) {
         *      Enhanced-for-loop
         *      code block
         * }
         *
         * --> datatype of Enhanced-for-loop-variable should be SAME as the datatype of values in the array.
         */
        /**
         * Enhanced-for-loop execution steps:
         * 1. Java create the mentioned variable.
         * 2. index0-value from array will be assigned to the variable (automatically)
         * 3. Java enters the Enhanced-for-loop code block, and executes the code.
         * 4. index1-value from array will be assigned to the variable (automatically)
         * 5. Java enters the Enhanced-for-loop code block, and executes the code.
         * 5. index2-value from array will be assigned to the variable (automatically)
         * 6. Java enters the Enhanced-for-loop code block, and executes the code.
         * 7. index3-value from array will be assigned to the variable (automatically)
         * 8. Java enters the Enhanced-for-loop code block, and executes the code.
         * ...
         * 9. indexLast-value from array will be assigned to the variable (automatically)
         * 10. Java enters the Enhanced-for-loop code block, and executes the code.
         */
        System.out.println("\nnames -> "+ Arrays.toString(names));
        System.out.println("Enhanced-for - Print names which contains \"e\" in it");
        for (String name : names) {
            if(name.contains("e")) {
                System.out.println(name);
            }
        }

        String[] words = {"Hi", "Hello", "Giving", "Beautiful", "King & Queen", "Fruit", "Lemon", "Shopping"};

    /*
        Print the values from words-array in reverse order
        sout(lastIndex-value)
        sout(second-lastIndex-value)
        ...
        ...
        sout(index1-value)
        sout(index0-value)


        sout(indexY-value)      Y=lastIndex,lastIndex-1,lastIndex-2,lastIndex-3,...,2,1,0
     */

        System.out.println("\nPrint the values from words-array in reverse order");
        System.out.println("words -> "+Arrays.toString(words));
        System.out.println("using for-loop");
        for (int Y=words.length-1 ; Y>=0 ; Y--) {
            System.out.println(words[Y]);
        }

        System.out.println("using while-loop");
        int Y=words.length-1;
        while (Y>=0) {
            System.out.println(words[Y]);
            Y--;
        }

        /*
         * 1. we are applying loop on an Array or similar datatype (List, ArrayList, HashSet, Set, Collections etc)
         *      Yes
         * 2. we want to traverse array from index0-value, index1-value, index2-value, index3-value and so on....
         *      No
         *
         * We cannot use Enhanced-for-loop in this scenario
         */

        /**
         * Create a String-variable and store any String-data in it
         *
         * convert the String into Titlecase (convert 1st-letter of each word into Uppercase and all other letters into lowercase)
         * wOrk HaRD paRTy HArdEr   -> Work Hard Party Harder
         * stay humble keep smiling -> Stay Humble Keep Smiling
         * goOd MorNINg -> Good Morning
         * maY gOD BE wITh yOU alWAys -> May God Be With You Always
         *
         */
        System.out.println("\nConvert the String into Titlecase");
        String sentence = "stay humble keep smiling";
        String result = "";
        /*
            "goOd MorNINg"
            1. break string into words -> using split()
            2. Work on each word (from index-0-word, index-1-word, index-2-word, index-3-word and so on...)
                Pick index-0-data -> convert into Uppercase
                Pick from-index-1-to-LastIndex-data -> convert into lowercase
                Join the index-0-data with from-index-1-to-LastIndex-data

         */
        String[] sentenceWords = sentence.split(" ");
        for (String word : sentenceWords) {
            result = result + word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        System.out.println("sentence -> "+sentence);
        System.out.println("result -> "+result.trim());


















    }
}
