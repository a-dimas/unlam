package fibonacci;

import java.util.Arrays;

public class Fibonacci {
//https://math.stackexchange.com/questions/1834242/derivation-of-fibonacci-logn-time-sequence
	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String args[]){
		
		int max = 5;
		Matrinacci(5);
		
		for (int i = 0; i < max; i++) {
			//System.out.println("Iter de " + i + ": " + Iteranacci(i));
			//System.out.println("Recu de " + i + ": " + Recursinacci(i));
		}
	}
	
	public static void Matrinacci(long n){
		int[][] matriz = {{1,1},{1,0}}, nueva;
		System.out.println(Arrays.toString(matriz[0]));
		System.out.println(Arrays.toString(matriz[1]));
		nueva = elevar(matriz, n);
		System.out.println(Arrays.toString(nueva[0]));
		System.out.println(Arrays.toString(nueva[1]));
	}
	
	private static int[][] elevar(int matriz[][], long n){
		int[][] res = {{1,1},{1,0}};
		for (int f = 0; f < 2; f++)
			for (int c = 0; f < 2; f++)
				res[f][c] = 9;
		for (int i = 0; i < n; i++){
			res[0][0] = matriz[0][0] * matriz[0][0] + matriz[0][1] * matriz[1][0];
			res[0][1] = matriz[0][0] * matriz[0][1] + matriz[0][1] * matriz[1][1];
			res[1][0] = matriz[1][0] * matriz[0][0] + matriz[1][1] * matriz[1][0];
			res[1][1] = matriz[1][0] * matriz[0][1] + matriz[1][1] * matriz[1][1];
		}
		return res;
		
	}
	
	public static long Recursinacci(long n){
		if (n < 3) return 1;
		return Recursinacci(n - 1) + Recursinacci(n - 2);
	}
	
	public static long Iteranacci(int n){
		if (n < 3) return 1;
		
		long anterior = 1;
		long fibo = 0;
		
		for (int i = 0; i < n; i++){
			fibo += anterior;
			anterior = fibo - anterior;
		}
		
		return fibo;
	}

}
