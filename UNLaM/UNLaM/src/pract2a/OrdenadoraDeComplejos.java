package pract2a;

public class OrdenadoraDeComplejos {

	public OrdenadoraDeComplejos() {
		// TODO Auto-generated constructor stub
	}
	
	public void porModulo(ComplejoParaOrdenar[] cs){
		//agrego modulo
		for (ComplejoParaOrdenar c : cs) {
			c.m = c.c.modulo();
		}
		
		for (ComplejoParaOrdenar c : cs) {
			
		}
		
		for (int i = 0; i < cs.length - 1; i++) {
			ComplejoParaOrdenar min = cs[i];
			
			for (int j = i + 1; j < cs.length; j++)
				if (min.m > cs[j].m)
					min = cs[j];
			
		}
		
	}

}
