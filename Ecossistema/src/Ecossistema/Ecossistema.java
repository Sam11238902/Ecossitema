package Ecossistema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ecossistema {

	ArrayList<Posicoes> ecossistema = new ArrayList<>();
	Posicoes[] gen = { new Urso(), new Peixe(), new Vazio() };
	int quantPeixes;
	int quantUrso;
	boolean ganhou = false;
	int quantVazio;
	
	

	public Ecossistema() {
		gerarEcossistema();
	}

	private void gerarEcossistema() {
		Random ran = new Random();
		
		
		ecossistema.add(gen[0].genPosicao());

		ecossistema.add(gen[0].genPosicao());
		
		ecossistema.add(gen[1].genPosicao());
		ecossistema.add(gen[2].genPosicao());

		ecossistema.add(gen[2].genPosicao());
		ecossistema.add(gen[1].genPosicao());
		ecossistema.add(gen[0].genPosicao());

		ecossistema.add(gen[0].genPosicao());
		
		
		ecossistema.add(gen[2].genPosicao());
		
		ecossistema.add(gen[1].genPosicao());
		ecossistema.add(gen[1].genPosicao());
		
		
		
		

		
		
		/*for (int x = 0; x < 15; x++) {
			int index = ran.nextInt(3);
			ecossistema.add(gen[index].genPosicao());

		} */
		
		

	}
	
	
	//ESSE METODO VERIFICA SE CADA URSO OU PEIXE QUER SE MOVER , SE ACEITAR ELE MOVE PARA UMA POSICAO VAZIA ALEATORIA
	
	public void movendoPosAleatorio() {
		
		for(int x = 0; x < ecossistema.size(); x++) { // PERCORRE A LISTA
		
			
			System.out.println("Passando na posição" + x);
			/*VAI PASSAR NAS POSICOES E VAI PERGUNTAR AO OBJETO SE ELE DESEJA 
			 * SE MOVER , SE DER TRUE CONTINUA O CÓDIGO , SE NÃO ELE NÃO FAZ NADA , 
			 * QUANDO FOR VAZIO ELE VAI RETORNAR FALSE , VISTO QUE O VAZIO NÃO É UM
			 *  PEIXE NEM UM URSO.
			 */
			if(ecossistema.get(x).aceitarMover() == true) { 
			
		
				Random ran = new Random();
				boolean estaVazio = false;
				int position;	
				
				System.out.println(" posição" + x + " é true");
				
				/* O CODIGO ABAIXO GERA UM NUMERO RANDOM , E VER SE NA POSICAO RANDOM
				 * NA LISTA É UMA INSTANCIA DE VAZIO , SE FOR ELE TROCA ATRAVES DE 
				 * COLLECTIONS.SWAP O LOCAL VAZIO PELO OBJETO QUE ACEITOU SE MOVER, 
				 * DESTA FORMA O LOCAL INICIAL DO OBJETO QUE ACEITOU MOVER-SE É PASSADO 
				 * VAZIO E ELE SE MOVE PARA A POSICAO VAZIA RANDOM , NOTE QUE FOI 
				 * CRIADO UMA VARIAVEL BOLEANA PARA QUE SE A POSICAO ALEATORIA NÃO FOR 
				 * VAZIA ELE NÃO FAZ NADA E FICA NO LOOP
				 * 
				 */
				
				while(estaVazio == false) {
				
				position = ran.nextInt(ecossistema.size());
				
				if (ecossistema.get(position) instanceof Vazio) {
					
					System.out.println("Vamos trocar a posicao" + x + "pela posicao"+ position);
					Posicoes animal = ecossistema.get(x);
					Collections.swap(ecossistema, x, position);	
					estaVazio = true;
					
				}
					
				}
				
			}			
		}
			
	}
	
	
	
	
	

	public void logica() {

		
		
		for (int x = 0; x < ecossistema.size() - 1; x++) { // PERCORRE A LISTA
			boolean create = false;
			 // CRIA VARIAVEL 
			
			
			
			
			// verifica se a posicao é uma instancia de Urso ou de Peixe , ele so vai testar com o proximo 
			// se for uma instancia de um desses dois.
			if ( ecossistema.get(x) instanceof Urso ||  ecossistema.get(x) instanceof Peixe) {
			//passou
			
			/*VERIFICA SE É UMA INSTANCIA DE URSO , SE FOR E A PROXIMA POSICAO FOR UMA INSTANCIA DE URSO , 
			 * ELE PERCORRE O ARRAYLIST DO ECOSSISTEMA E ADICIONA UM URSO NA PROXIMA POSICÃO VAZIA.
			 */
				
				
			if (ecossistema.get(x) instanceof Urso && ecossistema.get(x + 1) instanceof Urso) {
			
				System.out.println("Sim , são iguais, na posicao : " + x);
				
				
				for(int k = 0; k < ecossistema.size();k++) {
				
					if(ecossistema.get(k) instanceof Vazio && create == false) {
						ecossistema.remove(k);
						ecossistema.add(k, new Urso());
						create= true;
						break;
					}
					
				}
				
			}else if(ecossistema.get(x) instanceof Peixe && ecossistema.get(x + 1) instanceof Peixe) {
				
				for(int k = 0; k < ecossistema.size();k++) {
					
					if(ecossistema.get(k) instanceof Vazio && create == false) {
						ecossistema.remove(k);
						ecossistema.add(k, new Peixe());
						create= true;
						break;
					}
							
				}
				
				
			}else {
			
			}
			

			}
		}

	}

}

					
	

			

	
	

