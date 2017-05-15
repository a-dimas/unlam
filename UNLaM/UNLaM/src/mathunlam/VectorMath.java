package mathunlam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VectorMath {
	double vector[];
	public VectorMath() {
		// TODO Auto-generated constructor stub
		
	}
	private void Cargar(String file){
		File entrada = new File(file);
		try {
			Scanner sc = new Scanner(entrada);
			int dimension = sc.nextInt();
			this.vector = new double[dimension];
			
			for (int i = 0; i < dimension; i++){
				vector[i] = sc.nextDouble();
			}
			
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Override
	public String toString(){
		String salida = "[";
		for (int i = 0; i < vector.length - 1; i++){
			salida = salida.concat(Double.toString(vector[i]) + ", ");
		}
		
		salida = salida.concat(Double.toString(vector[vector.length - 1]) + "]");
		
		return salida;
	
	}
	
	private VectorMath suma(VectorMath v){
		if (v.vector.length == this.vector.length){
			VectorMath resultado = new VectorMath();
			resultado.vector = new double[vector.length];
			for (int i = 0; i < v.vector.length; i++){
				resultado.vector[i] = v.vector[i] + vector[i];				
			}
			return resultado;
		}
		else return null;
	}
	
	private VectorMath resta(VectorMath v){
		if (v.vector.length == this.vector.length){
			VectorMath resultado = new VectorMath();
			resultado.vector = new double[vector.length];
			for (int i = 0; i < v.vector.length; i++){
				resultado.vector[i] = vector[i] - v.vector[i] ;				
			}
			return resultado;
		}
		else return null;
	}
	
	public double ProdEscalar(VectorMath v){
		if (v.vector.length != vector.length) return 0;
		
		double resultado = 0;
		
		for (int i = 0; i < v.vector.length; i++){
			resultado = resultado + (vector[i] * v.vector[i]);
		}
		
		return resultado;
	}
	
	public VectorMath Estirar(double escalar){
		if (vector == null || vector.length == 0) return null;
		
		VectorMath resultado = new VectorMath();
		resultado.vector = new double[vector.length];
		
		for (int i = 0; i < vector.length; i++)
			resultado.vector[i] = vector[i] * escalar;
		
		return resultado;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			VectorMath v1 = new VectorMath();
			VectorMath v2 = new VectorMath();
			VectorMath v3;
			
			v1.Cargar("C:\\Users\\a.dimas.aguirre\\Dropbox\\UNLaM\\PrograAvanzada\\UNLaM\\src\\enClase\\myVector.in");
			v2.Cargar("C:\\Users\\a.dimas.aguirre\\Dropbox\\UNLaM\\PrograAvanzada\\UNLaM\\src\\enClase\\vector2.in");
			
			v3 = v1.suma(v2);
			System.out.println("a ver");
			System.out.println(v3.toString());
			v3 = v1.resta(v2);
			System.out.println(v3.toString());
			System.out.println(v1.ProdEscalar(v2));
			v3 = v2.Estirar(18);
			System.out.println(v3.toString());
	}

}
