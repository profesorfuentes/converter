package ar.edu.et7.converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("\n--- Menú de Conversión de Temperatura ---");
            System.out.println("1 - Celsius a Fahrenheit");
            System.out.println("2 - Fahrenheit a Celsius");
            System.out.println("S - Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.next().charAt(0);

            switch (opcion) {
                case '1':
                    System.out.print("Ingrese la temperatura en Celsius: ");
                    float celsius = scanner.nextFloat();
                    float fahrenheitResult = Converter.CelsiusToFahrenheit(celsius);
                    System.out.println("Resultado: " + celsius + " °C = " + fahrenheitResult + " °F");
                    break;
                case '2':
                    System.out.print("Ingrese la temperatura en Fahrenheit: ");
                    float fahrenheit = scanner.nextFloat();
                    float celsiusResult = Converter.FahrenheitToCelsius(fahrenheit);
                    System.out.println("Resultado: " + fahrenheit + " °F = " + celsiusResult + " °C");
                    break;
                case 'S':
                case 's':
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 'S' && opcion != 's');

        scanner.close();
    }
}
