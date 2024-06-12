package org.example.Challenges.ConverttheTemperature2469;

public class ConverttheTemperature2469 {
    public double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.80 + 32.00;

        double[] temperature = {kelvin, fahrenheit};

        return temperature;

    }
}


