package pract2a;

import java.util.Arrays;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejo v[] = new Complejo[5];
		v[0] = new Complejo(1,5);
		v[1] = new Complejo(10,-3);
		v[2] = new Complejo(-1,4);
		v[3] = new Complejo(8,0);
		v[4] = new Complejo(9,3);
		
		for (Complejo c : v) {
			System.out.println(c.modulo());			
		}
		System.out.println("");
		Arrays.sort(v);
		for (Complejo c : v) {
			System.out.println(c.modulo());			
		}
	}

	
}
