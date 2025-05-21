package exerciciosLista07;
import java.util.Scanner;
public class Ex11 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double areaTotal = 0.0;
	        String resposta;

	        do {
	            System.out.print("Digite o nome do cômodo: ");
	            String nome = scanner.nextLine();

	            System.out.print("Digite a largura do " + nome + " (em metros): ");
	            double largura = Double.parseDouble(scanner.nextLine());

	            System.out.print("Digite o comprimento do " + nome + " (em metros): ");
	            double comprimento = Double.parseDouble(scanner.nextLine());

	            double area = largura * comprimento;
	            areaTotal += area;

	            System.out.printf("Área do %s: %.2f m²%n", nome, area);

	            System.out.print("Deseja continuar calculando outros cômodos? (SIM/NAO): ");
	            resposta = scanner.nextLine().trim().toUpperCase();

	        } while (!resposta.equals("NAO"));

	        System.out.printf("Área total acumulada da residência: %.2f m²%n", areaTotal);

	        scanner.close();
	    }
}
