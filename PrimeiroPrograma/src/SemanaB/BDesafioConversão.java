package SemanaB;

import java.util.Scanner;

public class BDesafioConversão {
	
	public static void main(String[] args) {
		
	
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Informe o Primeiro Salário: ");
	String v1 = entrada.next().replace(",",".");

	System.out.print("Informe o Segundo Salário: ");
	String v2 = entrada.next().replace(",",".");
	
	System.out.print("Informe o Terceiro Salário: ");
	String v3 = entrada.next().replace(",",".");
	
	
	double s1 = Double.parseDouble(v1);
	double s2 = Double.parseDouble(v2);
	double s3 = Double.parseDouble(v3);
	
	double media = (s1 + s2 + s3) / 3;
	System.out.println("A Média dos Salários é: " + media);
	
	
	entrada.close();
	}
	
}
