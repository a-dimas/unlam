package mathunlam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatrizMath {
	double matriz[][];
	public MatrizMath() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrizMath matriz = new MatrizMath();
		matriz.Cargar("C:\\Users\\a.dimas.aguirre\\Dropbox\\UNLaM\\PrograAvanzada\\UNLaM\\src\\mathunlam\\matriz1.in");
		System.out.println(matriz.toString());
	}

	@Override
	public String toString() {
		String salida = "[\n";
		
		for (double fila[]: matriz){
			for (double celda: fila){
				salida = salida + celda + " ";
			}
			salida = salida + "\n";
		}
		
		return salida + "\n]";
	}

	public void Cargar(String file){
		File entrada = new File(file);
		try {
			Scanner sc = new Scanner(entrada);
			String lectura = "";
			int filas, columnas;
			int fila, columna;
			filas = sc.nextInt();
			columnas = sc.nextInt();
			matriz = new double[filas][columnas];
			
			for (int i = 0; i < filas * columnas; i++){
				
				fila = sc.nextInt();
				columna = sc.nextInt();
					
				matriz[fila][columna] = sc.nextDouble();
					
				
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
