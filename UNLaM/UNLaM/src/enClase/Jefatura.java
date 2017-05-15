package enClase;

public class Jefatura extends Empleado {
	private double incentivo;
	public Jefatura(String nom, double sueldo) {
		// TODO Auto-generated constructor stub
		super( nom,  sueldo);
		incentivo = 1000;
	}
	
	public double dameSueldo(){
		return super.dameSueldo() + incentivo;
	}

}
