package Class13.Class_Concept_Pkg;

public class MyArrayMethods {

    public static int getArrayTotal(int[] userArray) {
        int resultValue = 0;
        for (int value : userArray) {
            resultValue += value;
        }
        return resultValue;
    }

    public double getArrayAverage(int[] userArray) {
        double total = 0;
        double average = 0.0;
        for (int value : userArray) {
            total += value;
        }
        average = total/userArray.length;
        return average;
    }

}
