package pedregal.dinamica;

public class Pedregal {

	protected int columnasTerreno;
	protected int filasTerreno;
	protected int columnasCasa;
	protected int filasCasa;
	protected int[][] terreno;
	protected int[][] casa;
	protected int[][] matriz;
	

	
	public void cargarPiedras(){
		
		int[][]piedras = {{1,1},{1,3},{1,5},{0,6},{2,2},{4,3},{4,1},{4,4},{5,5},{3,6}};
		for (int[] piedra : piedras){
			terreno[piedra[0]][piedra[1]] = 1;
		}			
	}
	
	public Pedregal() {
	}
	
	public void CrearCasa(int largo, int ancho){
		casa =  new int[filasCasa = largo][columnasCasa = ancho];
	}
	
	public void CrearTerreno(int filas, int columnas){
		terreno = new int[filasTerreno = filas][columnasTerreno = columnas];
	}
	
	public int[][] crearMatriz(){
		int[][] matrizSumas = new int[filasTerreno][columnasTerreno];
		int fila, columna;
		matrizSumas[0][0] = terreno[0][0];
		
		for (columna = 1; columna < columnasTerreno; columna++)
			matrizSumas[0][columna] += terreno[0][columna] + matrizSumas[0][columna-1];
		
		for (fila = 1; fila < filasTerreno; fila++)
			matrizSumas[fila][0] += terreno[fila][0] + matrizSumas[fila-1][0];
		
		for (columna = 1; columna < columnasTerreno; columna++)
			for (fila = 1; fila < filasTerreno; fila++)
				matrizSumas[fila][columna] = 
					terreno[fila][columna] - 
					matrizSumas[fila-1][columna-1] +
					matrizSumas[fila-1][columna] +
					matrizSumas[fila][columna-1];
		
		return matrizSumas;
	}
	
	protected void mostrarMatriz(){
		String linea;
		for (int filas = 0; filas < filasTerreno; filas++){
			linea = "";
			for (int columnas = 0; columnas < columnasTerreno; columnas++)
				linea += matriz[filas][columnas] + " ";
			System.out.println(linea);
		}		
	}
	
	
	public String toString() {
		String result = "";
		for (int filas = 0; filas < filasTerreno; filas++){

			for (int columnas = 0; columnas < columnasTerreno; columnas++)
				result += terreno[filas][columnas] + " ";
			result += '\n';			
		}
		
		return result;
	}

	protected String resolverConFor() {
		int filasInvertida = columnasCasa,
				columnasInvertida = filasCasa;
		//primer celda
		if (matriz[filasCasa][columnasCasa] == 0 )
			return filasCasa + ", " + columnasCasa;
		//invertida
		if (matriz[filasInvertida][columnasInvertida] == 0 )
			return filasInvertida + ", " + columnasInvertida;
		
		
		int filas, columnas;
		//primer columna
		for (filas = filasCasa+1; filas < filasTerreno; filas++){
			if (
					+ matriz[filas][columnasCasa-1]
					- matriz[filas - filasCasa][columnasCasa -1]
					== 0
							){
				return filas + ", " + (columnasCasa-1);
			}
		}
		
		//primer fila
		for (columnas = columnasCasa+1; columnas < columnasTerreno; columnas++){
			if (
					+ matriz[filasCasa - 1][columnas]
					- matriz[filasCasa - 1][columnas - columnasCasa]
					== 0
							){
				return (filasCasa-1) + ", " + columnas;
			}
		}
		
		//invertidas:
		//primer columna
		for (filas = filasInvertida+1; filas < filasTerreno; filas++){
			if (
					+ matriz[filas][columnasInvertida-1]
					- matriz[filas - filasInvertida][columnasInvertida -1]
					== 0
							){
				return filas + ", " + (columnasInvertida-1);
			}
		}
		
		//primer fila
		for (columnas = columnasInvertida+1; columnas < columnasTerreno; columnas++){
			if (
					+ matriz[filasInvertida - 1][columnas]
					- matriz[filasInvertida - 1][columnas - columnasInvertida]
					== 0
							){
				return (filasInvertida-1) + ", " + columnas;
			}
		}
		
		
		
		
		//matriz interna		
		for (filas = filasCasa; filas < filasTerreno; filas++){			
			for (columnas = columnasCasa; columnas < columnasTerreno; columnas++){				
				if (
						+ matriz[filas][columnas] 
						+ matriz[filas - filasCasa][columnas - columnasCasa] 
						- matriz[filas][columnas - columnasCasa]
						- matriz[filas - filasCasa][columnas]
								 == 0){
					return filas + ", " + columnas;
				}				
			}
		}
		
		//matriz interna invertida
		for (filas = filasInvertida; filas < filasTerreno; filas++){			
			for (columnas = columnasInvertida; columnas < columnasTerreno; columnas++){				
				if (
						+ matriz[filas][columnas] 
						+ matriz[filas - filasInvertida][columnas - columnasInvertida] 
						- matriz[filas][columnas - columnasInvertida]
						- matriz[filas - filasInvertida][columnas]
								 == 0){
					return filas + ", " + columnas;
				}				
			}
		}
		
		
		return "NO";
	}
	
	
}
