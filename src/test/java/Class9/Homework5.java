package Class9;

import java.util.ArrayList;

public class Homework5 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("JioHn");
        names.add("john");
        names.add("KiaKia");
        names.add("Lisa");
        names.add("EVE");
        names.add("JiYa");
        names.add("JOHN");
        names.add("Eve");
        names.add("MarlyN");
        names.add("MerY");
        names.add("jOhN");
        names.add("mery");
        names.add("LiSa");
        names.add("John");
        names.add("Johnny");
        names.add("Troy");
        names.add("DerEK");
        names.add("VINNIE");

        System.out.println("names-ArrayList -> "+names);
        System.out.println("names-ArrayList-size -> "+names.size());

        /**
         * 1. Find the index of third-occurrence of John(ignoring cases) in names-ArrayList
         *
         * if third-occurrence of John (ignoring cases) os present in names-ArrayList
         *      store the index-number in a variable, then print it.
         * otherwise
         *      store -1 in a variable, then print it.
         */

        /**
         * 2. Find the number of names which starts with E (ignoring cases) in names-ArrayList
         */

        /**
         * 3. Find if "Eve" is present only once in the names-ArrayList
         *
         * if the "Eve" (ignoring cases) is present ONLY once in the names-ArrayList
         *      store true in a variable, then print it.
         * otherwise
         *      store false in a variable, then print it.
         *
         */

        /**
         * 4. Calculate the total of myBills-ArrayList
         */
        ArrayList<Double> myBills = new ArrayList<>();
        myBills.add(89.90);
        myBills.add(9.37);
        myBills.add(190.70);
        myBills.add(21.89);
        myBills.add(9.37);
        myBills.add(89.90);
        myBills.add(8.99);
        myBills.add(65.32);
        myBills.add(21.89);
        myBills.add(9.37);
        myBills.add(89.90);
        myBills.add(21.89);
        myBills.add(9.37);
        myBills.add(89.90);
    }
}
