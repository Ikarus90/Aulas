package EstruturasDeControle2;

import java.util.Scanner;

public class SwitchComBreake {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		
		String conceito = "";
		System.out.print("Informe a Nota: ");
		int nota = entrada.nextInt();
		
		switch(nota)
		{
		case 10:
			conceito = "S";
			break;
		case 9:
			conceito = "A+";
			break;
		case 8:
			conceito ="A";
			break;
		case 7:
			conceito = "B+";
			break;
		case 6:
			conceito = "B";
			break;
		case 5:
			conceito = "C+";
			break;
		case 4:
			conceito = "C";
			break;
		case 3:
			conceito = "D+";
			break;
		case 2:
			conceito = "E+";
			break;
		case 1:
			conceito = "E";
			break;
		case 0:
			conceito = "F";
			break;
		default:
			conceito = "Inválido ou Não Encontrado";
			break;
		}
		
		System.out.println("O Conceito é: "+ conceito);
		entrada.close();
	}
	
}
