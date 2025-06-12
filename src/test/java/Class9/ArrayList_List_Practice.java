package Class9;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayList_List_Practice {
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

        /*
            Replace all instances of john with Johnson
         */
        System.out.println("\nQuestion -> Replace all instances of john with Johnson");
        for (int i=0 ; i<=names.size()-1 ; i++){
            String name = names.get(i);
            if (name.equalsIgnoreCase("john")) {
                names.set(i,"Johnson");
            }
        }
        System.out.println("names-ArrayList -> "+names);
        System.out.println("names-ArrayList-size -> "+names.size());

        /**
         * Count the number of names which has 4 or less characters
         */
        System.out.println("\nQuestion -> Count the number of names which has 4 or less characters");
        int namesWith4OrLessCharacters = 0;
        for (String name : names) {
            if(name.length() <= 4) {
                namesWith4OrLessCharacters++;
            }
        }
        System.out.println("The number of names which has 4 or less characters -> " +namesWith4OrLessCharacters);
        System.out.println("names-ArrayList -> "+names);
        System.out.println("names-ArrayList-size -> "+names.size());


    }
}
