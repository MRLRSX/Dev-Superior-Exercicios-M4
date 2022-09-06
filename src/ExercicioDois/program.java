package ExercicioDois;

import java.util.Locale;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entradaDados = new Scanner(System.in);
		System.out.println("SISTEMA PLANO CARTESIANO");
		System.out.println("INFORME X");
		int x = entradaDados.nextInt();
		System.out.println("INFORME Y");
		int y = entradaDados.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else {
				System.out.println("quarto");
			}
			x = entradaDados.nextInt();
			y = entradaDados.nextInt();
		}

		entradaDados.close();

	}
}
