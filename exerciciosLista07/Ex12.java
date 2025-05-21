package exerciciosLista07;
import java.util.Scanner;
public class Ex12 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int maior = Integer.MIN_VALUE;  // menor valor possível
	        int menor = Integer.MAX_VALUE;  // maior valor possível
	        int valor;

	        System.out.println("Digite valores positivos inteiros. Para sair, digite um número negativo.");

	        while (true) {
	            System.out.print("Digite um valor: ");
	            valor = scanner.nextInt();

	            if (valor < 0) {
	                break;  // sai do loop se o valor for negativo
	            }

	            if (valor > maior) {
	                maior = valor;
	            }
	            if (valor < menor) {
	                menor = valor;
	            }
	        }

	        if (maior == Integer.MIN_VALUE && menor == Integer.MAX_VALUE) {
	            System.out.println("Nenhum valor positivo foi informado.");
	        } else {
	            System.out.println("Maior valor informado: " + maior);
	            System.out.println("Menor valor informado: " + menor);
	        }

	        scanner.close();
	    }
}
