package Class10;

import java.util.HashSet;

public class HashSet_Set_1 {
    public static void main(String[] args) {
        /**
         * HashSet:
         *      is a non-primitive datatype.
         *      can store multiple UNIQUE values of same or multiple datatype.
         *      (HashSet canNOT store duplicate values)
         */
        /**
         * HashSet vs ArrayList
         *  1. HashSet canNOT store duplicate values, whereas ArrayList can store duplicate values.
         *      if we try to add duplicate value, HashSet will simply ignore it.
         *  2. HashSet uses Hashing technique to store value in memory, whereas ArrayList uses sequential technique to store value in memory.
         *      due to this,
         *      a. HashSet does not maintain the order of insertion
         *          ArrayList maintains the order of insertion.
         *      b. There is NO concept of index in HashSet
         *          ArrayList has the concept of index.
         */

        /**
         * To create a HashSet/Set:
         * HashSet<WrapperClass> myHashSet = new HashSet<>();
         *      OR
         * Set<WrapperClass> mySet = new HashSet<>();
         *
         WrapperClass: a Class which represents the primitive datatype.
         * int      ->      Integer
         * double   ->      Double
         * char     ->      Character
         * boolean  ->      Boolean
         * String   ->      String
         *                  Object (if you want to store values of MULTIPLE datatypes)
         *
         * Depending upon the type of values we want to store in HashSet/Set,
         *  we use the respective wrapperClass while creating the HashSet/Set.
         */
        /*
            store names of students for bath20230 -> ArrayList<String>
            store temperature values of this week -> ArrayList<Double>
            store emailAddress of students for batch2030 -> HashSet<String> (eg: "test@gmail.com", "test1234@gmail.com")
         */
        /**
         * Methods:
         *      size()
         *      add()
         *      remove()
         *      contains()
         *      isEmpty()
         *      clear()
         *
         */
        // to store emailAddress of students for batch2030
        HashSet<String> emailAddressBatch2030 = new HashSet<>();    // []
        System.out.println("Email addresses of batch-2030 -> "+emailAddressBatch2030);

        /**
         * To find the number of values stored in HashSet/Set:
         *      OR
         * To find the length/size of HashSet/Set
         * method: size()
         * return-type: int
         */
        System.out.println("\nmethod - size()");
        int numberOfEmailAddresses = emailAddressBatch2030.size();
        System.out.println("Email addresses of batch-2030 -> "+emailAddressBatch2030);
        System.out.println("Number of emailAddresses for batch-2030 -> "+numberOfEmailAddresses);

        /**
         * To add value in HashSet/Set
         * method: add()
         * input: the value which we want to add in the HashSet/Set
         *
         * -> new Value is going to store if it's NOT already present
         * -> using add-method, we can add ONLY one value at a time.
         * -> HashSet does NOT maintain the order of insertion;
         *      bcz, it stores the values in memory in random order
         */
        System.out.println("\nmethod - add()");
        emailAddressBatch2030.add("jia@test.com");
        emailAddressBatch2030.add("KenDra@test.com");
        emailAddressBatch2030.add("john@test.com");
        emailAddressBatch2030.add("kia@test.com");
        emailAddressBatch2030.add("michael@test.com");
        emailAddressBatch2030.add("natalia@test.com");
        emailAddressBatch2030.add("liya@test.com");
        emailAddressBatch2030.add("KenDra@test.com");
        emailAddressBatch2030.add("KIA@test.com");
        emailAddressBatch2030.add("JoHNnY@test.com");
        emailAddressBatch2030.add("mAx@test.com");
        emailAddressBatch2030.add("MichaEl@test.com");
        emailAddressBatch2030.add("Liya@test.com");
        emailAddressBatch2030.add("JIA@test.com");
        emailAddressBatch2030.add("KenDRA@test.com");
        emailAddressBatch2030.add("AnnA@test.com");
        emailAddressBatch2030.add("michael@test.com");
        emailAddressBatch2030.add("ROMIA@test.com");
        emailAddressBatch2030.add("jiMMy@test.com");

        System.out.println("Email addresses of batch-2030 -> "+emailAddressBatch2030);
        System.out.println("Number of emailAddresses for batch-2030 -> "+emailAddressBatch2030.size());
        /*
            [JoHNnY@test.com, MichaEl@test.com, JIA@test.com, KenDra@test.com, ROMIA@test.com, mAx@test.com,
            michael@test.com, AnnA@test.com, kia@test.com, john@test.com, KIA@test.com, natalia@test.com,
            KenDRA@test.com, jiMMy@test.com, jia@test.com, Liya@test.com, liya@test.com]

            17
         */

        /**
         * To remove a value from HashSet/Set
         * method: remove()
         *
         * -> using remove-method, we can remove ONLY one value at a time.
         *
         * usage: by providing the value which we want to remove.
         *
         * if the given value is EXACTLY found in HashSet
         *      method will remove the value and return true
         * otherwise
         *      method will return false
         */
        System.out.println("\nmethod - remove()");
        boolean is_JiA_EmailRemoved = emailAddressBatch2030.remove("JiA@test.com");
        System.out.println("is 'JiA@test.com' removed successfully? -> "+is_JiA_EmailRemoved);          // false

        boolean is_JoHNnY_EmailRemoved = emailAddressBatch2030.remove("JoHNnY@test.com");
        System.out.println("is 'JoHNnY@test.com' removed successfully? -> "+is_JoHNnY_EmailRemoved);    // true

        boolean is_liya_EmailRemoved = emailAddressBatch2030.remove("liya@Test.com");
        System.out.println("is 'liya@Test.com' removed successfully? -> "+is_liya_EmailRemoved);        // false

        boolean is_john_EmailRemoved = emailAddressBatch2030.remove("john@test.com");
        System.out.println("is 'john@test.com' removed successfully? -> "+is_john_EmailRemoved);        // true

        System.out.println("Email addresses of batch-2030 -> "+emailAddressBatch2030);
        System.out.println("Number of emailAddresses for batch-2030 -> "+emailAddressBatch2030.size());
        /*
            [MichaEl@test.com, JIA@test.com, KenDra@test.com, ROMIA@test.com, mAx@test.com, michael@test.com,
            AnnA@test.com, kia@test.com, KIA@test.com, natalia@test.com, KenDRA@test.com, jiMMy@test.com,
            jia@test.com, Liya@test.com, liya@test.com]

            15
         */

        /**
         * To find if a given value is present in the HashSet or not
         * method: contains()
         * input: value
         *
         * if the given-value is EXACTLY present in the HashSet
         *      method will return true
         * otherwise
         *      method will return false
         *
         */
        System.out.println("\nmethod - contains()");
        /*
            [MichaEl@test.com, JIA@test.com, KenDra@test.com, ROMIA@test.com, mAx@test.com, michael@test.com,
            AnnA@test.com, kia@test.com, KIA@test.com, natalia@test.com, KenDRA@test.com, jiMMy@test.com,
            jia@test.com, Liya@test.com, liya@test.com]

            15
         */
        boolean is_jia_test_com_present = emailAddressBatch2030.contains("jia@test.com");
        System.out.println("is 'jia@test.com' present in emailAddressBatch2030 -> "+is_jia_test_com_present);   // true

        boolean is_MichaEl_test_com_present = emailAddressBatch2030.contains("MichaEltest.com");
        System.out.println("is 'MichaEltest.com' present in emailAddressBatch2030 -> "+is_MichaEl_test_com_present);   // false

        boolean is_KIA_test_com_present = emailAddressBatch2030.contains("KIA@test.com");
        System.out.println("is 'KIA@test.com' present in emailAddressBatch2030 -> "+is_KIA_test_com_present);   // true

        System.out.println("Email addresses of batch-2030 -> "+emailAddressBatch2030);
        System.out.println("Number of emailAddresses for batch-2030 -> "+emailAddressBatch2030.size());

        /**
         * To check if HashSet is empty (means, size is zero, or it has no value stored in it)
         * method: isEmpty()
         *
         * if HashSet is empty
         *      method will return true
         * otherwise
         *      method will return false
         *
         */
        System.out.println("\nmethod - isEmpty()");
        boolean isEmailAddressBatch2030Empty = emailAddressBatch2030.isEmpty();
        System.out.println("is emailAddressBatch2030-HashSet empty -> "+isEmailAddressBatch2030Empty);
        System.out.println("Number of emailAddresses for batch-2030 -> "+emailAddressBatch2030.size());
        System.out.println("Email addresses of batch-2030 -> "+emailAddressBatch2030);

        /**
         * To clear the HashSet
         *      OR
         * To empty the HashSet
         *      OR
         * To remove all values from HashSet
         * method: clear()
         */
        System.out.println("\nmethod - clear()");
        emailAddressBatch2030.clear();
        System.out.println("Clearing emailAddressBatch2030-HashSet");

        boolean isEmailAddressBatch2030Empty_AfterClear = emailAddressBatch2030.isEmpty();
        System.out.println("is emailAddressBatch2030-HashSet empty -> "+isEmailAddressBatch2030Empty_AfterClear);
        System.out.println("Number of emailAddresses for batch-2030 -> "+emailAddressBatch2030.size());
        System.out.println("Email addresses of batch-2030 -> "+emailAddressBatch2030);

    }
}
