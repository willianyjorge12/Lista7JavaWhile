package exerciciosLista07;
import java.util.Scanner;
public class Ex07 {
	  public static void main(String[] args) {
	        int termos = 15;
	        int primeiro = 1;
	        int segundo = 1;

	        System.out.print("Série de Fibonacci até o " + termos + "º termo: ");

	        for (int i = 1; i <= termos; i++) {
	            if (i == 1 || i == 2) {
	                System.out.print("1");
	            } else {
	                int proximo = primeiro + segundo;
	                System.out.print(", " + proximo);
	                primeiro = segundo;
	                segundo = proximo;
	            }
	        }
	    }
}
