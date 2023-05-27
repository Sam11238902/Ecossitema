package Ecossistema;

public class Vazio extends Posicoes{

	
	public Vazio genPosicao() {
	
		return new Vazio();
	}
	public String toString() {
		return "Vazio";
	}
	
	public boolean aceitarMover() {
		
		return false;
	}
}
