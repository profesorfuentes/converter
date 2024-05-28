package ar.edu.et7.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ConverterTest {

    @Test
    public void testCelsiusToFahrenheit() {
        assertEquals(32.0f, Converter.CelsiusToFahrenheit(0), 0.0001);
        assertEquals(212.0f, Converter.CelsiusToFahrenheit(100), 0.0001);
        assertEquals(98.6f, Converter.CelsiusToFahrenheit(37), 0.0001);
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0.0f, Converter.FahrenheitToCelsius(32), 0.0001);
        assertEquals(100.0f, Converter.FahrenheitToCelsius(212), 0.0001);
        assertEquals(37.0f, Converter.FahrenheitToCelsius(98.6f), 0.0001);
    }
}
