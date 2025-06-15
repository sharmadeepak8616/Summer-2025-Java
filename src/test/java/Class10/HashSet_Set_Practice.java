package Class10;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSet_Set_Practice {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("JioHn");
        names.add("john");
        names.add("KiaKia");
        names.add("JIA");
        names.add("Lisa");
        names.add("EVE");
        names.add("JiYa");
        names.add("Ann");
        names.add("JOHN");
        names.add("Eve");
        names.add("MarlyN");
        names.add("MerY");
        names.add("MARIAM");
        names.add("jOhN");
        names.add("mery");
        names.add("LiSa");
        names.add("John");
        names.add("Johnny");
        names.add("Troy");
        names.add("DerEK");
        names.add("VINNIE");

        System.out.println("number of names in names-HashSet -> "+names.size());
        System.out.println("names-HashSet -> "+names);
        /*
            21
            [Ann, JIA, JiYa, Johnny, VINNIE, MARIAM, John, JOHN, mery, Lisa, LiSa, Troy,
            KiaKia, JioHn, MarlyN, EVE, Eve, john, jOhN, DerEK, MerY]
         */
        /**
         * Find the list of names which contains A(ignore cases) in it
         */
        /*
            HashSet -> [Ann, JIA, JiYa, Johnny, VINNIE, MARIAM, John, JOHN, mery, Lisa, LiSa, Troy,
            KiaKia, JioHn, MarlyN, EVE, Eve, john, jOhN, DerEK, MerY]

            []
            1. create a variable which can contain names which has A in it. (HashSet, ArrayList)
            2. loop

         */
        System.out.println("\nQuestion -> Find the list of names which contains A(ignore cases) in it.");
        ArrayList<String> namesWithA = new ArrayList<>();
        for(String name : names) {
            if (name.toLowerCase().contains("a")) {
                namesWithA.add(name);
            }
        }
        System.out.println("number of names in names-HashSet -> "+names.size());
        System.out.println("names-HashSet -> "+names);
        System.out.println("names which contains A(ignore cases) in it -> "+namesWithA);

        /**
         * Count the number of names which has 4 or less characters
         */
        System.out.println("\nQuestion -> Count the number of names which has 4 or less characters");
        /*
            HashSet -> [Ann, JIA, JiYa, Johnny, VINNIE, MARIAM, John, JOHN, mery, Lisa, LiSa, Troy,
            KiaKia, JioHn, MarlyN, EVE, Eve, john, jOhN, DerEK, MerY]
         */
        int namesWith4OrLessCharacters = 0;
        for (String name : names) {
            if (name.length() <= 4) {
                namesWith4OrLessCharacters++;
            }
        }
        System.out.println("number of names which has 4 or less characters -> "+namesWith4OrLessCharacters);
        System.out.println("names-HashSet -> "+names);

        /**
         * remove ALL instances of johnny, except joHnny
         */
        HashSet<String> newNames = new HashSet<>();
        newNames.add("Johnny");
        newNames.add("jOhnny");
        newNames.add("joHnny");
        newNames.add("johNny");
        newNames.add("johnNy");
        newNames.add("johnnY");
        newNames.add("JOHNNY");
        System.out.println("\nQuestion -> remove ALL instances of johnny, except joHnny");
        System.out.println("newNames -> "+newNames);
        HashSet<String> unWantedJohnny = new HashSet<>();
        for (String johnny : newNames) {
            if (!johnny.equals("joHnny")) {
                unWantedJohnny.add(johnny);
            }
        }
        System.out.println("unWantedJohnny -> "+unWantedJohnny);
        for (String name : unWantedJohnny) {
            newNames.remove(name);
        }
        System.out.println("newNames -> "+newNames);





    }
}
