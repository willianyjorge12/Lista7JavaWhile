package exerciciosLista07;
import java.util.Scanner;
public class Ex05 {
	 public static void main(String[] args) {
	        int base = 3;

	        for (int expoente = 0; expoente <= 15; expoente++) {
	            int resultado = 1; // qualquer número elevado a 0 é 1

	            // multiplicar a base expoente vezes
	            for (int i = 1; i <= expoente; i++) {
	                resultado *= base;
	            }

	            System.out.println(base + " ^ " + expoente + " = " + resultado);
	        }
	    }
}
