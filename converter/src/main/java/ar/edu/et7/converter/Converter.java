package ar.edu.et7.converter;

public class Converter {

    public static float CelsiusToFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static float FahrenheitToCelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
