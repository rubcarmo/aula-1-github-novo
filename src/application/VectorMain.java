package application;

public class VectorMain {
	
	public static void main(String args[]) {
	
	String[] vect = new String[] {"Maria", "Bob", "Joao"};
	
		for(int i=0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		for (String x: vect) {
			System.out.println(x);
		}
	}
	
}
