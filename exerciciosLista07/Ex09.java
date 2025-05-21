package exerciciosLista07;
import java.util.Scanner;
public class Ex09 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double soma = 0;

	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o valor número " + i + ": ");
	            double valor = scanner.nextDouble();
	            soma += valor;
	        }

	        double media = soma / 10;

	        System.out.println("Somatório dos valores: " + soma);
	        System.out.println("Média aritmética: " + media);

	        scanner.close();
	    }
}
