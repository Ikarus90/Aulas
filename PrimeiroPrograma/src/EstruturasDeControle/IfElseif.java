package EstruturasDeControle;

import java.util.Scanner;

public class IfElseif {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		
		var nota = entrada.nextDouble();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota Inválida!");
		}	
		else if(nota > 9.9 ) {
			System.out.println("Conceito S");
		}
			else if(nota >= 8.1) {
				System.out.println("Conceito A");
			}
			else if(nota >= 6.1) {
				System.out.println("Conceito B");
			}
			else if (nota >= 5.1) {
				System.out.println("Conceito C");
			}
			
			else if (nota <= 5) {
				System.out.println("Conceito D");
			}
			
			
	System.out.println("Encerrando Programa!");
	entrada.close();
	
	}
	
	
}
