
package conversiones;
public class Conversiones {
    //método que convierte grados Celsius a Fahrenheit
        public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32; //Se realiza la conversión
        return fahrenheit;
    }
    //método que convierte grados Fahrenheit a Celsius.
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9; //Se realiza la conversión
        return celsius;
    }

    public static void main(String[] args) {
        double celsius = 30.0;
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " grados Celsius es igual a " + fahrenheit + " grados Fahrenheit.");

        double newFahrenheit = 86.0;
        double newCelsius = fahrenheitToCelsius(newFahrenheit);
        System.out.println(newFahrenheit + " grados Fahrenheit es igual a " + newCelsius + " grados Celsius.");
    }

    }
