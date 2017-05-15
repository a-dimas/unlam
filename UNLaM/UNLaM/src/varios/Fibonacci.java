package varios;


import static org.junit.Assert.*;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.Test;



public class Fibonacci {

	public Fibonacci() {
		// TODO Auto-generated constructor stub
		
	}

	public static void main(String[] args) {
	    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS");

		double testval = 60;
		Rec(1);
		System.out.println(dateFormat.format(new Date()));
		System.out.println(Iterativo2(testval));
		System.out.println(dateFormat.format(new Date()));
		System.out.println();
		
		System.out.println(dateFormat.format(new Date()));
		System.out.println(recurs(testval));
		System.out.println(dateFormat.format(new Date()));
}
	
	public static double recurs(double fibo){
		if (fibo < 2)
			return 1;
		return (recurs(fibo - 1) + recurs(fibo - 2));
	}
	
	public static double Recursivo2(double fibo, double max, double anterior){
		if (fibo == 1) {
			anterior = 1;
			return Recursivo2(2, max, anterior);			
		}
		if (fibo < max) {
			fibo = fibo + anterior;
			anterior = fibo - anterior;
			return Recursivo2 (fibo, max, anterior);
		}
		
		
		
		return fibo;
	}
	
	public static double Recursivo(double fibo){
		 if(fibo == 0)
		        return 0;
		    else if(fibo == 1)
		      return 1;
		   else
		      return Recursivo(fibo - 1) + Recursivo(fibo - 2);
		}
	public static double Iterativo2(double max){
		double fibo = 0;
		double anterior = 0;
		if (max < 2)
			return 1;
		for (double i = 1; i < max; i++){
			
			
			if (i == 1) {
				anterior = 1;
				fibo = 2;				
			}
			
			else {
				fibo = fibo + anterior;
				anterior = fibo - anterior;				
				}
			
			
		}
		
		return fibo;
	}

	
	public static double Iterativo(double max){
		double fibo = 0;
		
		for (double i = 1; i < max; i++){
			if (i == 1) fibo = 2;
			if (i == 2) fibo = 3;
			if (i == 3) fibo = 5;
			if (i == 4) fibo = 8;
			if (i == 5) fibo = 13;
			if (i == 6) fibo = 21;
			else
				fibo = fibo + i - 1;				
		}
		
		return fibo;
	}
	
	public static int  Rec(int recibe){
		if (recibe > 10) 
			return recibe;
		return Rec(recibe + 1);
	}

}
