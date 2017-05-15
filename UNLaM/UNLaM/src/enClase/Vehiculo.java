package enClase;

public abstract class Vehiculo {


	private Persona chofer;
	private double km;

	public Vehiculo() {

	}
	
	public void AsignarChofer(Persona nuevoChofer){
		chofer = nuevoChofer;
	}
	
	public double reportarKilometraje(){
		return km;
	}
	public String yDondeEstaElPiloto(){
		return chofer.nombre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona motero = new Persona(),  motera = new Persona();
		Persona josé = new Persona(), max = new Persona(), dave = new Persona(), anne = new Persona();
		Persona queVanASubir[]  = new Persona[2];
		queVanASubir[0] = dave; 
		queVanASubir[1] = anne; 
		Moto m = new Moto();
		Bus bus = new Bus(10);
		
		m.AsignarChofer(motero);
		m.SubirAcompañante(motera);
		
		bus.AsignarChofer(josé);
		bus.subirPasajero(max);
		bus.subirPasajeros(queVanASubir);	
		
	}
}
