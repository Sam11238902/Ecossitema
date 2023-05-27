package Ecossistema;

import java.util.Random;

public class Peixe extends Animal{
	
	public Peixe genPosicao() {
		return new Peixe();		
	}

	public  boolean aceitarMover() {
	
	Random random = new Random();
	int ran = random.nextInt(2);
	
	if(ran == 1) {
		return true;
	}
	
	else  {
		return false;
	}
	
	}
	

	public String toString() {
	
		return "Peixe";
	}
}
