package longitud.mas.larga;

import java.util.ArrayList;

public class Ejercicio {
	public static void main(String[] args){
		resolver();
	}
	
	public static void resolver(){
		int[] vector= {8,5,4,3,7,8,4,10,8,6,5,6,2,4,7,11};
		int longitud = vector.length;
		ArrayList<Integer> maslarga = new ArrayList<Integer>();
		ArrayList<Integer> solucion = new ArrayList<Integer>();
		solucion.add(vector[longitud - 1]);
		 for (int i = vector.length - 2; i >= 0; i++){
			 for(int j = i; j < longitud - i; i++){
				 if(vector[i] < vector[i+1]){
					 solucion.add(vector[i]);
				 }
			 }
			 if(solucion.size() > maslarga.size()){
				 maslarga = solucion;
			 }
			 solucion.clear();
		 }
		 
		 System.out.println(maslarga);
	}
	
}


