package testes;

public class main {
	
	public static void main(String[]args) {
	
	coelho c1 = new coelho();
	gato g1 = new gato();
	
	
	
	Animall index = c1;
	
	
	if(index instanceof Animall) {
		System.out.println("Ele é um animal");
	}
		
		
	}
}
