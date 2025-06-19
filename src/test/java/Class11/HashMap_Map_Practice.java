package Class11;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMap_Map_Practice {
    public static void main(String[] args) {
        HashMap<String, Double> weatherHashMap = new HashMap<>();

        System.out.println("weatherHashMap -> "+weatherHashMap);    // weatherHashMap -> {}
        weatherHashMap.put("NY", 90.8);
        weatherHashMap.put("NJ", 90.2);
        weatherHashMap.put("CA", 100.2);
        weatherHashMap.put("TX", 104.89);
        weatherHashMap.put("VI", 77.1);
        weatherHashMap.put("AL", 56.9);
        weatherHashMap.put("WI", 90.2);
        weatherHashMap.put("MI", 104.6);
        weatherHashMap.put("AK", 104.89);
        weatherHashMap.put("YZ", 56.9);

        System.out.println("Number of weather data stored in weatherHashMap -> "+weatherHashMap.size());
        System.out.println("weatherHashMap -> "+weatherHashMap);
        // weatherHashMap -> {YZ=56.9, WI=90.2, VI=77.1, TX=104.89, AK=104.89, NY=90.8, AL=56.9, NJ=90.2, MI=104.6, CA=100.2}

        /**
         * Find the temp value for a given state (ignore cases)
         *
         * if the given state is present in HashMap (ignore cases)
         *      print it's temp-value
         * otherwise
         *      print "State not found"
         */
        // weatherHashMap -> {YZ=56.9, WI=90.2, VI=77.1, TX=104.89, AK=104.89, NY=90.8, AL=56.9, NJ=90.2, MI=104.6, CA=100.2}

        System.out.println("\nFind the temp value for a given state (ignore cases)");
        System.out.println("weatherHashMap -> "+weatherHashMap);
        String findTempFor = "Vi";
        System.out.println("Given state -> "+findTempFor);
        Double foundTemp = 99999.99;
        Set<String> allStates = weatherHashMap.keySet();
        for(String state : allStates) {
            if (state.equalsIgnoreCase(findTempFor)) {
                foundTemp = weatherHashMap.get(state);
                break;
            }
        }
        if (foundTemp == 99999.99) {
            System.out.println("State ("+findTempFor+") not found");
        } else {
            System.out.println("Temp for "+findTempFor+" is -> "+foundTemp);
        }

        /**
         * Find the state with lowest temperature value
         */
        // weatherHashMap -> {YZ=56.9, WI=90.2, VI=77.1, TX=104.89, AK=104.89, NY=90.8, AL=56.9, NJ=90.2, MI=104.6, CA=100.2}
        System.out.println("\nFind the state with lowest temperature value");
        System.out.println("weatherHashMap -> "+weatherHashMap);
        Set<String> lowestTempStates = new HashSet<>();
        Double lowestTempValue = 9999.99;

        Set<String> allStateNames = weatherHashMap.keySet();
        for(String state : allStateNames) {
            Double tempValue = weatherHashMap.get(state);
            if (tempValue <= lowestTempValue) {
                lowestTempValue = tempValue;
                lowestTempStates.add(state);
            }
        }
        System.out.println("Lowest temp value -> "+lowestTempValue);
        System.out.println("Lowest temp state -> "+lowestTempStates);
















    }
}
