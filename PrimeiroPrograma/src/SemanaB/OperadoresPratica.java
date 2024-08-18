package SemanaB;

public class OperadoresPratica {

	public static void main(String[] args) {
		
		boolean trab1 = false;
		boolean trab2 = false;
		
		boolean CompTV50 = trab1 && trab2;
		boolean CompTV32 = trab1 ^ trab2;
		boolean CompSorvete = trab1 || trab2;
		boolean MaisSaudavel = !CompSorvete;
		
		System.out.println("Comprou TV 50\"? " + CompTV50);
		System.out.println("Comprou TV 32\"? " + CompTV32);
		System.out.println("Comprou Sorvete? " + CompSorvete);
		System.out.println("Mais Saudável? " + !CompSorvete);
		
		
	}
	
	
}
