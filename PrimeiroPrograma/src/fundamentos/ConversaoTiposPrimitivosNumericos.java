package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	
	public static void main(String[] args) {
		
		
		double a = 1; //conversão implícita
		System.out.println(a);
		
		float b = (float) 1.123456789; // conversão explícita ( cast )
		System.out.println(b);
		
		int c = 260;
		byte d =(byte) c; //conversão explícita ( cast )
		System.out.println(d);
		
		double e = 1.99999999;
		int f = (int) e; //conversão explícita ( cast )
		System.out.println(f);
	}
	
}
