package EstruturasDeControle2;
import java.util.Scanner;

public class DesafioWhile {



	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int QDN = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1)
		{
			System.out.print("Informe a Nota ( ou -1 p/ sair ): ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
			total += nota;
			QDN++;
			}
			
			else if( nota != -1) {
				System.out.println("Nota Inválida!!!");
			}
		}
		
		//Calcular a média
		double media = total / QDN;
		System.out.println("Média = " + media);
		
		
		
		entrada.close();
	}
	
	
}
