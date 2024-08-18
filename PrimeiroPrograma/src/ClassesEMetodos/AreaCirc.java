package ClassesEMetodos;

public class AreaCirc {
	
	
	double raio;
	static final double PI = 3.1415;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
			
		
	}
	
	double area() {
		return PI * raio * raio;
		
	}
	
	double area() {
		return PI * Match.pow(raio, 2);
	}
	
	static double area() {
		return PI * Match.pow(raio, 2);
	}

}
