package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase());
		
		String x = "Igor".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
	
	//Tipos primitivos não tem o operador "."
		
		int a = 3;
		System.out.println(a);
	
	
	
	
	}

}
