package exerciciosLista07;
import java.util.Scanner;
public class Ex03 {
	 public static void main(String[] args) {
	        int soma = 0;

	        for (int i = 2; i <= 500; i += 2) {
	            soma += i;
	        }

	        System.out.println("A soma dos números pares entre 1 e 500 é: " + soma);
	    }
}
