package Class9;

import java.util.ArrayList;

public class ArrayList_List_1 {
    public static void main(String[] args) {
        /**
         * Limitations of Array:
         * 1. In order to create an Array, we have to know either
         *  a) what are the values which you want to store in the array.
         *      OR
         *  b) how many values you want to store in the array
         * ArrayList allows us to create a new ArrayList even if we don't have above information/data.
         *
         * 2. Array length is fixed.
         * ArrayList expands/contracts as we add/remove data.
         *
         * 3. Array can only store values of SAME datatype.
         * ArrayList can store multiple values of multiple datatype.
         */
        /**
         * Methods:
         *      size()
         *      add()
         *      remove()
         *      get()
         *      set()
         *      contains()
         *      isEmpty()
         *      clear()
         *
         */
        /**
         * ArrayList:
         *      is non-primitive datatype
         *      can store multiple values of same or multiple datatype.
         */

        /**
         * To create an ArrayList/List:
         * ArrayList<WrapperClass> myArrayList = new ArrayList<>();
         *      OR
         * List<WrapperClass> myList = new ArrayList<>();
         *
         * WrapperClass: a Class which represents the primitive datatype.
         * int      ->      Integer
         * double   ->      Double
         * char     ->      Character
         * boolean  ->      Boolean
         * String   ->      String
         *                  Object (if you want to store values of MULTIPLE datatypes)
         *
         * Depending upon the type of values we want to store in ArrayList/List,
         *  we use the respective wrapperClass while creating the ArrayList/List.
         */

        // Create an ArrayList to store bill-amounts from shopping
        ArrayList<Double> myBills = new ArrayList<>();      // []
        System.out.println("myBills -> "+myBills);

        /**
         * To find the number of values stored in ArrayList
         *      OR
         * To find the length/size of ArrayList
         * method: size()
         * return-type: int
         *
         */
        System.out.println("\nmethod - size()");
        System.out.println("myBills -> "+myBills);
        int numberOfBills = myBills.size();
        System.out.println("Number of bills stored in myBills-ArrayList -> "+numberOfBills);

        /**
         * To add value in ArrayList
         * method: add()
         * input: the value which we want to add in the ArrayList
         *
         * -> new Value is going to store at the next available index in ArrayList
         * -> using add-method, we can add ONLY one value at a time.
         * -> ArrayList maintains the order of insertion;
         *      it will store values in memory in the same order as we added them.
         */
        System.out.println("\nmethod - add()");
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
        myBills.add(8.99);
        myBills.add(65.32);
        myBills.add(65.32);
        myBills.add(86.43);
        myBills.add(67.77);
        myBills.add(875.30);
        myBills.add(89.90);

        System.out.println("myBills -> "+myBills);
        System.out.println("Number of bills stored in myBills-ArrayList -> "+myBills.size());
        // [89.9, 9.37, 190.7, 21.89, 9.37, 89.9, 8.99, 65.32, 21.89, 9.37, 89.9, 21.89, 9.37, 89.9, 8.99, 65.32, 65.32, 86.43, 67.77, 875.3, 89.9]

        /**
         * To remove a value from ArrayList
         * method: remove()
         *
         * -> using remove-method, we can remove ONLY one value at a time.
         *
         * usage:
         *  1. by providing the index-number from which we want to remove the value.
         *  2. by providing the value which we want to remove.
         */
        /**
         * if using remove()-method as #1. by providing the index-number from which we want to remove the value.
         *
         * if the given index-number is within the valid range (0 to lastIndexNumber)
         *      method will remove the value present at the given-index and returns the removed-value
         * otherwise
         *      IndexOutOfBoundsException
         */
        System.out.println("\nmethod - remove() as #1. by providing the index-number from which we want to remove the value.");
        Double removedFromIndex3 = myBills.remove(3);
        System.out.println("Removed bill amount from index-3 -> "+removedFromIndex3);
        System.out.println("myBills -> "+myBills);
        System.out.println("Number of bills stored in myBills-ArrayList -> "+myBills.size());

        Double removedFromIndex8 = myBills.remove(8);
        System.out.println("Removed bill amount from index-8 -> "+removedFromIndex8);
        System.out.println("myBills -> "+myBills);
        System.out.println("Number of bills stored in myBills-ArrayList -> "+myBills.size());

        /**
         * if using remove()-method as #2. by providing the value which we want to remove.
         *
         * if the given value is EXACTLY present in the ArrayList
         *      method will remove the FIRST OCCURRENCE of the value and return true
         * otherwise
         *      method will return false
         */
        System.out.println("\nmethod - remove() as #2. by providing the value which we want to remove.");
        boolean isRemoved_34_67 = myBills.remove(34.67);
        System.out.println("is '34.67' was present in myBills-ArrayList and removed successfully -> "+isRemoved_34_67);
        System.out.println("myBills -> "+myBills);
        System.out.println("Number of bills stored in myBills-ArrayList -> "+myBills.size());

        boolean isRemoved_21_89 = myBills.remove(21.89);
        System.out.println("is '21.89' was present in myBills-ArrayList and removed successfully -> "+isRemoved_21_89);
        System.out.println("myBills -> "+myBills);
        System.out.println("Number of bills stored in myBills-ArrayList -> "+myBills.size());

        /**
         * To get the value present at a specific index
         * method: get()
         * input: index-number
         *
         * if the given index-number is within the valid range (0 to lastIndexNumber)
         *      method will return the copy of value store at the given index-number
         * otherwise
         *      IndexOutOfBoundsException
         */
        System.out.println("\nmethod - get()");
        Double amountAtIndex12 = myBills.get(12);
        System.out.println("Bill amount at index-12 -> "+amountAtIndex12);
        Double amountAtLastIndex = myBills.get(myBills.size()-1);
        System.out.println("Bill amount at last-index -> "+amountAtLastIndex);
        System.out.println("myBills -> "+myBills);
        System.out.println("Number of bills stored in myBills-ArrayList -> "+myBills.size());

        /**
         * To replace a value present at a specific index with new-value
         * method: set()
         * input: index-number, new-value
         *
         * if the given index-number is within the valid range (0 to lastIndexNumber)
         *      method will replace the present-value at the give index-number with new-value, and returns the old-value
         * otherwise
         *      IndexOutOfBoundsException
         */
        System.out.println("\nmethod - set()");
        Double oldValueAtIndex11 = myBills.set(11, 100.01);
        System.out.println("Old value at index-11 -> "+oldValueAtIndex11);
        System.out.println("myBills -> "+myBills);
        System.out.println("Number of bills stored in myBills-ArrayList -> "+myBills.size());

        Double oldValueAtIndex0 = myBills.set(0, 0.001);
        System.out.println("Old value at index-0 -> "+oldValueAtIndex0);
        System.out.println("myBills -> "+myBills);
        System.out.println("Number of bills stored in myBills-ArrayList -> "+myBills.size());

        /**
         * To find if a given value is present at any index-number in the ArrayList or not
         * method: contains()
         * input: value
         *
         * if the given-value is EXACTLY present at any index-number in the ArrayList
         *      method will return true
         * otherwise
         *      method will return false
         *
         */
        System.out.println("\nmethod - contains()");
        boolean isContains_1_1 = myBills.contains(1.1);
        System.out.println("is 1.1 present at any index-number in myBills-ArrayList -> "+isContains_1_1);
        boolean isContains_21_89 = myBills.contains(21.89);
        System.out.println("is 21.89 present at any index-number in myBills-ArrayList -> "+isContains_21_89);

        System.out.println("myBills -> "+myBills);
        System.out.println("Number of bills stored in myBills-ArrayList -> "+myBills.size());

        /**
         * To check if ArrayList is empty (means, size is zero, or it has no value stored in it)
         * method: isEmpty()
         *
         * if ArrayList is empty
         *      method will return true
         * otherwise
         *      method will return false
         *
         */
        System.out.println("\nmethod - isEmpty()");
        boolean isMyBillsEmpty = myBills.isEmpty();
        System.out.println("is myBills empty -> "+isMyBillsEmpty);
        System.out.println("myBills -> "+myBills);
        System.out.println("Number of bills stored in myBills-ArrayList -> "+myBills.size());

        /**
         * To clear the ArrayList
         *      OR
         * To empty the ArrayList
         *      OR
         * To remove all values from ArrayList
         * method: clear()
         */
        System.out.println("\nmethod - clear()");
        myBills.clear();
        System.out.println("Cleared myBills-ArrayList");

        boolean isMyBillsEmptyAfterClear = myBills.isEmpty();
        System.out.println("\nis myBills empty (after suing clear-method) -> "+isMyBillsEmptyAfterClear);
        System.out.println("myBills -> "+myBills);
        System.out.println("Number of bills stored in myBills-ArrayList -> "+myBills.size());

    }
}
