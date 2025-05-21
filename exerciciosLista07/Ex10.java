package exerciciosLista07;
import java.util.Scanner;
public class Ex10 {
	  public static void main(String[] args) {
	        int soma = 0;
	        int quantidade = 0;

	        for (int i = 50; i <= 70; i++) {
	            if (i % 2 == 0) {
	                soma += i;
	                quantidade++;
	            }
	        }

	        double media = 0;
	        if (quantidade > 0) {
	            media = (double) soma / quantidade;
	        }

	        System.out.println("Soma dos valores pares entre 50 e 70: " + soma);
	        System.out.println("Média aritmética dos valores pares entre 50 e 70: " + media);
	    }
}
