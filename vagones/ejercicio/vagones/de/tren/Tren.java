package vagones.de.tren;

import java.util.ArrayList;
import java.util.Hashtable;

public class Tren {
	private int maxagg;
	private int numVagones;
	public Hashtable<Animal, Integer> vagones = new Hashtable<Animal, Integer>();
	
	public static void main(String[] args){

		Tren tren = new Tren(100);		
		ArrayList<Animal> animales = new ArrayList<Animal>();

		animales.add(new Animal("pantera", 2000));
		animales.add(new Animal("leon", 1500));
		animales.add(new Animal("elefante", 200));
		animales.add(new Animal("zorro", 50));
		animales.add(new Animal("perro", 160));
		animales.add(new Animal("mono", 5));
		animales.add(new Animal("liebre", 20));
		animales.sort(null);
		
		int i = 0, j = 0;
		while (i < animales.size() - 1 && j < animales.size()){
			j = i + 1;
			while ( j < animales.size() && animales.get(i).getAgg() - animales.get(j).getAgg() < tren.maxagg )
				j++;
			
			if (j == i+1){
				//un vagón propio para este violento				
				tren.vagones.put(animales.get(i), ++tren.numVagones);
			}
			else{
				//un vagón para i... j-1
				tren.numVagones++;
				for(int k = i; k < j; k++){
					tren.vagones.put(animales.get(k), tren.numVagones);
				}
			}
			i = j;
			
		}
		
		System.out.println(tren.vagones);
		
		

	}
	
	public Tren(int m) {
		maxagg = m;
		numVagones = 0;
	}

}

