package ExercicioTres;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
        
		Locale.setDefault(Locale.US);
		System.out.println("SISTEME DE COMBUSTIVEIS ");
		Scanner entradaDados = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.println("INFORME O CODIGO DO COMBUSTIVEL");
		int tipo = entradaDados.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool = alcool + 1;
			}
			else if (tipo == 2) {
				gasolina = gasolina + 1;
			}
			else if (tipo == 3) {
				diesel = diesel + 1;
			}
			
			System.out.println("INFORME O CODIGO DO COMBUSTIVEL");
			tipo = entradaDados.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		entradaDados.close();
	}
}
