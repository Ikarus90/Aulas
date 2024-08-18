package SemanaB;

public class OperadoresTernarios {
	
	public static void main(String[] args) {
	
	double media = 4.9;
	
	String resultado = media >= 7.0 ? "Aprovado" : 
		"Em Recuperação";
		
		System.out.println("O Aluno está " + resultado);
		
		
		boolean bomComportamento = true;
		boolean PassouPorMedia = media >= 7 ;
		boolean temDesconto = bomComportamento && PassouPorMedia;
		String resultado2 = temDesconto ? "Sim" : "Não";
				
						
		System.out.println("Tem Desconto? " + resultado2);
		
		
		
	}
}
