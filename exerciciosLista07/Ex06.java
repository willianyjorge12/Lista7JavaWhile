package exerciciosLista07;
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base (B): ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente (E): ");
        int expoente = scanner.nextInt();

        int resultado = 1;

        if (expoente < 0) {
            System.out.println("Expoente negativo não suportado neste programa.");
        } else {
            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }
            System.out.println(base + " elevado a " + expoente + " = " + resultado);
        }

        scanner.close();
    }
}
