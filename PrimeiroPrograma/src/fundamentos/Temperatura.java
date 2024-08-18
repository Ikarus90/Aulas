package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		int F = 85;
		final int ajuste = 32;
		final double mult = 5/9.0;
		double C;
		
		C = (F - ajuste) * mult;
		
		System.out.println("A Temperatura é: " + C + "°C");
		
		
		
	}

}
