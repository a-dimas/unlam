package tests;

import juego.*;
public class PistoleroTest {

	public static void main(String[] args) {

		Colt45 fierro = new Colt45();
		Derringer armafragil = new Derringer();
		
		Alguacil algua = new Alguacil(0, fierro);
		Renegado eameo = new Renegado(15, armafragil);
		
		while(algua.estaVivo() && eameo.estaVivo()){
			algua.jugar(eameo);
			eameo.jugar(algua);
		}
		
		System.out.println("Alguacil vivo: " + algua.estaVivo());
		System.out.println("Rengado vivo: " + eameo.estaVivo());
		
	}

}
