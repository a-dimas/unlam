package enClase;

public class Bus extends Vehiculo {
	Persona[] pasajeros;
	int pasajerosArriba;
	int capacidad;
	
	public Bus(int c) {
		// TODO Auto-generated constructor stub		
		capacidad = c;
		pasajeros = new Persona[capacidad];
	}
	
	public boolean subirPasajero(Persona pasajero){
		int i = getPasajerosArriba(); 
		if (i == getCapacidad()) {
			return false;
		}
		pasajeros[i] = pasajero;
		return true;
		
	}
	
	public boolean subirPasajeros(Persona[] pasajeros){
		int i = getPasajerosArriba();
		try {
			for(Persona pasajero: pasajeros){
				pasajeros[i] = pasajero;
				i++;
			}
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Too many passengers dude");
			e.printStackTrace();
			return false;
		}
	}
	
	public int getCapacidad(){
		return capacidad;
	}
	
	public int getPasajerosArriba(){
		return pasajerosArriba;
	}
	
	public Persona[] getPasajeros(){
		return pasajeros;
	}
	

}
