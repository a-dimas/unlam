package enClase;

public class Moto extends Vehiculo {
	Persona acompañante;
	public Moto() {
		
	}
	
	public void SubirAcompañante(Persona queSube){
		acompañante = queSube;
	}

}
