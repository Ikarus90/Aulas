package SemanaB;

public class BOperadoresLogicos {
	
	public static void main(String[] args) {
		
		boolean cond1 = true;
		boolean cond2 = 3 > 7;
		
		System.out.println(cond1 && cond2);
		System.out.println(cond1 || cond2);
		System.out.println(cond1 ^ cond2);
		System.out.println(!cond1);
		System.out.println(!cond2);
		
		System.out.println("\nTabela do E"); 
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false  && true);
		System.out.println(false && false);
		
		System.out.println("\nTabela do Ou (OR)"); 
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false  || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela Verdade ou Exclusivo (XOR)"); 
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

		System.out.println("\nTabela Verdade NOT "); 
		System.out.println(!true);
		System.out.println(!false);
		
		
		
		
	}
	
	
	

}
