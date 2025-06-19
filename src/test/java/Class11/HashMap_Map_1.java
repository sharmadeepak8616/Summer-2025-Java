package Class11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap_Map_1 {
    public static void main(String[] args) {
        /**
         * Datatypes which can store only one value at a time
         *      int
         *      double
         *      boolean
         *      String
         *      char
         * Datatypes which can store one or more values at a time
         *      Array           {11, 12, 13, 14, 15}
         *      ArrayList       [11, 12, 13, 14, 15]
         *      HashSet         [11, 12, 13, 14, 15]
         *      -> at each index, these datatypes can store only one value at a time
         * Datatype which can store one or more pair of values at a time
         *      HashMap         [{1, "Apple"}, {2,"Orange"}, {3,"Banana"}, {4,"Strawberry"}]
         *      -> at each index, this datatype can store a pair at a time
         */
        /**
         * Example:
         *      HashMap (studentResultHashMap) -> [{"101","A"}, {"102","A+"}, {"103","C+"}, {"104","B+"}, {"105","A+"}]
         *      HashMap (weatherHashMap) -> [{"NY",90.2}, {"NJ",90.0}, {"TX",101.32}, {"CA",77.3}, {"FL",104.8}]
         */
        /**
         * HashMap
         *      is a non-primitive datatype
         *      can store one or more pair of same or multiple datatypes
         *
         * HashMap uses Hashing technique to store any pair in java-memory
         *      due to this, HashMap does NOT maintain order of insertion
         *      and, does NOT support the concept of index
         */
        /**
         * HashMap pair can be considered as the combination of Key-data and Value-date
         * [{key1->value1},{key2->value2},{key3->value3},{key4->value4},{key5->value5},{key6->value6}]
         * In a pair,
         *      first data is Key
         *      second data is Value linked with the Key
         *
         * Note: Key is a HashMap must be UNIQUE
         */
        /**
         * To create a HashMap/Map:
         * HashMap<WrapperClassKey, WrapperClassValue> myHashMap = new HashMap<>();
         *      OR
         * Map<WrapperClassKey, WrapperClassValue> myMap = new HashMap<>();
         *
         WrapperClass: a Class which represents the primitive datatype.
         * int      ->      Integer
         * double   ->      Double
         * char     ->      Character
         * boolean  ->      Boolean
         * String   ->      String
         *                  Object (if you want to store values of MULTIPLE datatypes)
         *
         * Depending upon the type of Key and Values we want to store in HashMap/Map,
         *  we use the respective wrapperClass while creating the HashMap/Map.
         */
        /**
         * Methods:
         *      size()
         *      put()
         *      remove()
         *      get()
         *      containsKey()
         *      containsValue()
         *      keySet()
         *      values()
         *      isEmpty()
         *      clear()
         *
         */
        // HashMap (weatherHashMap) -> [{"NY",90.2}, {"NJ",90.0}, {"TX",101.32}, {"CA",77.3}, {"FL",104.8}]
        HashMap<String, Double> weatherHashMap = new HashMap<>();

        System.out.println("weatherHashMap -> "+weatherHashMap);    // weatherHashMap -> {}

        /**
         * To find the number of pairs stored in HashMap/Map:
         *      OR
         * To find the length/size of HashMap/Map
         * method: size()
         * return-type: int
         */
        System.out.println("\nmethod - size()");
        int numberOfWeatherPair = weatherHashMap.size();
        System.out.println("Number of weather data stored in weatherHashMap -> "+numberOfWeatherPair);
        System.out.println("weatherHashMap -> "+weatherHashMap);    // weatherHashMap -> {}

        /**
         * To add a pair in HashMap
         * method: put()
         * input: pair that we want to add (firstInputData is considered as KeyData, secondInputData is considered as ValueData)
         *
         * -> using put()-method, we can add only one pair at a time
         * -> does NOT maintain the order of insertion due to Hashing technique
         * -> if we try to add a pair, and the Key-data is already present in HashMap; HashMap will replace the old-pair with newPair
         */
        System.out.println("\nmethod - put()");
        weatherHashMap.put("NY", 90.8);
        weatherHashMap.put("NJ", 90.2);
        weatherHashMap.put("CA", 100.2);
        weatherHashMap.put("TX", 104.89);
        weatherHashMap.put("VI", 77.1);
        weatherHashMap.put("AL", 56.9);

        System.out.println("Number of weather data stored in weatherHashMap -> "+weatherHashMap.size());
        System.out.println("weatherHashMap -> "+weatherHashMap);    // weatherHashMap -> {VI=77.1, TX=104.89, NY=90.8, AL=56.9, NJ=90.2, CA=100.2}

        weatherHashMap.put("VI", 82.3);

        System.out.println("Number of weather data stored in weatherHashMap -> "+weatherHashMap.size());
        System.out.println("weatherHashMap -> "+weatherHashMap);

        /**
         * To remove a pair from HashMap
         * method: remove()
         *
         * usage:
         *      1. by providing the Key-data of the pair that we want to remove.
         *      2. by proving the complete-pair(key,value) that we want to remove.
         */
        /**
         * if using remove()-method as #1. by providing the Key-data of the pair that we want to remove.
         *
         * if the given key-data is EXACTLY found in HashMap as one of the keys
         *      the pair will be removed
         *      and, method returns the value linked with the removed-pair
         * else
         *      no pair is going to be removed
         *      and, method returns null
         */
        // weatherHashMap -> {VI=82.3, TX=104.89, NY=90.8, AL=56.9, NJ=90.2, CA=100.2}

        System.out.println("\nmethod - remove() - if using remove()-method as #1. by providing the Key-data of the pair that we want to remove.");

        Double valueWith_Nj = weatherHashMap.remove("Nj");      // null
        System.out.println("Removed pair with Key='Nj', linked value with 'Nj' -> "+valueWith_Nj);

        Double valueWith_56_9 = weatherHashMap.remove("56.9");      // null
        System.out.println("Removed pair with Key='56.9', linked value with '56.9' -> "+valueWith_56_9);

        Double valueWith_CA = weatherHashMap.remove("CA");      // 100.2 (pair CA->100.2 will be removed)
        System.out.println("Removed pair with Key='CA', linked value with 'CA' -> "+valueWith_CA);

        System.out.println("Number of weather data stored in weatherHashMap -> "+weatherHashMap.size());
        System.out.println("weatherHashMap -> "+weatherHashMap);

        /**
         * if using remove()-method as #2. by proving the complete-pair(key,value) that we want to remove.
         *
         * if the given pair is EXACTLY found in HashMap
         *      the pair will be removed
         *      and, method returns true
         * else
         *      no pair is going to be removed
         *      and, method returns false
         *
         */
        // weatherHashMap -> {VI=82.3, TX=104.89, NY=90.8, AL=56.9, NJ=90.2}

        System.out.println("\nmethod - remove() - if using remove()-method as #2. by proving the complete-pair(key,value) that we want to remove.");

        boolean isRemoved_VI_823 = weatherHashMap.remove("VI",82.3);        // true and pair will be removed
        System.out.println("is \"(VI, 82.3)\" pair removed successfully -> "+isRemoved_VI_823);

        boolean isRemoved_NY_902 = weatherHashMap.remove("NY",90.2);        // false and no pair will be removed
        System.out.println("is \"(NY, 90.2)\" pair removed successfully -> "+isRemoved_NY_902);

        boolean isRemoved_tx_10489 = weatherHashMap.remove("tx",104.89);    // false and no pair will be removed
        System.out.println("is \"(tx, 104.89)\" pair removed successfully -> "+isRemoved_tx_10489);

        boolean isRemoved_MI_723 = weatherHashMap.remove("MI",72.3);        // false and no pair will be removed
        System.out.println("is \"(MI, 72.3)\" pair removed successfully -> "+isRemoved_MI_723);

        System.out.println("Number of weather data stored in weatherHashMap -> "+weatherHashMap.size());
        System.out.println("weatherHashMap -> "+weatherHashMap);

        /**
         * To get the value-data linked with a given key-data
         * method: get()
         * input: the key-daya for which we want to get the value-data
         *
         * if the given key-data is EXACTLY found in HashMap
         *      method returns the copy of valued-data linked with the key-data
         * otherwise
         *      method returns null
         */
        // weatherHashMap -> {TX=104.89, NY=90.8, AL=56.9, NJ=90.2}
        System.out.println("\nmethod - get()");
        Double valueWith_TX = weatherHashMap.get("TX");             // 104.89
        System.out.println("Value linked with Key=TX -> "+valueWith_TX);

        Double valueWith_Ny = weatherHashMap.get("Ny");             // null
        System.out.println("Value linked with Key=Ny -> "+valueWith_Ny);

        Double valueWith_104_89 = weatherHashMap.get("104.89");     // null
        System.out.println("Value linked with Key=104.89 -> "+valueWith_104_89);

        Double valueWith_MI = weatherHashMap.get("MI");             // null
        System.out.println("Value linked with Key=MI -> "+valueWith_MI);

        Double valueWith_NJ = weatherHashMap.get("NJ");             // 90.2
        System.out.println("Value linked with Key=NJ -> "+valueWith_NJ);

        System.out.println("Number of weather data stored in weatherHashMap -> "+weatherHashMap.size());
        System.out.println("weatherHashMap -> "+weatherHashMap);

        /**
         * To find if the given data is present as one of the Keys in HashMap
         * method: containsKey()
         *
         * if the given data is EXACTLY present as one of the Keys in HashMap
         *      method returns true
         * otherwise
         *      method returns false
         *
         */
        // weatherHashMap -> {TX=104.89, NY=90.8, AL=56.9, NJ=90.2}
        System.out.println("\nmethod - containsKey()");
        boolean is_Ny_PresentAsKey = weatherHashMap.containsKey("Ny");      // false
        System.out.println("is 'Ny' present as one of the keys -> "+is_Ny_PresentAsKey);

        boolean is_TX_PresentAsKey = weatherHashMap.containsKey("TX");      // true
        System.out.println("is 'TX' present as one of the keys -> "+is_TX_PresentAsKey);

        boolean is_569_PresentAsKey = weatherHashMap.containsKey("56.9");   // false
        System.out.println("is '56.9' present as one of the keys -> "+is_569_PresentAsKey);

        boolean is_AL_PresentAsKey = weatherHashMap.containsKey("AL");      // true
        System.out.println("is 'AL' present as one of the keys -> "+is_AL_PresentAsKey);

        boolean is_NY_PresentAsKey = weatherHashMap.containsKey("NY");      // true
        System.out.println("is 'NY' present as one of the keys -> "+is_NY_PresentAsKey);

        System.out.println("Number of weather data stored in weatherHashMap -> "+weatherHashMap.size());
        System.out.println("weatherHashMap -> "+weatherHashMap);

        /**
         * To find if the given data is present as one of the Values in HashMap
         * method: containsValue()
         *
         * if the given data is EXACTLY present as one of the Values in HashMap
         *      method returns true
         * otherwise
         *      method returns false
         *
         */
        // weatherHashMap -> {TX=104.89, NY=90.8, AL=56.9, NJ=90.2}
        System.out.println("\nmethod - containsValue()");

        boolean is_Ny_PresentAsValue = weatherHashMap.containsValue("Ny");          // false
        System.out.println("is 'Ny' present as one of the values -> "+is_Ny_PresentAsValue);

        boolean is_569_PresentAsValue = weatherHashMap.containsValue("56.9");      // false
        System.out.println("is '56.9' present as one of the values -> "+is_569_PresentAsValue);

        boolean is_902_PresentAsValue = weatherHashMap.containsValue(90.2);         // true
        System.out.println("is '90.2' present as one of the values -> "+is_902_PresentAsValue);

        boolean is_TX_PresentAsValue = weatherHashMap.containsValue("TX");          // false
        System.out.println("is 'TX' present as one of the values -> "+is_TX_PresentAsValue);

        System.out.println("Number of weather data stored in weatherHashMap -> "+weatherHashMap.size());
        System.out.println("weatherHashMap -> "+weatherHashMap);

        /**
         * To get all the keys from HashMap in a new variable
         * method: keySet()
         *
         * This method copies all the Key-data from Hashmap, stores it a Set then returns the Set
         */
        // weatherHashMap -> {TX=104.89, NY=90.8, AL=56.9, NJ=90.2}
        System.out.println("\nmethod - keySet()");

        Set<String> allKeys = weatherHashMap.keySet();
        System.out.println("Keys present in weatherHashMap -> "+allKeys);

        System.out.println("Number of weather data stored in weatherHashMap -> "+weatherHashMap.size());
        System.out.println("weatherHashMap -> "+weatherHashMap);

        /**
         * To get all the values from HashMap in a new variable
         * method: values()
         *
         * This method copies all the Value-data from Hashmap, stores it a Collection then returns the Collection
         */
        // weatherHashMap -> {TX=104.89, NY=90.8, AL=56.9, NJ=90.2}
        System.out.println("\nmethod - values()");

        Collection<Double> allValues = weatherHashMap.values();
        System.out.println("Values present in weatherHashMap -> "+allValues);

        System.out.println("Number of weather data stored in weatherHashMap -> "+weatherHashMap.size());
        System.out.println("weatherHashMap -> "+weatherHashMap);

        /**
         * To find if HashMap is empty (or has no pair stored in it OR has size equals to 0)
         * method: isEmpty()
         *
         * if HashMap is empty (or has no pair stored in it OR has size equals to 0)
         *      method returns true
         * otherwise
         *      method returns false
         */
        System.out.println("\nmethod - isEmpty()");

        boolean isWeatherHashMapEmpty = weatherHashMap.isEmpty();
        System.out.println("is weatherHashMap empty? -> "+isWeatherHashMapEmpty);
        System.out.println("Number of weather data stored in weatherHashMap -> "+weatherHashMap.size());
        System.out.println("weatherHashMap -> "+weatherHashMap);

        /**
         * To clear the HashMap
         *      OR
         * To empty the HashMap
         *      OR
         * To remove all pairs from HashMap
         * method: clear()
         */
        System.out.println("\nmethod - clear()");
        weatherHashMap.clear();
        System.out.println("using clear()-method on weatherHashMap");

        boolean isWeatherHashMapEmpty_AfterClear = weatherHashMap.isEmpty();
        System.out.println("\nis weatherHashMap empty, after clear()-method? -> "+isWeatherHashMapEmpty_AfterClear);
        System.out.println("Number of weather data stored in weatherHashMap -> "+weatherHashMap.size());
        System.out.println("weatherHashMap -> "+weatherHashMap);



    }
}
