package Class13.Class_Concept_Pkg;

public class MyStringMethods {

    public static String toTitleCase(String userInput) {
        String result = "";
        String[] sentenceWords = userInput.split(" ");
        for (String word : sentenceWords) {
            result = result + word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        return result;
    }

}
