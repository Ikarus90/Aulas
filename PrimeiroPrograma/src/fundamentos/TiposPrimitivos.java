package fundamentos;

public class TiposPrimitivos {
	
	
	public static void main(String[] args) {
		
		
		// Tipos Numéricos Inteiros
		byte anosdeempresa = 23;
		short numerodevoos = 542;
		int id = 56789;
		long pontosacumulados = 3_234_845_223L;
		
		//Tipos Numéricos Reais
		float salario = 11_445.44F;
		double vendasacumuladas = 2_991_797_103.01;
		
		//Tipo Booleano
		boolean estadeferias = false; // true
		
		// Tipo Caractere
		char status = 'A'; //Ativo 
		
		// Dias de Empresa
		System.out.println(anosdeempresa * 365);
		
		//Numero de Viagens
		System.out.println(numerodevoos / 2);
		
		//Pontos por Real
		System.out.println(pontosacumulados / vendasacumuladas);
		
		System.out.println(id + " Ganha -->" + salario);
		System.out.println("Férias? " + estadeferias);
		System.out.println("Status: " + status);
		
	}

}
