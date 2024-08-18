package SemanaB;

public class OperadoresRelacionais {
	
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		System.out.println(3 > 4);
		System.out.println(3 >= 4);
		System.out.println(3 < 4);
		System.out.println(3 <= 4);
		
		var nota = 7.3;
		boolean bomComportamento = true;
		boolean PassouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && PassouPorMedia;
		
		System.out.println("Tem Desconto? " + temDesconto);
		
		
		
		
		
	}

}
