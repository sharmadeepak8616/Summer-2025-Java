package Class3;

public class Homework1 {
    public static void main(String[] args) {

        /**
         * Formula sheet -> https://www.rapidtables.com/convert/temperature/fahrenheit-to-celsius.html?x=74
         *
         * Temperature in Fahrenheit = 74°F
         *  Celsius = (Fahrenheit - 32) / 1.8
         * Temperature in Celsius = 23.33°C
         *
         */
        // F -> C
        double fTemp = 74;
        // Celsius = (Fahrenheit - 32) / 1.8
        double cTemp = (fTemp - 32) / 1.8;
        System.out.println(fTemp+"°F is equals to "+cTemp+"°C");

        // F -> K
        // T(K) = (fTemp + 459.67) × 5/9.0
        double kTemp = (fTemp + 459.67) * (5/9.0);
        System.out.println(fTemp+"°F is equals to "+kTemp+"°K");

        /**
         * C -> F
         * C -> K
         *
         * K -> F
         * K -> C
         */

    }
}
