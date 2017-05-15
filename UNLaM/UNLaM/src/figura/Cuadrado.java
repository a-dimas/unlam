package figura;

public class Cuadrado extends Geometrica {
	private double lado;
	
	public Cuadrado(int l) {
		// TODO Auto-generated constructor stub
		lado = l;
	}

	public double area (){
		return lado * lado;
	}
	
}
