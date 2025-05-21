package exerciciosLista07;
import java.util.Scanner;
public class Ex08 {
    public static void main(String[] args) {
        System.out.println("Celsius\tFahrenheit");

        for (int celsius = 10; celsius <= 100; celsius += 10) {
            double fahrenheit = (celsius * 9.0 / 5) + 32;
            System.out.printf("%d\t%.1f%n", celsius, fahrenheit);
        }
    }
}
