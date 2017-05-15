package pract2a;

import java.util.ArrayList;

public class Mesada implements Comparable<Mesada>{

		private int ancho, largo, area;
		public Mesada() {
			ancho = 1; 
			largo = 1;
			area = 1;
		}	
		
		public int compareTo(Mesada otra){
			if (area < otra.area) 
				return -1;
			if (area > otra.area)
				return 1;
			return 0;
		}
		
		public boolean leEntra(Mesada otra){
			return 	otra.largo <= largo && otra.ancho <= ancho ||
					otra.largo <= ancho && otra.ancho <= largo;
		}
		
		public Mesada(int a, int l) {
			ancho = a;
			largo = l;
			area = ancho * largo;
		}
		
		public String toString(){
			return "a " + ancho + " X " + largo + " l - A=" + area + '\n';
		}

	public static void main(String[] args) {
		int cant = 5;
		ArrayList<Mesada> mesadas = new ArrayList<Mesada>();
		for (int i = 0; i < cant; i++) {
			mesadas.add(new Mesada((int) (Math.random() * 17 + 4),  (int) (Math.random() * 22) ));
		}
		System.out.println(mesadas.toString());
		mesadas.sort(null);
		System.out.println(mesadas.toString());
		Mesada.acomodar(mesadas);
		
	}

	private static void acomodar(ArrayList<Mesada> mesadas) {
		Mesada queNoEntra;
		ArrayList<ArrayList<Mesada>> pilas = new ArrayList<ArrayList<Mesada>>();
		pilas.add(mesadas);
		
		for (Mesada mesadaActual : mesadas) {
			Mesada mesadaSiguiente = mesadas.get( mesadas.indexOf(mesadaActual) + 1);
			//si no puede contener a la siguiente, tengo que agregarlo a otra pila:
			if ( !mesadaActual.leEntra(mesadaSiguiente)) {
				queNoEntra = mesadaSiguiente;
			//¿hay otra pila? 
			    // "no -> crearla y meterlo ahí
				
				if (pilas.size() == 1) {
					pilas.add(new ArrayList<Mesada>());
					pilas.get(1).add( mesadas.remove(mesadas.indexOf(queNoEntra)));
				}
				/**
					sí -> buscar en las sucesivas pilas desde index 1 hasta la última
					dónde puedo meterlo. si es necesario, crear una más
					*/
				else{
					int idxPila = 1, ultimaPila;
					Mesada ultimoDeLaPila;
					ArrayList<Mesada> pila;
					while ( queNoEntra != null && idxPila < pilas.size() - 1) {
						pila = pilas.get(idxPila);
						ultimoDeLaPila = pila.get(pila.size() - 1);
						
						if (ultimoDeLaPila.leEntra(queNoEntra)) {
							pila.add(queNoEntra);
							queNoEntra = null;
						}
						
						idxPila++;
					}
					/// si recorrí todas las pilas y no pude meterlo, creo una pila nueva
					if (queNoEntra != null){
						pilas.add(new ArrayList<Mesada>());
						ultimaPila = pilas.indexOf(pilas.size() - 1);
						pilas.get(ultimaPila).add(queNoEntra);
						queNoEntra = null;
					}
				}	
			}
		}
	}

}
