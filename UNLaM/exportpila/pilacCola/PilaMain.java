package pilacCola;

public class PilaMain {

	public PilaMain() {
		// TODO Auto-generated constructor stub
		System.out.println("I'm batmaaaaan!");
	}

	
	public static void main(String[] args) {
		int max = 10000;
		PilaEstatica pila = new PilaEstatica(max);
		
		for (int i = 0; i < max; i++){
			pila.push((double) i);
		}
		
		for (int i = 0; i < max; i++){
			System.out.print(pila.pop() + "\t");
			if (i%10 == 0) System.out.println();
		}

	}

}
