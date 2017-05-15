package pedregal.dinamica;

public class Main {

	public static void main (String[] args){
		Pedregal pedregal = new Pedregal();
		pedregal.CrearTerreno(6,7);
		pedregal.CrearCasa(3,2);
		pedregal.cargarPiedras();
		
		pedregal.matriz = pedregal.crearMatriz();
		System.out.println(pedregal.toString());
		pedregal.mostrarMatriz();
		
		System.out.println(pedregal.resolverConFor());
	}
}
