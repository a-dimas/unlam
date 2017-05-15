package enClase;

public class Empleado {
	private String nombre;
	private double sueldo;
	private static int cantEmpleados = 0;
	public Empleado(String n, double s) {
		// TODO Auto-generated constructor stub
		nombre = n;
		sueldo = s;
		cantEmpleados++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Empleado misEmpleados[] = new Empleado[4], em;
			
			misEmpleados[0] = new Empleado("Pedro", 9000);
			em = misEmpleados[0];
			System.out.println(em.dameNombre() + ": $" + em.dameSueldo() + ", num: " + em.dameCuenta());
			
			Jefatura jefeRRHH = new Jefatura("Steve", 35000);
			em = jefeRRHH;
			System.out.println(em.dameNombre() + ": $" + em.dameSueldo() + ", num: " + em.dameCuenta());
			
			misEmpleados[1] = new Empleado ("Dimas", 18700);
			em = misEmpleados[1];
			System.out.println(em.dameNombre() + ": $" + em.dameSueldo() + ", num: " + em.dameCuenta());
			
			misEmpleados[2] = new Empleado ("Maxi", 18700);
			em = misEmpleados[2];
			System.out.println(em.dameNombre() + ": $" + em.dameSueldo() + ", num: " + em.dameCuenta());

			misEmpleados[3] = jefeRRHH;
			em = misEmpleados[3];
			
			System.out.println(em.dameNombre() + ": $" + em.dameSueldo() + ", num: " + em.dameCuenta());
			for (Empleado e : misEmpleados) {
				System.out.println(e.dameNombre() + ": $" + e.dameSueldo() + ", num: " + e.dameCuenta());
				//System.out.println(e.dameSueldo());
			}
			
	}
	
	public int dameCuenta(){
		return cantEmpleados;
	}
	
	public double dameSueldo(){
		return sueldo;
	}
	
	public String dameNombre(){
		return nombre;
	}

}

