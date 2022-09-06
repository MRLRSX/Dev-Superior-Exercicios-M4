package ExercicioUm;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       Scanner entradaDados = new Scanner(System.in);
       
       System.out.println("SISTEMA DE VERIFICAÇÃO DE SENHA ....");
       System.out.println("INFORME A SENHA ...");
       String senha = entradaDados.nextLine();
       
       while(!senha.equalsIgnoreCase("lucasRocha@2022")){
    	   System.out.println("senha incorreta digite novamente");
    	   senha = entradaDados.nextLine();
       }
       System.out.println("LOGON SUCESS FULL ....");
       entradaDados.close();
	}
}
