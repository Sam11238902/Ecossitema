package Ecossistema;

public class main {
	public static void main(String[]args) {
		Ecossistema eco = new Ecossistema();
		
		for(int x = 0; x < eco.ecossistema.size(); x++) {
			
			System.out.println(eco.ecossistema.get(x).toString());
		}
		
		//eco.logica(); TESTA LOGICA
		
		
		System.out.println("*********************");
		
	
		eco.movendoPosAleatorio();
		
		
		for(int x = 0; x < eco.ecossistema.size(); x++) {
			
			System.out.println(eco.ecossistema.get(x).toString());
		}
		
		
		
	
		
		
	}
}
