//import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double temperatura1EmCelsius = Math.random() * 100;
        double temperatura2EmCelsius = Math.random() * 100;

        double temperatura1EmFahrenheit = converterParaFahrenheit(temperatura1EmCelsius);
        double temperatura2EmFahrenheit = converterParaFahrenheit(temperatura2EmCelsius);

        System.out.printf("Temperatura 1: %.1fºC são %.1fºF\n", temperatura1EmCelsius, temperatura1EmFahrenheit);
        System.out.printf("Temperatura 2: %.1fºC são %.1fºF\n", temperatura2EmCelsius, temperatura2EmFahrenheit);
    }

    public static double converterParaFahrenheit(double temperaturaEmCelsius) {
        double fator1 = 9.0 / 5.0;
        double fator2 = 32.0;
        return (temperaturaEmCelsius * fator1) + fator2;
    }
}
