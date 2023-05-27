package Ecossistema;

import java.util.Random;

public class Urso extends Animal{

	
	public Posicoes genPosicao() {
		
		return new Urso();
	}
	
	public  boolean aceitarMover() {
		
	Random random = new Random(2);
	int ran = random.nextInt();
	
	if(ran == 1) {
		return true;
	}
	
	else  {
		return false;
	}
	
	}
	
	
	public String toString() {
		
		return "Urso";
	}

}
