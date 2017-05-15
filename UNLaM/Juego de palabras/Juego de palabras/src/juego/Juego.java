package juego;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Juego {

	char[][] h;
	char[][] v;
	String[] palabras;
	
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println();
		String ruta  = "C:\\Users\\laboratorios\\Documents\\WorkSpace\\Juego de palabras\\src\\juego\\rapigramaFatiga.in";
		Juego juego = new Juego();
		juego.cargar(ruta);
		
		
		Calendar ini = new GregorianCalendar();
		juego.buscar();
		Calendar fin = new GregorianCalendar();
		
		long diff = fin.getTimeInMillis() - ini.getTimeInMillis();
		
		System.out.println(diff);
		
	}
	
	public void mostrar(int index, String direccion){
		//System.out.println(index + " " + direccion);
	}
	
	public void buscar(){
		for(int j=0; j<palabras.length; j++){
			String palabra = palabras[j];
			int index = j+1;
			
			for(int i=0; i<h.length; i++){

				boolean E = String.valueOf(h[i]).contains(palabra);
				if(E){ mostrar(index, "E"); break; }

				boolean O = (new StringBuilder(String.valueOf(h[i])).reverse().toString()).contains(palabra);
				if(O){ mostrar(index, "O"); break; }

				boolean S = String.valueOf(v[i]).contains(palabra);
				if(S){ mostrar(index, "S"); break; }
				
				boolean N = (new StringBuilder(String.valueOf(v[i])).reverse().toString()).contains(palabra);
				if(N){ mostrar(index, "N"); break; }
				
			}
		}
	}
	
	public void cargar(String path) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(path));
		
		sc.useLocale(Locale.ENGLISH);
		
		int d = sc.nextInt();
		int p = sc.nextInt();
		String line = sc.nextLine();
		
		h = new char[d][d];
		v = new char[d][d];
		
		for (int i = 0; i < d; i++) {
			line = sc.nextLine();

			for (int j = 0; j < d; j++){
				h[i][j] = line.charAt(j);
				v[j][i] = line.charAt(j);
			}
		}
		
		palabras = new String[p];
		
		for(int i=0; i<p; i++){
			palabras[i] = sc.nextLine();
		}
		
		sc.close();
		
	}
	

}
